import java.util.*;
class ArrayListDemo1
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
	System.out.println(a1);
    a1.add(1,"A2");	
	System.out.println("initial size addition a1:"+a1.size());
    System.out.println("initial size addition a1:"+a1);
    Iterator<String> itr= a1.iterator();
    while(itr.hasNext())
    {
    	String element=itr.next();
    	System.out.println(element+"");
    }

    System.out.println("modified content");
    ListIterator<String> litr= a1.listIterator();
    while(litr.hasNext())
    {
    	String element=litr.next();
    	System.out.println(element+"");
    }
    System.out.println("previous element");
            
	while(litr.hasPrevious())
    {
    	String element=litr.previous();
    	System.out.println(element+"");
    }


	}
}