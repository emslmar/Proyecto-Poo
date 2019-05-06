
package Main;

//Miriam Paulina Palomera Curiel 	A01635283
//Emiliano Sloth Marroquin A01636165
//https://youtu.be/9dzhgsVaiSo


import javax.swing.JFrame;

public class Game {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Dragon Knigh"
				+ "t");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		
	}
	
}
