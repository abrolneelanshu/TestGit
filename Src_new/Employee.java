import java.util.*;
class Employ
{
	public int empCode( int c)
	{ 
      Scanner c = new Scanner(System.in);
      int ecode =c.nextInt();
      return ecode;
	}

	 public int empName( String n)
	{ 
      Scanner n = new Scanner(System.in);
      String ename =n.next();
      return ename;
	}

	public int empDepartment( String d)
	{ 
      Scanner d = new Scanner(System.in);
      String edep =d.next();
      return edep;
	}

    public int empCity( String h)
	{ 
	  
      Scanner h = new Scanner(System.in);
      String ecity =h.next();
      return ecity;
	}

	public int empSalary( int s)
	{ 
	  
      Scanner s = new Scanner(System.in);
      int esal =s.nextInt();
      return esal;
	}


}

class Employee
{
	public static void main(String args[])
	{
     Employee mydetails = new Employee();
     Sysytem.out.println("1.enter details of employee \n");
     Sysytem.out.println("2. display details \n");
     
     int num,p;
      Scanner p = new Scanner(System.in);
      String num =p.nextInt();
      switch(num)
      {
      	case 1:
      	{
      		myDetails.empSalary();
      		myDetails.empCity();
      		myDetails.empDepartment();
      		myDetails.empName();
      		myDetails.empCode();
      		
      		Sysytem.out.print ("enter the code");
      		System.out.println(myDetails.empCode());
      		Sysytem.out.println(ecode);
      		Sysytem.out.print ("enter the name");
      		System.out.println(myDetails.empName());
      		Sysytem.out.println(ename);
      		Sysytem.out.print ("enter the city");
            System.out.println(myDetails.empCity());
            Sysytem.out.println(ecity);
            Sysytem.out.print ("enter the department");
      		System.out.println(myDetails.empDepartment());
      		Sysytem.out.println(edep);
      		Sysytem.out.print ("enter the salary");
      		System.out.println(myDetails.empSalary());
      		Sysytem.out.println(esal);
      		break;
      	}
      	case 2:
      	{
      		do{
      		myDetails.empSalary();
      		myDetails.empCity();
      		myDetails.empDepartment();
      		myDetails.empName();
      		myDetails.empCode();
      		
      		
      		System.out.println(myDetails.empCode());
      		System.out.println(myDetails.empName());
      		
            System.out.println(myDetails.empCity());
      		System.out.println(myDetails.empDepartment());
      		System.out.println(myDetails.empSalary());
      		}
      		while (ch==n);
      		char ch,l;
      		System.out.println("enter the details if you want to continue or not press n");
      		Scanner l = new Scanner(System.in);
            int ch =l.next();

      	}

      }

	} 
}