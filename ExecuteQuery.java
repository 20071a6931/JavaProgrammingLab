import java.sql.*;
public class ExecuteQuery {
	public static void main(String args[])
	{
		try
		{
			String uname="root";
			String pass="root";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iot_lab",uname,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
