package minicraft.item;

import java.util.ArrayList;

import minicraft.core.Game;
import minicraft.core.World;
import minicraft.entity.Direction;
import minicraft.entity.mob.Player;
import minicraft.gfx.Sprite;
import minicraft.level.Level;
import minicraft.level.tile.Tile;
import minicraft.screen.BookData;
import minicraft.screen.BookDisplay;

public class BookItem extends Item {
	
	protected static ArrayList<Item> getAllInstances() {
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new BookItem("Book", new Sprite(0, 8, 0), null));
		items.add(new BookItem("Antidious", new Sprite(1, 8, 0), BookData.antVenomBook, true));
		items.add(new BookItem("Necronomicon", new Sprite(5, 8, 0), BookData.NecroBook, true));
		return items;
	}
	
	protected String book; // TODO this is not saved yet; it could be, for editable books.
	public final boolean hasTitlePage;
	private Sprite sprite;
	
	private BookItem(String title, Sprite sprite, String book) { this(title, sprite, book, false); }
	private BookItem(String title, Sprite sprite, String book, boolean hasTitlePage) {
		super(title, sprite);
		this.book = book;
		this.hasTitlePage = hasTitlePage;
		this.sprite = sprite;
	}
	
	public boolean interactOn(Tile tile, Level level, int xt, int yt, Player player, Direction attackDir) {
		Game.setMenu(new BookDisplay(book, hasTitlePage));
		//level.add(new Cthulhu(1), player.x, player.y);
		int playerDepth = player.getLevel().depth;
		
		if(playerDepth == 1) {
			if(!Game.isValidServer()) {
				// player is in overworld
				String note = "You can't escape from here!";
				Game.notifications.add(note);
			}
			return false;
		}
		
		int depthDiff = playerDepth > 0 ? 1 : -1;
		
		World.scheduleLevelChange(depthDiff, () -> {
			Level plevel = World.levels[World.lvlIdx(playerDepth + depthDiff)];
			if(plevel != null && !plevel.getTile(player.x >> 4, player.y >> 4).mayPass(plevel, player.x >> 4, player.y >> 4, player))
				player.findStartPos(plevel, false);
		});
		return true;
	}
	
	@Override
	public boolean interactsWithWorld() { return false; }
	
	public BookItem clone() {
		return new BookItem(getName(), sprite, book, hasTitlePage);
	}
}
