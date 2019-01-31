class Circle
{
  double radius;
  double area;
  double circumfrence;

  void findarea()
  {
  area =3.14*radius*radius;
  }

  void circumfrence()
  {
  circumfrence=2*3.14*radius;
  }

  void displayarea()
  {
  System.out.print("area is ="+area);
  System.out.print("circumfrence is"+circumfrence);
  }	  
}

class Circledemo1
{
	public static void main(String args[])
	{
	Circle c = new Circle();
	c.radius=2;
	c.findarea();
  c.circumfrence();
	c.displayarea();
    }
}