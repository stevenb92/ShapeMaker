import java.awt.*;// imports  everything in the awt class and dumps what is not used
import javax.swing.*;//imports everything in the swing class and dumps what is not used


public class output extends JFrame{ //class
	int x, y, height, width = 0;//initialize variables for height, width, x and y and set them to 0
	boolean rectangle, oval;// set boolean variables for rectangle and oval
	public output(int width, int height, int x, int y, boolean rectangle, boolean oval){ //constructor
		this.x = x; //value of  x is equal to value of x from shape class
		this.y = y; //value of  y is equal to value of y from shape class
		this.width = width; //value of  width is equal to value of width from shape class
		this.height = height; //value of  height is equal to value of height from shape class
		this.rectangle = rectangle; //value of rectangle is equal to value of rectangle from shape class
		this.oval = oval; //value of this oval is equal to value of oval from shape class
		setSize(600, 400); //sets the size of the JFrame
		setResizable(false);//disables resizing through dragging the corners
		setVisible(true);// set the JFrames to be visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//the program will exit upon close
	}
	
	public void paint(Graphics g){ //paint method
		if (rectangle){ //if boolean variable rectangle is set to true
		g.drawRect(width,height,x,y); //draw a rectangle with the values from the integer variables passed from shape class
		}
		else { //otherwise (if oval is set to true)
			g.drawOval(width,height,x,y); //draw a oval with the values from the integer variables passed from shape class
		}
			
		}
	}

