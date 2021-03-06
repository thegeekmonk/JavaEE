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
		
		Class.forName("oracle.jdbc.driver.OracleDriver");			
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:sys as sysdba/5441@localhost:1521:oracle");
				
	  return con;	
	}	
	
	public int insert(int roll,String name) throws SQLException
	{   
		int recordCounter = 0;
		Connection con = null;
		PreparedStatement ps = null;
		
		try 
		{
		  con = JDBCSingleton.getConnection();
		  
		  ps = con.prepareStatement("insert into student(roll,name) values(?,?)");		  
		  ps.setInt(1, roll);
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
	
	public int update(int roll,String name) throws SQLException
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
	
	public void display(String name) throws SQLException
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
		finally
		{
			if(con != null)
				con.close();
			if(ps != null)
				ps.close();
		}
		
	}
	
	public int delete(int roll) throws SQLException
	{
		int resultCounter = 0;
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try
		{
			con = this.getConnection();
			ps = con.prepareStatement("delete from student where roll=?");
			ps.setInt(1, roll);
			
			resultCounter = ps.executeUpdate();
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
		
		return resultCounter;
	}

}
