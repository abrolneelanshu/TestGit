class Box
{
	double width;
	double height;
	double depth;
	Box()
	{
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
	double volume()
	{
	return width*height*depth;
	}
}
class Boxdemo1 
{
	public static void main(String args[])
	{ 
	double vol;
    Box mybox1= new Box();
	Box mybox2= new Box(5,6,9);
	vol= mybox1.volume(); 
	System.out.print("volume is"+vol);
	vol= mybox2.volume(); 
	System.out.print("volume is"+vol); 
   }
}