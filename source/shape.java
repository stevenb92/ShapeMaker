import javax.swing.*; //imports everything in the swing class and dumps what is not used
import java.awt.*; // imports  everything in the awt class and dumps what is not used
import java.awt.event.*; //imports everything in the awt event class and dumps what is not used


public class shape extends JFrame implements ActionListener { //class
	
	JFrame output;
	JButton brectangle,boval;//declared buttons
	JTextField tfwidth, tfheight, tfx, tfy, tfarea ;//declared TextFields
	JLabel lwidth, lheight, lx , ly, lselect, larea;//declared Labels
	boolean rectangle, oval; // initialize booleans for drawing a rectangle or an oval
	int x, y,  width, height, width1, height1;
	double area;
	
	public shape() //Constructor
	{
		
		setSize(600, 400); //sets the size of the JFrame
		setResizable(false);//disables resizing through dragging the corners
		setLayout(new GridLayout(7,2));//sets new GridLayout for JFrame
		
		lwidth = new JLabel("Please Enter Width:");//new JLabel for width
		add(lwidth);//add JLabel to the JFrame
		tfwidth = new JTextField("width");//new JTextField for width
		add(tfwidth);//add JTextField to JFrame
		lheight = new JLabel("Please Enter Height:");//new JLabel for height
		add(lheight);//add JLabel to the JFrame
		tfheight = new JTextField("height");//new JTextField for height
		add(tfheight);//add JTextField to JFrame
		lx = new JLabel("Please Enter X Coordinate:");//new JLabel for x
		add(lx);//add JLabel to the JFrame
		tfx = new JTextField("x");//new JTextField for x coordinate
		add(tfx);//add JTextField to JFrame
		ly = new JLabel("Please Enter Y Coordinate:");//new JLabel for y
		add(ly);//add JLabel to the JFrame
		tfy = new JTextField("y");//new JTextField for y coordinate
		add(tfy);//add JTextField to JFrame
		lselect = new JLabel("Choose The Shape You Would Like To Draw:");//new JLabel for selection
		add(lselect);//add JLabel to the JFrame
		add(new JLabel(""));//add new empty JLabel to JFrame
		brectangle = new JButton("Rectangle");//new JButton for rectangle
		brectangle.addActionListener(this);//add an action listener for JButton
		add(brectangle);//add JButton to JFrame
		boval = new JButton("Oval");//New JButton for rectangle
		boval.addActionListener(this);//add an action listener for JButton
		add(boval);//add JButton to JFrame
		larea = new JLabel("The Area Of The Shape You Have Drawn Is:");//new JLabel for area
		add(larea);//add JLabel to the JFrame
		tfarea = new JTextField("Area");//new JTextField for shape area
		add(tfarea);//add JTextField to JFrame
		tfarea.setEditable(false);//disables editing of JTextfield
		setVisible(true);// set the JFrame to be visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//the program will exit upon close
	}
	
public void actionPerformed(ActionEvent ev) {
		
		if (ev.getSource() == brectangle) //If brectangle button is clicked
		{
		
			width = Integer.parseInt(tfwidth.getText()); //convert String in JTextField to Integer
			height = Integer.parseInt(tfheight.getText());//convert String in JTextField to Integer
			x = Integer.parseInt(tfx.getText());//convert String in JTextField to Integer
			y = Integer.parseInt(tfy.getText());//convert String in JTextField to Integer
		    area = width * height; //area of rectangle is the width multiplied by the height
			tfarea.setText(Double.toString(area));//convert the double area into a string and put it into the JTextField
			rectangle = true; //set rectangle boolean variable to true
			oval = false; //set oval boolean variable to false
			validate();
			output output = new output(x,y,width,height,rectangle,oval); //passes variables to output class
		
		
		
		}
		
		if (ev.getSource() == boval)//If boval button is clicked
		{
			width = Integer.parseInt(tfwidth.getText());//convert String in JTextField to Integer
			height = Integer.parseInt(tfheight.getText());//convert String in JTextField to Integer
			x = Integer.parseInt(tfx.getText());//convert String in JTextField to Integer
			y = Integer.parseInt(tfy.getText());//convert String in JTextField to Integer
			width1 = width / 2; //halve the value of the width variable
			height1 = height / 2;//halve the value of the height variable
			area = height1 * width1 * Math.PI;//area of oval is the height multiplied by the width multiplied by pi
			tfarea.setText(Double.toString(area));//convert the double area into a string and put it into the JTextField
			rectangle = false; //set rectangle boolean variable to true
			oval = true;//set oval boolean variable to false
			validate();
			output output = new output(x,y,width,height,rectangle,oval); //passes variables to output class
			
		}
		
	}

    	
    
	

	public static void main (String args[]){ //main method
		new shape();//create new shape
	}
}
