import java.awt.Color;

public interface Block {

	//setters
	public abstract void setStrength(int Strength);
	public abstract void setColor(Color c);
	public abstract void setX(int x);
	public abstract void setY(int y);
	
	//getters
	public abstract int getStrength();
	public abstract Color getColor();
	public abstract int getX();
	public abstract int getY();
	public abstract boolean isWood();
	
}
