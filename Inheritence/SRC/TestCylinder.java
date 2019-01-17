class TestCylinder
{
	public static void main(String args[])
	{
	Cylinder cylinder1=new Cylinder(1.0,1.0,"red");
	Cylinder cylinder2=new Cylinder ();
    double area,volume;
    String color;
    area =cylinder1.area();
    System.out.print("the area is"+area);
    volume=cylinder1.volume();
    System.out.print("the volume is"+volume);
    cylinder1.print();
    area =cylinder2.area();
    System.out.print("the area is"+area);
    volume=cylinder2.volume();
    System.out.print("the volume is"+volume);
    cylinder2.print();

	}

}