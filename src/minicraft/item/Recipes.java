package minicraft.item;

import java.util.ArrayList;

public class Recipes {
	
	public static final ArrayList<Recipe> anvilRecipes = new ArrayList<>();
	public static final ArrayList<Recipe> ovenRecipes = new ArrayList<>();
	public static final ArrayList<Recipe> furnaceRecipes = new ArrayList<>();
	public static final ArrayList<Recipe> workbenchRecipes = new ArrayList<>();
	public static final ArrayList<Recipe> enchantRecipes = new ArrayList<>();
	public static final ArrayList<Recipe> craftRecipes = new ArrayList<>();
	public static final ArrayList<Recipe> loomRecipes = new ArrayList<>();
	public static final ArrayList<Recipe> assemblerRecipes = new ArrayList<>();
	public static final ArrayList<Recipe> stonecutterRecipes = new ArrayList<>();
	public static final ArrayList<Recipe> breweryRecipes = new ArrayList<>();
	
	static {
		craftRecipes.add(new Recipe("Workbench_1", "Wood_4"));
		//craftRecipes.add(new Recipe("Workbench_1", "Spruce Wood_4"));
		//craftRecipes.add(new Recipe("Workbench_1", "Birch Wood_4"));
		craftRecipes.add(new Recipe("Stick_4", "Wood_2"));
		//craftRecipes.add(new Recipe("Stick_4", "Spruce Wood_2"));
		//craftRecipes.add(new Recipe("Stick_4", "Birch Wood_2"));
		craftRecipes.add(new Recipe("Torch_4", "Stick_2", "coal_1"));
		craftRecipes.add(new Recipe("Grass Seeds_1", "seeds_1", "Flower_2"));
		craftRecipes.add(new Recipe("Bone powder_3", "bone_1"));
		craftRecipes.add(new Recipe("plank_2", "Wood_1"));
		craftRecipes.add(new Recipe("Plank Wall_1", "plank_3"));
		craftRecipes.add(new Recipe("Wood Door_1", "plank_5"));
		
		craftRecipes.add(new Recipe("Spruce plank_2", "Spruce Wood_1"));
		craftRecipes.add(new Recipe("Spruce Wall_1", "Spruce plank_3"));
		craftRecipes.add(new Recipe("Spruce Door_1", "Spruce plank_5"));
		
		craftRecipes.add(new Recipe("Birch plank_2", "Birch Wood_1"));
		craftRecipes.add(new Recipe("Birch Wall_1", "Birch plank_3"));
		craftRecipes.add(new Recipe("Birch Door_1", "Birch plank_5"));
		
		workbenchRecipes.add(new Recipe("Torch_4", "Stick_2", "coal_1"));
		workbenchRecipes.add(new Recipe("Lantern_1", "Wood_8", "slime_4", "glass_3"));
		workbenchRecipes.add(new Recipe("Paper_3", "Leaf_3", "Wood_3"));
		workbenchRecipes.add(new Recipe("Book_1", "Leather_5", "Paper_5"));
		workbenchRecipes.add(new Recipe("Map book_1", "Book_10", "Paper_5", "Lapis_2"));
		workbenchRecipes.add(new Recipe("Boat_1", "Wood_30", "Leather_5", "Wood Shovel_2"));
		workbenchRecipes.add(new Recipe("Bowl_3", "Wood_15"));
		workbenchRecipes.add(new Recipe("Stone Brick_2", "Stone_2"));
		workbenchRecipes.add(new Recipe("Stone Wall_1", "Stone Brick_3"));
		workbenchRecipes.add(new Recipe("Stone Door_1", "Stone Brick_5"));
		workbenchRecipes.add(new Recipe("Obsidian Wall_1", "Obsidian Brick_3"));
		workbenchRecipes.add(new Recipe("Obsidian Door_1", "Obsidian Brick_5"));
		workbenchRecipes.add(new Recipe("Oven_1", "Stone_15"));
		workbenchRecipes.add(new Recipe("Furnace_1", "Stone_20"));
		workbenchRecipes.add(new Recipe("Enchanter_1", "Wood_5", "String_2", "Lapis_10"));
		workbenchRecipes.add(new Recipe("Chest_1", "Wood_20"));
		workbenchRecipes.add(new Recipe("Anvil_1", "iron_5"));
		workbenchRecipes.add(new Recipe("Tnt_1", "Gunpowder_10", "Sand_8"));
		workbenchRecipes.add(new Recipe("Loom_1", "Wood_10", "Wool_5"));
		workbenchRecipes.add(new Recipe("Wood Fishing Rod_1", "Wood_10", "String_3"));
		workbenchRecipes.add(new Recipe("Iron Fishing Rod_1", "Iron_10", "String_3"));
		workbenchRecipes.add(new Recipe("Gold Fishing Rod_1", "Gold_10", "String_3"));
		workbenchRecipes.add(new Recipe("Gem Fishing Rod_1", "Gem_10", "String_3"));

		loomRecipes.add(new Recipe("red dye_1", "rose_1"));
		loomRecipes.add(new Recipe("green dye_1", "Cactus_1"));
		loomRecipes.add(new Recipe("yellow dye_1", "Flower_1"));
		loomRecipes.add(new Recipe("pink dye_1", "red dye_1", "Bone powder_1"));
		loomRecipes.add(new Recipe("dark green dye_1", "green dye_1", "Ink sac_1"));
		loomRecipes.add(new Recipe("orange dye_1", "Orange tulip_1"));
		loomRecipes.add(new Recipe("purple dye_1", "Lapis_1", "Ink sac_1"));
		
		loomRecipes.add(new Recipe("String_3", "Wool_1"));
		loomRecipes.add(new Recipe("Wool_1", "String_3"));
		loomRecipes.add(new Recipe("black wool_1", "Wool_1", "Ink sac_1"));
		loomRecipes.add(new Recipe("yellow wool_1", "Wool_1", "yellow dye_1"));
		loomRecipes.add(new Recipe("green wool_1", "Wool_1", "green dye_1"));
		loomRecipes.add(new Recipe("blue wool_1", "Wool_1", "Lapis_1"));
		loomRecipes.add(new Recipe("red wool_1", "Wool_1", "red dye_1"));
		loomRecipes.add(new Recipe("purple wool_1", "Wool_1", "purple dye_1"));
		loomRecipes.add(new Recipe("pink wool_1", "Wool_1", "pink dye_1"));
		loomRecipes.add(new Recipe("dark green wool_1", "Wool_1", "dark green dye_1"));
		loomRecipes.add(new Recipe("gray wool_1", "Wool_1", "Ink sac_1", "Bone powder_1"));
		loomRecipes.add(new Recipe("red wool_1", "Wool_1", "red dye_1"));

		loomRecipes.add(new Recipe("Bed_1", "Wood_5", "Wool_3"));
		
		loomRecipes.add(new Recipe("blue clothes_1", "cloth_5", "Lapis_1"));
		loomRecipes.add(new Recipe("green clothes_1", "cloth_5", "Cactus_1"));
		loomRecipes.add(new Recipe("yellow clothes_1", "cloth_5", "Flower_1"));
		loomRecipes.add(new Recipe("black clothes_1", "cloth_5", "coal_1"));
		loomRecipes.add(new Recipe("orange clothes_1", "cloth_5", "rose_1", "Flower_1"));
		loomRecipes.add(new Recipe("purple clothes_1", "cloth_5", "Lapis_1", "rose_1"));
		loomRecipes.add(new Recipe("cyan clothes_1", "cloth_5", "Lapis_1", "Cactus_1"));
		loomRecipes.add(new Recipe("reg clothes_1", "cloth_5"));
		
		workbenchRecipes.add(new Recipe("Wood Sword_1", "Stick_1", "Wood_2"));
		workbenchRecipes.add(new Recipe("Wood Spear_1", "Stick_1", "Flint_2", "Wood_3"));
		workbenchRecipes.add(new Recipe("Wood Axe_1", "Stick_2", "Wood_3"));
		workbenchRecipes.add(new Recipe("Wood Hoe_1", "Stick_2", "Wood_2"));
		workbenchRecipes.add(new Recipe("Wood Pickaxe_1", "Stick_2", "Wood_3"));
		workbenchRecipes.add(new Recipe("Wood Shovel_1", "Stick_2", "Wood_1"));
		workbenchRecipes.add(new Recipe("Wood Bow_1", "Stick_3", "string_3"));
		workbenchRecipes.add(new Recipe("Rock Sword_1", "Stick_1", "Stone_2"));
		workbenchRecipes.add(new Recipe("Rock Spear_1", "Stick_1", "Stone_2", "Wood Spear_1"));
		workbenchRecipes.add(new Recipe("Rock Axe_1", "Stick_2", "Stone_3"));
		workbenchRecipes.add(new Recipe("Rock Hoe_1", "Stick_2", "Stone_2"));
		workbenchRecipes.add(new Recipe("Rock Pickaxe_1", "Stick_2", "Stone_3"));
		workbenchRecipes.add(new Recipe("Rock Shovel_1", "Stick_2", "Stone_1"));
		workbenchRecipes.add(new Recipe("Rock Bow_1", "Stick_3", "Stone_3", "string_3"));
		
		workbenchRecipes.add(new Recipe("arrow_3", "Stick_1", "Stone_2"));
		workbenchRecipes.add(new Recipe("Leather Armor_1", "leather_10"));
		workbenchRecipes.add(new Recipe("Snake Armor_1", "scale_15"));
		
		loomRecipes.add(new Recipe("Leather Armor_1", "leather_10"));
		
		anvilRecipes.add(new Recipe("Assembler_1", "iron_5", "Stone_10"));
		anvilRecipes.add(new Recipe("Iron Armor_1", "iron_10"));
		anvilRecipes.add(new Recipe("Gold Armor_1", "gold_10"));
		anvilRecipes.add(new Recipe("Gem Armor_1", "gem_65"));
		anvilRecipes.add(new Recipe("Prot I Armor_1", "Protection I_1", "Gem Armor_1"));
		anvilRecipes.add(new Recipe("Prot II Armor_1", "Protection II_1", "Gem Armor_1"));
		anvilRecipes.add(new Recipe("Prot III Armor_1", "Protection III_1", "Gem Armor_1"));
		anvilRecipes.add(new Recipe("Empty Bucket_1", "iron_5"));
		anvilRecipes.add(new Recipe("Iron Lantern_1", "iron_8", "slime_5", "glass_4"));
		anvilRecipes.add(new Recipe("Gold Lantern_1", "gold_10", "slime_5", "glass_4"));
		anvilRecipes.add(new Recipe("Iron Sword_1", "Stick_1", "iron_2"));
		anvilRecipes.add(new Recipe("Iron Spear_1", "Stick_1", "iron_2", "Rock Spear_1"));
		anvilRecipes.add(new Recipe("Iron Claymore_1", "Iron Sword_1", "shard_15"));
		anvilRecipes.add(new Recipe("Iron Axe_1", "Stick_2", "iron_5"));
		anvilRecipes.add(new Recipe("Iron Hoe_1", "Stick_2", "iron_5"));
		anvilRecipes.add(new Recipe("Iron Pickaxe_1", "Stick_2", "iron_5"));
		anvilRecipes.add(new Recipe("Iron Shovel_1", "Stick_2", "iron_5"));
		anvilRecipes.add(new Recipe("Iron Bow_1", "Stick_3", "iron_5", "string_3"));
		anvilRecipes.add(new Recipe("Gold Sword_1", "Stick_1", "gold_2"));
		anvilRecipes.add(new Recipe("Gold Spear_1", "Stick_1", "gold_2", "Iron Spear_1"));
		anvilRecipes.add(new Recipe("Gold Claymore_1", "Gold Sword_1", "shard_15"));
		anvilRecipes.add(new Recipe("Gold Axe_1", "Stick_2", "gold_5"));
		anvilRecipes.add(new Recipe("Gold Hoe_1", "Stick_2", "gold_5"));
		anvilRecipes.add(new Recipe("Gold Pickaxe_1", "Stick_2", "gold_5"));
		anvilRecipes.add(new Recipe("Gold Shovel_1", "Stick_2", "gold_5"));
		anvilRecipes.add(new Recipe("Gold Bow_1", "Stick_3", "gold_5", "string_3"));
		anvilRecipes.add(new Recipe("Gem Sword_1", "Stick_4", "gem_50"));
		anvilRecipes.add(new Recipe("Gem Spear_1", "Stick_4", "gem_40", "Gold Spear_2"));
		anvilRecipes.add(new Recipe("Gem Claymore_1", "Gem Sword_1", "shard_15"));
		anvilRecipes.add(new Recipe("Gem Axe_1", "Stick_4", "gem_50"));
		anvilRecipes.add(new Recipe("Gem Hoe_1", "Stick_4", "gem_50"));
		anvilRecipes.add(new Recipe("Gem Pickaxe_1", "Stick_4", "gem_50"));
		anvilRecipes.add(new Recipe("Gem Shovel_1", "Stick_4", "gem_50"));
		anvilRecipes.add(new Recipe("Gem Bow_1", "Stick_6", "gem_50", "string_3"));	
		anvilRecipes.add(new Recipe("Sharp I Sword_1", "Sharp I_1", "Gold Sword_1"));
		anvilRecipes.add(new Recipe("Sharp I Claymore_1", "Sharp I_1", "Gold Claymore_1"));
		anvilRecipes.add(new Recipe("Sharp II Sword_1", "Sharp II_1", "Gold Sword_1"));
		anvilRecipes.add(new Recipe("Sharp II Claymore_1", "Sharp II_1", "Gold Claymore_1"));

		
		furnaceRecipes.add(new Recipe("iron_1", "iron Ore_4", "coal_1"));
		furnaceRecipes.add(new Recipe("gold_1", "gold Ore_4", "coal_1"));
		furnaceRecipes.add(new Recipe("glass_1", "sand_4", "coal_1"));
		furnaceRecipes.add(new Recipe("Flint_1", "stone_10", "coal_1"));
		
		ovenRecipes.add(new Recipe("cooked pork_1", "raw pork_1", "coal_1"));
		ovenRecipes.add(new Recipe("steak_1", "raw beef_1", "coal_1"));
		ovenRecipes.add(new Recipe("cooked fish_1", "raw fish_1", "coal_1"));
		ovenRecipes.add(new Recipe("bread_1", "wheat_4"));
		ovenRecipes.add(new Recipe("cooked chicken_1", "raw chicken_1", "coal_1"));
		ovenRecipes.add(new Recipe("Mushroom Soup_3", "Bowl_3", "Red Mushroom_3", "Brown Mushroom_3"));
		ovenRecipes.add(new Recipe("Carrot Soup_3", "Bowl_3", "Carrot_3"));
		
		enchantRecipes.add(new Recipe("Gold Apple_1", "apple_1", "gold_8"));
		enchantRecipes.add(new Recipe("potion_1", "glass_1", "Lapis_3"));
		enchantRecipes.add(new Recipe("speed potion_1", "potion_1", "Cactus_5"));
		enchantRecipes.add(new Recipe("light potion_1", "potion_1", "slime_5"));
		enchantRecipes.add(new Recipe("swim potion_1", "potion_1", "raw fish_5"));
		enchantRecipes.add(new Recipe("haste potion_1", "potion_1", "Wood_5", "Stone_5"));
		enchantRecipes.add(new Recipe("lava potion_1", "potion_1", "Lava Bucket_1"));
		enchantRecipes.add(new Recipe("energy potion_1", "potion_1", "gem_25"));
		enchantRecipes.add(new Recipe("regen potion_1", "potion_1", "Gold Apple_1"));
		enchantRecipes.add(new Recipe("Health Potion_1", "potion_1", "GunPowder_2", "Leather Armor_1"));
		enchantRecipes.add(new Recipe("Escape Potion_1", "potion_1", "GunPowder_3", "Lapis_7"));
		
		assemblerRecipes.add(new Recipe("Stonecutter_1", "Gear_3", "Stone_10", "iron_1"));
		assemblerRecipes.add(new Recipe("Brewery_1", "glass_10", "Stone_10", "iron_3"));
		
		stonecutterRecipes.add(new Recipe("Flint_3", "Stone_3", "coal_1"));
		stonecutterRecipes.add(new Recipe("Andesite_3", "Stone_3", "coal_1"));
		stonecutterRecipes.add(new Recipe("Diorite_3", "Stone_3", "coal_1"));
		stonecutterRecipes.add(new Recipe("Granite_3", "Stone_3", "coal_1"));
		stonecutterRecipes.add(new Recipe("Silicon_3", "Stone_3", "coal_1"));
		stonecutterRecipes.add(new Recipe("Basalt_3", "Stone_3", "coal_1"));
		stonecutterRecipes.add(new Recipe("Quartzite_3", "Stone_3", "coal_1"));
		stonecutterRecipes.add(new Recipe("Flint_3", "Stone_3", "coal_1"));
		
		breweryRecipes.add(new Recipe("xSpeed Potion_1", "speed potion_2", "coal_5"));
		breweryRecipes.add(new Recipe("xLight Potion_1", "light potion_2", "coal_5"));
		breweryRecipes.add(new Recipe("xSwim Potion_1", "swim potion_2", "coal_5"));
		breweryRecipes.add(new Recipe("xLava Potion_1", "lava potion_2", "coal_5"));
		breweryRecipes.add(new Recipe("xEnergy Potion_1", "energy potion_2", "coal_5"));
		breweryRecipes.add(new Recipe("xRegen Potion_1", "regen potion_2", "coal_5"));
		breweryRecipes.add(new Recipe("xHealth Potion_1", "health potion_2", "coal_5"));
		
		
		
	}

}
