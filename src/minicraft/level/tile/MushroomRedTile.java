package minicraft.level.tile;

import minicraft.core.io.Sound;
import minicraft.entity.Direction;
import minicraft.entity.mob.Mob;
import minicraft.entity.mob.Player;
import minicraft.gfx.ConnectorSprite;
import minicraft.gfx.Screen;
import minicraft.gfx.Sprite;
import minicraft.item.Item;
import minicraft.item.Items;
import minicraft.item.ToolItem;
import minicraft.item.ToolType;
import minicraft.level.Level;

public class MushroomRedTile extends Tile {
	private static Sprite flowerSprite = new Sprite(9, 12, 1);
	
	protected MushroomRedTile(String name) {
		super(name, (ConnectorSprite)null);
		connectsToMycelium = true;
		maySpawn = true;
	}

	public void tick(Level level, int xt, int yt) {
		// TODO revise this method.
		if (random.nextInt(30) != 0) return;

		int xn = xt;
		int yn = yt;

		if (random.nextBoolean()) xn += random.nextInt(2) * 2 - 1;
		else yn += random.nextInt(2) * 2 - 1;

		if (level.getTile(xn, yn) == Tiles.get("dirt")) {
			level.setTile(xn, yn, Tiles.get("Mycelium"));
		}
	}
	
	public void render(Screen screen, Level level, int x, int y) {
		Tiles.get("Mycelium").render(screen, level, x, y);
		
		int data = level.getData(x, y);
		int shape = (data / 16) % 2;
		
		x = x << 4;
		y = y << 4;
		
		flowerSprite.render(screen, x + 8*shape, y);
		flowerSprite.render(screen, x + 8*(shape==0?1:0), y + 8);
	}

	public boolean interact(Level level, int x, int y, Player player, Item item, Direction attackDir) {
		if (item instanceof ToolItem) {
			ToolItem tool = (ToolItem) item;
			if (tool.type == ToolType.Shovel) {
				if (player.payStamina(2 - tool.level) && tool.payDurability()) {
					level.setTile(x, y, Tiles.get("Mycelium"));
					Sound.monsterHurt.play();
					level.dropItem(x*16+8, y*16+8, Items.get("Red Mushroom"));
					return true;
				}
			}
		}
		return false;
	}

	public boolean hurt(Level level, int x, int y, Mob source, int dmg, Direction attackDir) {
		level.dropItem(x*16+8, y*16+8, 0, 1, Items.get("Red Mushroom"));
		level.setTile(x, y, Tiles.get("Mycelium"));
		return true;
	}
}

