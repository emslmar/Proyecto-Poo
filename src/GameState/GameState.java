package GameState;

//Miriam Paulina Palomera Curiel 	A01635283
//Emiliano Sloth Marroquin A01636165
// Realizado con los video tutoriales de Java Game Programming y Foreing Guy Mike https://www.youtube.com/watch?v=c5RQ4mDz45k&t=488s   https://youtu.be/9dzhgsVaiSo


public abstract class GameState {
	
	protected GameStateManager gsm;
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(java.awt.Graphics2D g);
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
	
}
