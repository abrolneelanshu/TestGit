class Box
{
	double width;
	double height;
	double depth;

	Box()
	{
	System.out.println("constructing overloading");
    width =7;
	height=3;
	depth=5;
	}

    Box(double w,double h,double d)
    {
    	width=w;
    	height=h;
    	depth=d;
    }

    Box(double len)
    {
    width=height=depth=len;
    }

	double volume()
	{
	return width*height*depth;
	}
}

class Boxdemo3 
{
	public static void main(String args[])
	{ 
	double vol;
    Box mybox1= new Box();
	Box mybox2= new Box(5,6,9);
	//double vol;
	vol= mybox1.volume(); 
	System.out.print("volume is"+vol);
	vol= mybox2.volume(); 
	System.out.print("volume is"+vol);
    Box mycube = new Box(7);
    vol = mycube.volume();
    System.out.print("volume of mycube is"+vol);
   }
}