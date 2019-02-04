abstract class Shape1
{
double shape1;
double shape2;
double area;	

Shape1(double a,double b)
{
	shape1=a;
	shape2=b;
}
double area()
{
	System.out.print("the area is not defined");
	area=0;
	return 0;
}
abstract void Display();
}



class Rectangle extends Shape1
{
	Rectangle (double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		area=shape1*shape2;
		return area;
	}
	void Display()
	{
		System.out.println(""+area);
	}
}

class Triangle extends Shape1
{
	Triangle (double c,double d)
	{
		super(c,d);
	}
	double area()
	{
		area=shape1*shape2*0.5;
		return area;
	}
	void Display()
	{
		System.out.println(""+area);
	}
}

class FindArea
{
	public static void main(String args[])
	{
		//Shape1 s=new Shape1(10,10)
		Rectangle r=new Rectangle(9,5);
		Triangle t = new Triangle(8,4);
		Shape1 sh;
		sh=r;
		System.out.print(sh.area());
	sh.Display();
		sh=t;
		System.out.print(sh.area());
	sh.Display();
	}
}