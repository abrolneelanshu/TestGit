import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
	ArrayList<String> a1=new ArrayList<String>();
	System.out.println("Initial size of a1:"+a1.size());
	a1.add("C");
	a1.add("A");
	a1.add("E");
	a1.add("D");
	a1.add("F");
	System.out.println("initial size addition a1:"+a1.size());
    System.out.println("initial size addition a1:"+a1);
    a1.remove("F");
    a1.remove(2);
    System.out.println("Initial size deletion a1:"+a1.size());
            
	System.out.println("Initial size deletion a1:"+a1);


	}
}