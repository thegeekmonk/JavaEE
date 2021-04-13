package pattern.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDBCSingletonDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		static int choice = 0;
		static int count = 0;
		JDBCSingleton jdbc = JDBCSingleton.getSingleton();		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	    
		
		do
		{
		System.out.println("Select your choice :-\n");
		System.out.println("1.Display Record");
		System.out.println("2.Insert Record");
		System.out.println("3.Update Record");
		System.out.println("4.Delete Record ");
		System.out.println("5.Exiit \n");
				
		switch(choice)
		{
		   
		case 1 : String name;
		         System.out.println("Enter the name of student : ");
		         
		         try
		         {
		        	 name = bf.readLine();		        	 
		        	 jdbc.display(name);
		         }
		         catch(Exception e)
		         {
		        	 e.printStackTrace();
		         }		         
		         break;
		         
		case 2 : 			     
                 System.out.println("Enter the Roll number : ");    
			     int roll = Integer.parseInt(bf.readLine()); 
			     System.out.println("Enter the Name : ");
   	             String nameS = bf.readLine();
   	             
                 try
                 {       	             
	               int i = jdbc.insert(roll,nameS);
	               
	               if(i > 0)
	            	   System.out.println("");
	               
                 }
                 catch(Exception e)
                 {
       	           e.printStackTrace();
                 }      
        break;         
		         			
		default :
			    break;
		
		}while(choice != 5);		
  }
}		
