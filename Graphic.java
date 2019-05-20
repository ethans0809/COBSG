import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class Graphic extends JPanel{

	public static ArrayList<ArrayList<Block>> world = new ArrayList<ArrayList<Block>>();

	
	public Graphic(ArrayList<ArrayList<Block>> world) {
		super();
		this.world = world;
		
	}
	
	public void paintComponent(Graphics g) {
	
	g.setColor(Color.RED);
	g.fillRect(0, 0, 50, 50);
	
	for(int y = 0; y < world.size(); y++) {
		for(int x = 0; x < world.get(y).size(); x++) {
			if(world.get(y).get(x)!= null) {
			world.get(y).get(x).setX(x*100);
			world.get(y).get(x).setY(y*100);
			g.setColor(world.get(y).get(x).getColor());
			g.fillRect(world.get(y).get(x).getX(), world.get(y).get(x).getY(), 100, 100);
			g.setColor(Color.BLACK);
			g.drawRect(world.get(y).get(x).getX(), world.get(y).get(x).getY(), 100, 100);
			}
		}
	}
	
	
	}

}
