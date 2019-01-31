import java.io.*;
import java.util.*;
 class FileDemo4 
 {
   
   public static void main(String[] args) 
   {
      File f = null;
            
            try {
         
              f = new File("file1.txt");
              FileReader fin = new FileReader(f);
	            BufferedReader bin= new BufferedReader(fin);
 	            String search;
              System.out.println("The word to search: "); 
              Scanner sc=new Scanner(System.in);
              search=sc.next();
              String sr;
              boolean flag=false; 
	            System.out.println("The contents of the file are: ");	
              while((sr=bin.readLine())!=null)
              {
              System.out.println(sr);
              String[] strs=sr.split(" ");
              for (int i=0; i <strs.length; i++)
                 {
                   if(strs[i].equals(search))
                     {
                       flag=true;
                       break;
                     }
                }
              }
		         if((sr=bin.readLine())!=null && flag==false)
                 {
                 System.out.print("\n Not Present");

                 }	
            else
            {
            System.out.println("\n Present");
            }		

            } 
		
    
		        catch (Exception e) 
           {
         // if any I/O error occurs
         e.printStackTrace();
           }
           }   
           }

