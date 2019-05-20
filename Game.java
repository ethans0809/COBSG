import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Game {

	
public static ArrayList<ArrayList<Block>> world = new ArrayList<ArrayList<Block>>();

public static int worldHeight = 10;
public static int worldLength = 30;

	public static void main(String[] args) {
	
	genWorld();
	
	//System.out.println(world.get(5));
	
	JFrame myFrame = new JFrame();
	
	myFrame.setTitle("COBSG");
	myFrame.setSize(1000, 800);
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Graphic myGraphic = new Graphic(world);
	myFrame.setBackground(Color.WHITE);
	myFrame.add(myGraphic);
	myFrame.setVisible(true);
	
}
	


//World Generation
	public static void genWorld() {
	
	ArrayList<Block> sky = new ArrayList<Block>();
	ArrayList<Block> dirt = new ArrayList<Block>();
	ArrayList<Block> stone = new ArrayList<Block>();
	ArrayList<Block> bedrock = new ArrayList<Block>();
	
		
			for(int x = 0; x < worldLength; x++) {
			sky.add(null);
			dirt.add(new Dirt());
			stone.add(new Stone());
			bedrock.add(new Bedrock());
			}
			for(int y = 0; y < worldHeight; y++) {
			if(y==0 || y==1 || y == 2 || y == 3 || y == 4)
				world.add(y, sky);	
			else if(y == 5 || y == 6)
				world.add(y, dirt);
			else if (y == 7 || y == 8 || y == 9)
				world.add(y, stone);
			else 
				world.add(y, bedrock);
		}
	genTree();
	addDiamond();
	}
	
//Generates Trees
	public static void genTree() {
	int tree = 0;
		for(int y = 4; y >= 4; y--) {
			for(int x = 2; x < worldLength-1; x++) {
				int rng = (int)(Math.random()*10);
				if (rng <= 5 && tree == 0) {
					world.get(y).set(x, new Wood());
					tree+=2;
				}
				else
					tree--;
				if(tree <0)
					tree+=1;
			}
		}
			for(int x = 2; x < worldLength-1; x++) {
				if(world.get(4).get(x)!= null)
				if(world.get(4).get(x).isWood()) {
				
				int rng = (int)(Math.random()*2);
					world.get(3).set(x, new Wood());
					world.get(2).set(x, new Leaves());
					world.get(3).set(x-1, new Leaves());
					world.get(3).set(x+1, new Leaves());
					world.get(2).set(x-1, new Leaves());
					world.get(2).set(x+1, new Leaves());
					if (rng == 0) {
						world.get(3).set(x-1, null);
						world.get(3).set(x+1, null);
						world.get(2).set(x, new Wood());
						world.get(1).set(x, new Leaves());
						world.get(1).set(x-1, new Leaves());
						world.get(1).set(x+1, new Leaves());
					}
				}
			}
		}
	
	
//Adds Diamond
	public static void addDiamond() {
		int rngX = (int)(Math.random()*worldLength);
		int rngY = (int)((Math.random()*worldHeight)-4)+4;
		world.get(rngY).set(rngX, new Diamond());
	}
	


}
