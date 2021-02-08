package minicraft.item.enchanted;

import java.util.ArrayList;
import java.util.Random;

import minicraft.core.Game;
import minicraft.gfx.Sprite;
import minicraft.item.Item;

public class SharpSwordI extends Item{
	public static ArrayList<Item> getAllInstances() {
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new SharpSwordI("Sharp I Sword", new Sprite(2, 18, 0), null));
		items.add(new SharpSwordI("Sharp I Claymore", new Sprite(6, 18, 0), null));
		return items;
	}
	
	private Random random = new Random();
	protected String SharpI;
	private Sprite sprite;
	public int dur;
	public int level;
	
	private SharpSwordI(String title, Sprite sprite, String SharpI)
    {
		super(title, sprite);
		this.SharpI = SharpI;
		this.sprite = sprite;
	}
	
	/** You can attack mobs with tools. */
	public boolean canAttack() {
		return true;
	}
	
	public boolean payDurability() {
		if(dur <= 0) return false;
        if(!Game.isMode("creative")) dur--;
		return true;
	}

	public String getData() {
		return super.getData()+"_"+dur;
	}

	@Override
	public Item clone() {
		SharpSwordI ti = new SharpSwordI(getName(), sprite, SharpI);
		ti.dur = dur;
		return ti;
	}
			
}

