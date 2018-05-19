package game;

import ui.InventoryBasedScreen;
import ui.Screen;

public class EatScreen extends InventoryBasedScreen {

	public EatScreen(Creature player) {
		super(player);
	}

	@Override
	public String getVerb() {
		return "eat";
	}

	@Override
	public boolean isAcceptable(Item item) {
		return item.foodValue() != 0;
	}

	@Override
	public Screen use(Item item) {
		player.eat(item);
		return null;
	}
}
