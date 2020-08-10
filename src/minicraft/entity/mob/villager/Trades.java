package minicraft.entity.mob.villager;

import java.util.ArrayList;

import minicraft.item.Recipe;

public class Trades {
	public static final ArrayList<Recipe> ClericTrades = new ArrayList<>();
	
	static {
	    ClericTrades.add(new Recipe("Book_3", "Paper_3"));
	    ClericTrades.add(new Recipe("Paper_3", "Book_3"));
	    ClericTrades.add(new Recipe("emerald_6", "Gold_3"));
	    ClericTrades.add(new Recipe("Gold_3", "emerald_6"));
	    ClericTrades.add(new Recipe("Grass Seeds_3", "Flower_1"));
	    ClericTrades.add(new Recipe("Seeds_3", "Flower_1"));
		
	}
}
