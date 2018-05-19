package game;

import java.util.ArrayList;
import java.util.HashMap;

public class PathFinderData {
	public ArrayList<Point> open;
	public ArrayList<Point> closed;
	public HashMap<Point, Point> parents;
	public HashMap<Point, Integer> totalCost;

	public PathFinderData() {
	}
}