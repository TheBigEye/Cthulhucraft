package minicraft.entity.mob;

import minicraft.core.io.Settings;
import minicraft.gfx.MobSprite;
import minicraft.item.Items;

public class SlimyWizard extends EnemyMob {
	private static MobSprite[][][] sprites;
	static {
		sprites = new MobSprite[4][4][2];
		for (int i = 0; i < 4; i++) {
			MobSprite[][] list  = MobSprite.compileMobSpriteAnimations(16, 20 + (i * 2));
			sprites[i] = list;
		}
	}
	
	/**
	 * Creates a Slimy wizard of the given level.
	 * @param lvl Boss level.
	 */
	public SlimyWizard(int lvl) {
		super(lvl, sprites, 5, 100);
	}
	
	@Override
	public void tick() {
		super.tick();
		
		Player player = getClosestPlayer();
		if (player != null && player != null) { // checks if player is on zombies level and if there is no time left on randonimity timer
			int xd = player.x - x;
			int yd = player.y - y;
				/// if player is less than 6.25 tiles away, then set move dir towards player
				int sig0 = 1; // this prevents too precise estimates, preventing mobs from bobbing up and down.
				xa = ya = 0;
				if (xd < sig0) xa = -1;
				if (xd > sig0) xa = +1;
				if (yd < sig0) ya = -1;
				if (yd > sig0) ya = +1;
			} else {
				// if the enemy was following the player, but has now lost it, it stops moving.
					//*that would be nice, but I'll just make it move randomly instead.
				randomizeWalkDir(false);
			}
		
	}
	
	public void die() {
		if (Settings.get("diff").equals("Easy")) dropItem(2, 10, Items.get("slime"));
		if (Settings.get("diff").equals("Normal")) dropItem(2, 10, Items.get("slime"));
		if (Settings.get("diff").equals("Hard")) dropItem(1, 10, Items.get("slime"));
		
		if(random.nextInt(60) == 2) {
			level.dropItem(x, y, Items.get("Sticky essence"));
		}
		
		if(random.nextInt(40) == 19) {
			int rand = random.nextInt(3);
			if(rand == 0) {
				level.dropItem(x, y, Items.get("green clothes"));
			} else if(rand == 1) {
				level.dropItem(x, y, Items.get("green clothes"));
			} else if(rand == 2) {
				level.dropItem(x, y, Items.get("slime"));
			}
		}
		
		super.die();
	}
}

