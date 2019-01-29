public class TestThrow1{  
  
   public static void main(String args[]){  
      String s=null;
       try
       { 

        if(s==null)  
      throw new Exception("not valid");  
     else  
      System.out.println("welcome to vote");
      
       } 
   
     catch(Exception e)
     {
     System.out.print(e);
     }
     finally
     {
     System.out.println("rest of the code...");
     }
        
  }  
}  
