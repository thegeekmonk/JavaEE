package pattern.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDBCSingletonDemo {
	
	static int choice;
	static int count = 1;
		
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		JDBCSingleton jdbc = JDBCSingleton.getSingleton();		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	    
		
		do
		{
		System.out.println("Select your choice :-\n");
		System.out.println("1.Display Record");
		System.out.println("2.Insert Record");
		System.out.println("3.Update Record");
		System.out.println("4.Delete Record ");
		System.out.println("5.Exit \n");
				
		System.out.println("Enter your Choice : ");
		choice = Integer.parseInt(bf.readLine());		
		
		switch(choice)
		{
		   
		case 1 : //Display Record
		         System.out.println("Enter the name of student : ");		         
		         try
		         {
		        	 String name = bf.readLine();		        	 
		        	 jdbc.display(name);
		         }
		         catch(Exception e)
		         {
		        	 e.printStackTrace();
		         }		         
		         break;
		         
		case 2 : //Insert Record			     
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
                 
		case 3 : //update Record
			      System.out.println("Enter the Roll Number : ");
			      int rollN = Integer.parseInt(bf.readLine());
			      System.out.println("Enter the Name : ");
			      String Sname = bf.readLine();
			      			      
			      try
			      {
			    	  int i = jdbc.update(rollN, Sname);
			    	  
			    	  if(i > 0)
			    		  System.out.println("Record updated successfully");
			    	  else
			    		  System.out.println("Record Couldn't be updated");
			      }
			      catch(Exception e)
			      {
			    	  e.printStackTrace();
			      }
			      break;
		         		
		case 4 : //Delete Record
		      System.out.print("Enter the Roll Number : ");
		      int rollD = Integer.parseInt(bf.readLine());
		      			      
		      try
		      {
		    	  int i = jdbc.delete(rollD);
		    	  
		    	  if(i > 0)
		    		  System.out.println("Record Deleted successfully");
		    	  else
		    		  System.out.println("Record Couldn't be Deleted");
		      }
		      catch(Exception e)
		      {
		    	  e.printStackTrace();
		      }
		      break;	      
		default :
			    break;
		}	
		
//		System.out.println("Enter your Choice : ");
//		choice = Integer.parseInt(bf.readLine());		
		
		} while(choice != 5);	
	}	
 }
