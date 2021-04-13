package pattern.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {
	
	private static JDBCSingleton jdbc;	
	//private constructor
	private JDBCSingleton(){};
		
	public static JDBCSingleton getSingleton()
	{  
		if(jdbc == null)
		{
			jdbc = new JDBCSingleton();
		}					
		return jdbc;
	}
	
	private static Connection getConnection() throws ClassNotFoundException,SQLException
	{
		Connection con;        
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","sys as sysdba","5441");
				
	  return con;	
	}	
	
	public int insert(String roll,String name) throws SQLException
	{   
		int recordCounter = 0;
		Connection con = null;
		PreparedStatement ps = null;
		
		try 
		{
		  con = JDBCSingleton.getConnection();
		  
		  ps = con.prepareStatement("insert into student(roll,name) values(?,?)");		  
		  ps.setString(1,roll);
		  ps.setString(2,name);
		  
		  recordCounter = ps.executeUpdate();		  		  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(ps != null)
				ps.close();
			if(con != null)
				con.close();
		}
	 return recordCounter;	
	}
	
	public int update(String roll,String name) throws SQLException
	{
		int recordCounter = 0;		
		Connection con = null;
		PreparedStatement ps = null;
		
		try
		{
		
		con = this.getConnection();	
		ps = con.prepareStatement("update student set name=? where roll="+roll+"");
		ps.setString(1,name);
		recordCounter = ps.executeUpdate();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(con != null)
				con.close();
			if(ps != null)
				ps.close();
		}		
		
		return recordCounter;
	}
	
	public void display(String name)
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;		
		
		try
		{
			con = this.getConnection();
			ps = con.prepareStatement("select *from student where name=?");
			ps.setString(1,name);
			rs = ps.executeQuery();
						
			while(rs.next())
			{
				System.out.println("Roll No : "+rs.getString("roll")+" Name : "+rs.getString("name"));
			}					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
