class Box
{
	double width,w;
	double depth,d;
	double height,h;
	Box(double width,double depth,double height)
	{
	this.width=width;
	this.depth=depth;
	this.height=height;
	}
	double volume()
	{
	return width*depth*height;
     
    }
	class Boxdemo2
{
	public static void main(String args[])
	{ 
	double vol;
    Box box3= new Box(12,37,67);
	vol= box3.volume(); 
	System.out.print(vol);
	}
}