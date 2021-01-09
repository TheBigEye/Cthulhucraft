package minicraft.entity.mob;

import minicraft.core.io.Settings;
import minicraft.gfx.MobSprite;
import minicraft.gfx.Screen;

public class Cthulhu extends EnemyMob {
    private static final MobSprite[][][] sprites = new MobSprite[2][2][2];

    static {
        sprites[0][0][0] = new MobSprite(52, 0, 12, 8, 0);
    }

    public Cthulhu(int lvl) {
    	super(5, sprites, 9, 200);
    }

	public void tick() {
		super.tick();
		
		if (random.nextInt(2000)==1) {
			getLevel().add(new Slime(0), x, y + 5);
			getLevel().add(new Slime(0), x, y - 5);
			getLevel().add(new Slime(0), x + 5, y);
			getLevel().add(new Slime(0), x - 5, y);
		}
		
		Player player = getClosestPlayer();
		if (player != null) { // checks if player is on zombies level and if there is no time left on randonimity timer
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
		
    
    @Override
    public void render(Screen screen) {
        sprites[0][0][0].render(screen, x - 50, y - 38);

	/*	int textcol = Color.get(-1, Color.rgb(255, 0, 0));
		int textcol2 = Color.get(-1, Color.rgb(200, 0, 0));
		String h = health + "/" + maxHealth;
		
    	int textwidth = Font.textWidth(h);
    	Font.draw(h, screen, (x - textwidth/2) + 1, y -40, textcol2);
    	Font.draw(h, screen, (x - textwidth/2), y -41, textcol);
    	*/
    }
	
    public boolean canSwim() {
		return true;
	}

    
	public void die() {
		int min = 0, max = 0;
		if (Settings.get("diff").equals("Easy")) {min = 1; max = 3;}
		if (Settings.get("diff").equals("Normal")) {min = 1; max = 2;}
		if (Settings.get("diff").equals("Hard")) {min = 0; max = 2;}
		
		super.die();
	}

}
