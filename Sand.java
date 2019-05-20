import java.awt.Color;

public class Sand implements Block{

	private Color color;
	private int strength;
	private int x, y;
	
	
	Sand(){
		super();
		this.color = new Color(99,82,27);
		this.strength = 100;
		this.x = 0;
		this.y = 0;
	}
	
	Sand(int x, int y){
		super();
		this.color = new Color(99,82,27);
		this.strength = 100;
		this.x = x;
		this.y = y;
	}
	
	Sand(int strength, int x, int y){
		super();
		this.color = new Color(99,82,27);
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
		return this.getX();
		
	}

	public int getY() {
		return this.getY();
		
	}

	public boolean isWood() {
		return false;
	}

}
