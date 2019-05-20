import java.awt.Color;

public class Diamond implements Block{

	private Color color;
	private int strength;
	private int x, y;
	
	
	Diamond(){
		super();
		this.color = Color.CYAN;
		this.strength = 500;
		this.x = 0;
		this.y = 0;
	}
	
	Diamond(int x, int y){
		super();
		this.color = Color.CYAN;
		this.strength = 500;
		this.x = x;
		this.y = y;
	}

	
	Diamond(int strength, int x, int y){
		super();
		this.color = Color.CYAN;
		this.strength = strength;
		this.x = x;
		this.y = y;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setColor(Color c) {
		this.color = c;	
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;	
	}

	public int getStrength() {
		return this.strength;	
	}

	public Color getColor() {
		return this.color;
	}

	public int getX() {
		return this.x;	
	}

	public int getY() {
		return this.y;
	}

	public boolean isWood() {
		return false;
	}

}
