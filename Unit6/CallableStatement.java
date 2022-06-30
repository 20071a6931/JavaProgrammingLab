import java.sql.*;
public class CallableStatement {
	public static void main(String args[])
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/20071a6931","root","root");
			java.sql.CallableStatement cst= con.prepareCall("{call proc1()}");
			ResultSet rs = cst.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}

			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
