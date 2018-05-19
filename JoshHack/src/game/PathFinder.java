package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PathFinder {
    private PathFinderData data = new PathFinderData();

	public PathFinder() {
    	this.data.open = new ArrayList<Point>();
        this.data.closed = new ArrayList<Point>();
        this.data.parents = new HashMap<Point, Point>();
        this.data.totalCost = new HashMap<Point, Integer>();
    }
    
    private int heuristicCost(Point from, Point to) {
        return Math.max(Math.abs(from.x - to.x), Math.abs(from.y - to.y));
    }

    private int costToGetTo(Point from) {
        return data.parents.get(from) == null ? 0 : (1 + costToGetTo(data.parents.get(from)));
    }
    
    private int totalCost(Point from, Point to) {
        if (data.totalCost.containsKey(from))
        	return data.totalCost.get(from);
        
        int cost = costToGetTo(from) + heuristicCost(from, to);
        data.totalCost.put(from, cost);
        return cost;
    }

    private void reParent(Point child, Point parent){
        data.parents.put(child, parent);
        data.totalCost.remove(child);
    }

    public ArrayList<Point> findPath(Creature creature, Point start, Point end, int maxTries) {
        data.open.clear();
        data.closed.clear();
        data.parents.clear();
        data.totalCost.clear();
    	
        data.open.add(start);
        
        for (int tries = 0; tries < maxTries && data.open.size() > 0; tries++){
            Point closest = getClosestPoint(end);
            
            data.open.remove(closest);
            data.closed.add(closest);

            if (closest.equals(end))
                return createPath(start, closest);
            else
                checkNeighbors(creature, end, closest);
        }
        return null;
    }

	private Point getClosestPoint(Point end) {
		Point closest = data.open.get(0);
		for (Point other : data.open){
		    if (totalCost(other, end) < totalCost(closest, end))
		        closest = other;
		}
		return closest;
	}

	private void checkNeighbors(Creature creature, Point end, Point closest) {
		for (Point neighbor : closest.neighbors8()) {
		    if (data.closed.contains(neighbor)
		    		|| !creature.canEnter(neighbor.x, neighbor.y, creature.z)
		    		&& !neighbor.equals(end))
		        continue;
			
		    if (data.open.contains(neighbor))
				reParentNeighborIfNecessary(closest, neighbor);
		    else
		        reParentNeighbor(closest, neighbor);
		}
	}

	private void reParentNeighbor(Point closest, Point neighbor) {
		reParent(neighbor, closest);
		data.open.add(neighbor);
	}

	private void reParentNeighborIfNecessary(Point closest, Point neighbor) {
		Point originalParent = data.parents.get(neighbor);
		double currentCost = costToGetTo(neighbor);
		reParent(neighbor, closest);
		double reparentCost = costToGetTo(neighbor);
		
		if (reparentCost < currentCost)
			data.open.remove(neighbor);
		else
			reParent(neighbor, originalParent);
	}

	private ArrayList<Point> createPath(Point start, Point end) {
		ArrayList<Point> path = new ArrayList<Point>();

		while (!end.equals(start)) {
		    path.add(end);
		    end = data.parents.get(end);
		}

		Collections.reverse(path);
		return path;
	}
}
