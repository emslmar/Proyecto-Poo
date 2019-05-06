package Entity;

//Miriam Paulina Palomera Curiel 	A01635283
//Emiliano Sloth Marroquin A01636165
//https://youtu.be/9dzhgsVaiSo


import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class HUD {
	
	private Player player;
	
	private BufferedImage image;
	private Font font;
	
	public HUD(Player p) {
		player = p;
		try {
			image = ImageIO.read(
				getClass().getResourceAsStream(
					"/HUD/hud.gif"
				)
			);
			font = new Font("Arial", Font.PLAIN, 14);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void draw(Graphics2D g) {
		
		g.drawImage(image, 0, 10, null);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString(
			player.getHealth() + "/" + player.getMaxHealth(),
			30,
			25
		);
		g.drawString(
			player.getFire() / 100 + "/" + player.getMaxFire() / 100,
			30,
			45
		);
		
		if(player.getHealth() <= 0) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 320, 240);
			g.setColor(Color.WHITE);
			g.setFont(new Font("arial", Font.BOLD,50));
			g.drawString("Game Over", 20, 120);
		}
		
	}
	
}













