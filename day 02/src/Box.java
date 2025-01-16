class Box 
{
	//state : DATA : NON STATIC DATA MEMBERS : memory allocated in heap : After instance creation -- instance variable
	// tight encapsulation : data hiding : private
	
	private double width, depth, height;
	
	//Parameterized constructor to initialize state of the box
	
	Box()
	{
		this(1.10);
		System.out.println("In no paramter constructor");
	}
	
	Box(double width, double depth, double height)
	{
		System.out.println("In 3 paramter constructor");
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	
	Box(double side)
	{
		//this.width = this.depth = this.height = side;
		this(side, side, side);
		System.out.println("In 1 paramter constructor");
	}
	
	
	//Action
	
	String getBoxDetails()
	{
		//Adding this keyword is optional, Only added for understanding
		return "Box Dimentions "+this.width+" "+ this.depth+" "+ this.height;
	}
	
	double getComputedVolume()
	{
		return this.width*this.height*this.depth;
	}
}