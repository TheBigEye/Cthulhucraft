package minicraft.item;

public enum ToolType {
	Shovel (0, 85), // if there's a second number, it specifies durability.
	Hoe (1, 71),
	Sword (2, 103),
	Spear (7, 93),
	Pickaxe (3, 89),
	Axe (4, 85),
	Bow (5, 71),
	Claymore (6, 104);

	public final int sprite; // sprite location on the spritesheet
	public final int durability;
	
	ToolType(int sprite, int dur) {
		this.sprite = sprite;
		durability = dur;
	}
	ToolType(int sprite) {
		this(sprite, -1); // durability defualts to -1 if not specified (means infinite durability)
	}
}
