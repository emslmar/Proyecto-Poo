package TileMap;

//Miriam Paulina Palomera Curiel 	A01635283
//Emiliano Sloth Marroquin A01636165
//https://youtu.be/9dzhgsVaiSo


import java.awt.image.BufferedImage;

public class Tile {
	
	private BufferedImage image;
	private int type;
	
	// tile types
	public static final int NORMAL = 0;
	public static final int BLOCKED = 1;
	
	public Tile(BufferedImage image, int type) {
		this.image = image;
		this.type = type;
	}
	
	public BufferedImage getImage() { return image; }
	public int getType() { return type; }
	
}
