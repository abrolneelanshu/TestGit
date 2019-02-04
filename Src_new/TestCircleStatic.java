class CircleStatic
{
	private double radius;
	private static int numberOfObjects = 0;

	public void setRadius(double a)
	{
	radius = a;
	numberOfObjects++;
	}
public double getRadius()
{
return radius;	
}

public static int getnumberOfObjects()
{
	return numberOfObjects;
}
public void findarea()
{
	double area;
	area=3.14*radius*radius;
	System.out.print("the area is" +area);
}
}
public class TestCircleStatic
{


public static void main(String[] args)
{
	CircleStatic circle1 =new CircleStatic();
	System.out.println("circle1 information");
	circle1.setRadius(5);
	System.out.print("circle1 radius" +circle1.getRadius());
	System.out.println("the number of circle object:" +CircleStatic.getnumberOfObjects());
	CircleStatic circle2= new CircleStatic();
	circle1.findarea();

	circle2.setRadius(5);
	System.out.print("circle1 radius" +circle2.getRadius());
	System.out.println("the number of circle object:" +CircleStatic.getnumberOfObjects());
	circle2.findarea();
}
}