package minicraft.item.enchanted;

import minicraft.core.Game;
import minicraft.gfx.Sprite;
import minicraft.item.Item;

import java.util.ArrayList;

public class SharpSwordIII extends Item {
    public static ArrayList<Item> getAllInstances() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new SharpSwordIII("Sharp III Sword", new Sprite(2, 18, 0), null));
        items.add(new SharpSwordIII("Sharp III Claymore", new Sprite(6, 18, 0), null));
        return items;
    }

    protected String SharpIII;
    private Sprite sprite;
    public int dur;

    private SharpSwordIII(String title, Sprite sprite, String SharpIII) {
        super(title, sprite);
        this.SharpIII = SharpIII;
        this.sprite = sprite;
    }

    /**
     * You can attack mobs with tools.
     */
    public boolean canAttack() {
        return true;
    }

    public boolean payDurability() {
        if (dur <= 0) return false;
        if (!Game.isMode("creative")) dur--;
        return true;
    }

    public String getData() {
        return super.getData() + "_" + dur;
    }

    @Override
    public Item clone() {
        SharpSwordIII ti = new SharpSwordIII(getName(), sprite, SharpIII);
        ti.dur = dur;
        return ti;
    }

}
