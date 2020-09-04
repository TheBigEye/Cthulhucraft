package minicraft.screen;

import minicraft.gfx.Color;
import minicraft.level.tile.Tiles;

public enum MapData {
	
    GRASS(Tiles.get("Grass").id, 430),
    LAWN(Tiles.get("Lawn").id, 430),
    DIRT(Tiles.get("Dirt").id, 540),
    FLOWER(Tiles.get("Flower").id, 430),
    HOLE(Tiles.get("Hole").id, 430),
    WATER(Tiles.get("Water").id, 540),
    LAVA(Tiles.get("Lava").id, 5),
    ROCK(Tiles.get("Rock").id, 430),
    HARD_ROCK(Tiles.get("Hard Rock").id, 430),
    TREE(Tiles.get("Tree").id, 430),
    SAND(Tiles.get("Sand").id, 430),
    SNOW(Tiles.get("Snow").id, 430),
    STAIRS_UP(Tiles.get("Stairs Up").id, 0xffffff),
    STAIRS_DOWN(Tiles.get("Stairs Down").id, 0xffffff),
    WOOD_FLOOR(Tiles.get("Wood Planks").id, 540),
    WOOD_WALL(Tiles.get("Wood Wall").id, 430),
    WOOD_DOOR(Tiles.get("Wood Door").id, 541),
    STONE_FLOOR(Tiles.get("Stone Bricks").id, 430),
    STONE_WALL(Tiles.get("Stone Wall").id, 555),
    STONE_DOOR(Tiles.get("Stone Door").id, 555),
    OBSIDIAN_FLOOR(Tiles.get("Obsidian").id, 203),
    OBSIDIAN_WALL(Tiles.get("Obsidian Wall").id, 304),
    OBSIDIAN_DOOR(Tiles.get("Obsidian Door").id, 304),
    WOOL(Tiles.get("Wool").id, 555), // Yes I know woolColor isn't taken into account
    FARMLAND(Tiles.get("Farmland").id, 422),
    WHEAT(Tiles.get("Wheat").id, 350),
    INFINITE_FALL(Tiles.get("Infinite Fall").id, 540),
    CLOUD(Tiles.get("cloud").id, 225),
    CLOUD_CACTUS(Tiles.get("Cloud Cactus").id, 255);
    
    
    public int tileID;
    public int color;

    MapData(int id, int color) {
        tileID = id;
        this.color = color;
    }

}
	
