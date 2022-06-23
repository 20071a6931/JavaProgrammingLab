import java.sql.*;
public class ExecuteUpdate {
	public static void main(String args[])
	{
		try
		{
			String uname="root";
			String pass="root";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iot_lab",uname,pass);
			Statement st=con.createStatement();
			int i=st.executeUpdate("insert into emp values(104,'uday','2341567890')");
			System.out.println(i+" rows effected");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
