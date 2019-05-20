import java.awt.Color;

public class Leaves implements Block{

	private Color color;
	private int strength;
	private int x, y;
	
	
	Leaves(){
		super();
		this.color = new Color(95,247,156);
		this.strength = 50;
		this.x = 0;
		this.y = 0;
	}
	
	Leaves(int x, int y){
		super();
		this.color = new Color(95,247,156);
		this.strength = 50;
		this.x = x;
		this.y = y;
	}
	
	Leaves(int strength, int x, int y){
		super();
		this.color = new Color(95,247,156);
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

