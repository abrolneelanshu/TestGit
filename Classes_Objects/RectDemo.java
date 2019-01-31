class Shape
{
	public void Display()
	{
	System.out.println("this is the shape");
	}
}
class Rectangle extends Shape
{
	public void Display()
	{
	System.out.println("this is rectangle");
	}
	public void IncreaseLength()
	{
	System.out.println("the length is increased");
	}
}
class RectDemo
{
	public static void main(String args[])
	{
	Shape s = new Rectangle();
    s.Display();
    //s.IncreaseLength();
    Rectangle c =(Rectangle) s;
	c.IncreaseLength();

	}
}