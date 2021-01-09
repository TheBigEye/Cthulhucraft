package minicraft.screen;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import minicraft.core.Game;
import minicraft.core.io.Settings;
import minicraft.gfx.Color;
import minicraft.gfx.Font;
import minicraft.gfx.Screen;
import minicraft.screen.entry.BlankEntry;
import minicraft.screen.entry.SelectEntry;
import minicraft.screen.WorldSelectDisplay;

public class WorldInfoDisplay extends Display {
	
	
	public WorldInfoDisplay() {
		super(true, new Menu.Builder(false, 6, RelPos.LEFT,
				new BlankEntry(),
				new BlankEntry(),
				new BlankEntry(),
				new BlankEntry(),
				new BlankEntry(),
				new BlankEntry(),
				Settings.getEntry("mode"),
				new SelectEntry("Open World Folder", () -> {
	                try {
	                  Desktop.getDesktop().open(new File(Game.gameDir + "/saves/" + WorldSelectDisplay.getWorldName()));
	                } catch (IOException e) {
	                  e.printStackTrace();
	                } 
	                
	              }),
				
				new BlankEntry(),
				new BlankEntry(),
				new BlankEntry()

			)
			.setTitle("World")
			.createMenu()
		);
	}
	public void render(Screen screen) {
		super.render(screen);
		Font.drawCentered("Name: "+WorldSelectDisplay.getWorldName() + "", screen, Screen.h - 150, Color.GREEN);
		
		Font.draw(Settings.getEntry("mode")+"", screen, Screen.w - 232, Screen.h - 130, Color.GRAY);		
		Font.draw(Settings.getEntry("size")+"", screen, Screen.w - 232, Screen.h - 120, Color.GRAY);		
		Font.draw(Settings.getEntry("theme")+"", screen, Screen.w - 232, Screen.h - 110, Color.GRAY);
		Font.draw(Settings.getEntry("type")+"", screen, Screen.w - 232, Screen.h - 100, Color.GRAY);
		
	}

	
	@Override
	public void onExit() {

	}
}
