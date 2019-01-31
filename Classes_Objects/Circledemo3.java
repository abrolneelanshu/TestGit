class Circle
{
  private double radius;//it is a private so no other class can acess
  public double area;

  public void setRadius()
  {
    radius =5;
  } 

  public void getRadius()
  {
    System.out.print(radius);
  }


  void findarea()
  {
  area =3.14*radius*radius;
  }

  void displayarea()
  {
  System.out.print("area is ="+area);
  }	  
}

class Circledemo3
{
	public static void main(String args[])
	{
	Circle c = new Circle();
	c.setRadius();
  c.getRadius();
	c.findarea();
	c.displayarea();
    }
}