import java.awt.Color;

public class player {

	public int location;
	public int height;
	public int width;
	public Color color;
	public int health;
	public int damage;
	//jump height
	//movement speed
	//damage rate
	//distance
	
	public player() {
		location = 0;//location??????????????
		height = 100;
		width = 60;
		color = Color.BLUE;
		health = 100;
		damage = 20;
	}

	public int getLocation() {//LOCATION???????????????
		return location;
	}

	public void setLocation(int location) {//LOCATION???????????????
		this.location = location;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
		
	
}
