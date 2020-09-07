package minicraft.entity.mob.villager;

import java.util.ArrayList;

import minicraft.core.Game;
import minicraft.entity.Direction;
import minicraft.entity.mob.PassiveMob;
import minicraft.entity.mob.Player;
import minicraft.gfx.Color;
import minicraft.gfx.MobSprite;
import minicraft.item.Recipe;
import minicraft.level.Level;
import minicraft.level.tile.Tile;
import minicraft.screen.CraftingDisplay;
import minicraft.screen.Display;

public class Cleric extends VillagerMob {
	private static MobSprite[][] sprites = MobSprite.compileMobSpriteAnimations(0, 32);
  
  public static ArrayList<Recipe> ClericTrdes = new ArrayList<>();
  
  static {
	  ClericTrdes.add(new Recipe("Emerald_1", new String[] { "Apple_5" }));
	  ClericTrdes.add(new Recipe("Gem_1", new String[] { "Emerald_5" }));
	  ClericTrdes.add(new Recipe("Gold_1", new String[] { "Iron_5" }));
  }
  
  public Cleric() {
		super(sprites);
	}
  
  public void tick() {
    super.tick();
  }
  
  public boolean use(Player player) {
    Game.setMenu(new CraftingDisplay(minicraft.entity.mob.villager.Cleric.ClericTrdes, "Trade", player));
    return true;
  }
  
  public void die() {
    super.die();
  }
}
