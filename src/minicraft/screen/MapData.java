package minicraft.screen;

import minicraft.gfx.Color;
import minicraft.level.tile.Tiles;

public enum MapData {
	
	GRASS(Tiles.get("Grass").id, Color.get(1, 58, 198, 30)),
	MYCELIUM(Tiles.get("Mycelium").id, Color.get(1, 89, 86, 86)),
    LAWN(Tiles.get("Lawn").id, Color.get(1, 57, 191, 30)),
    DIRT(Tiles.get("Dirt").id, Color.get(1, 132, 116, 0)),
    FLOWER(Tiles.get("Flower").id, Color.YELLOW),
    HOLE(Tiles.get("Hole").id, Color.get(1, 61, 47, 8)),
    WATER(Tiles.get("Water").id, Color.get(1, 0, 178, 240)),
    LAVA(Tiles.get("Lava").id, Color.RED),
    ROCK(Tiles.get("Rock").id, Color.get(1, 145, 143, 122)),
    HARD_ROCK(Tiles.get("Hard Rock").id, Color.get(1, 127, 126, 107)),
    CACTUS(Tiles.get("Cactus").id, Color.GREEN),
    TREE(Tiles.get("Tree").id, Color.get(1, 0, 113, 0)),
    FIR_TREE(Tiles.get("Fir Tree").id, Color.get(1, 19, 139, 98)),
    PINE_TREE(Tiles.get("Pine Tree").id, Color.get(1, 17, 127, 89)),
    //GIANT_RED_MUSHROOM(Tiles.get("Giant Red Mushroom").id, Color.get(1, 209, 20, 10)),
    //GIANT_BROWN_MUSHROOM(Tiles.get("Giant Brown Mushroom").id, Color.get(1, 175, 122, 96)),
    SAND(Tiles.get("Sand").id, Color.get(1, 232, 201, 0)),
    SNOW(Tiles.get("Snow").id, Color.get(1, 240, 240, 240)),
    STAIRS_UP(Tiles.get("Stairs Up").id, 0xffffff),
    STAIRS_DOWN(Tiles.get("Stairs Down").id, 0xffffff),
    WOOD_FLOOR(Tiles.get("Wood Planks").id, Color.get(1, 145, 79, 14)),
    WOOD_WALL(Tiles.get("Wood Wall").id, Color.get(1, 122, 67, 12)),
    WOOD_DOOR(Tiles.get("Wood Door").id, Color.get(1, 122, 72, 23)),
    STONE_FLOOR(Tiles.get("Stone Bricks").id, Color.get(1, 163, 163, 163)),
    STONE_WALL(Tiles.get("Stone Wall").id, Color.get(1, 99, 99, 99)),
    STONE_DOOR(Tiles.get("Stone Door").id, Color.get(1, 119, 119, 119)),
    OBSIDIAN_FLOOR(Tiles.get("Obsidian").id, Color.get(1, 76, 30, 100)),
    OBSIDIAN_WALL(Tiles.get("Obsidian Wall").id, Color.get(1, 46, 24, 118)),
    OBSIDIAN_DOOR(Tiles.get("Obsidian Door").id, Color.get(1, 44, 21, 67)),
    
    WOOL(Tiles.get("Wool").id, Color.get(1, 239, 239, 236)),
    BLACK_WOOL(Tiles.get("Black Wool").id, Color.get(1, 23, 19, 18)),
    YELLOW_WOOL(Tiles.get("Yellow Wool").id, Color.get(1, 186, 175, 49)),
    GREEN_WOOL(Tiles.get("Green Wool").id, Color.get(1, 71, 178, 59)),
    BLUE_WOOL(Tiles.get("Blue Wool").id, Color.get(1, 51, 75, 160)),
    RED_WOOL(Tiles.get("Red Wool").id, Color.get(1, 146, 48, 47)),
    PURPLE_WOOL(Tiles.get("Purple Wool").id, Color.get(1, 127, 63, 180)),
    PINK_WOOL(Tiles.get("Pink Wool").id, Color.get(1, 224, 175, 198)),
    DARK_GREEN_WOOL(Tiles.get("Dark Green Wool").id, Color.get(1, 53, 70, 29)),
    BROWN_WOOL(Tiles.get("Brown Wool").id, Color.get(1, 91, 56, 36)),
    MAGENTA_WOOL(Tiles.get("Magenta Wool").id, Color.get(1, 184, 87, 194)),
    LIGHT_BLUE_WOOL(Tiles.get("Light Blue Wool").id, Color.get(1, 111, 155, 220)),
    CYAN_WOOL(Tiles.get("Cyan Wool").id, Color.get(1, 48, 114, 138)),
    ORANGE_WOOL(Tiles.get("Orange Wool").id, Color.get(1, 229, 110, 71)),
    
    FARMLAND(Tiles.get("Farmland").id, Color.get(1, 145, 75, 75)),
    WHEAT(Tiles.get("Wheat").id, Color.get(1, 226, 226, 111)),
    INFINITE_FALL(Tiles.get("Infinite Fall").id, Color.get(1, 0, 87, 122)),
    CLOUD(Tiles.get("cloud").id, Color.WHITE),
    CLOUD_CACTUS(Tiles.get("Cloud Cactus").id, Color.GREEN);
    
    
    public int tileID;
    public int color;

    MapData(int id, int color) {
        tileID = id;
        this.color = color;
    }

}
	
