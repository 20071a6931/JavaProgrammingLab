import java.sql.*;
public class PreparedStatement {
	public static void main(String args[])
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/20071a6931","root","root");
			java.sql.PreparedStatement stmt =  con.prepareStatement("insert into emp values(?,?,?,?)");
			stmt.setInt(1,4);
			stmt.setString(2,"Mah");
			stmt.setInt(3, 25000);
			stmt.setString(4, "7093618833");
			int i=stmt.executeUpdate();
			System.out.println(i+" records inserted");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
