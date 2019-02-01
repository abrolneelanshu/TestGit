import java.util.*;
class ArrayListDemo2
{
	public static void main(String args[])
	{
	LinkedList<String> ll=new LinkedList<String>();
	System.out.println("Initial size of ll:"+ll.size());
	ll.add("C");
	ll.add("A");
	ll.add("E");
	ll.add("D");
	ll.add("F");
	ll.add(1,"A2");
	ll.addFirst("A");
	ll.addLast("Z");
	System.out.println("initial size addition ll:"+ll.size());
    
    ll.remove("F");
    ll.remove(2);
    System.out.println("Initial size deletion ll:"+ll);
    ll.removeLast();
    ll.removeFirst(); 
    System.out.println("Initial size deletion ll:"+ll); 
    String val = ll.get(2);
    ll.set(2,"5");      
	System.out.println("Changed list:"+ll);


	}
}