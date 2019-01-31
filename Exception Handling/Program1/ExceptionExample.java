public class ExceptionExample
{  
public static void main(String args[]){  
try{  
//code that may raise exception  
int data=100/0;  
}catch(ArithmeticException e){System.out.println(e);}  
 //rest code of the program   
System.out.println("rest of the code...");  
 
try{  
//code that may raise exception  
int[] a=new int[5];
a[10]=50 ; 
}catch(ArithmaticException  e){System.out.println(e);}  
 //rest code of the program   
System.out.println("rest of the code...");  
  
try{  
//code that may raise exception  
String s="abc";
int i =Integer.parseInt(s);  
}catch(ArithmaticException e){System.out.println(e);}  
 //rest code of the program   
System.out.println("rest of the code...");  
  
 
try{  
//code that may raise exception  
String s =null;
System.out.print(s.length())  ;
}catch(ArithmaticException e){System.out.println(e);}  
 //rest code of the program   
System.out.println("rest of the code...");  
 }  
}  