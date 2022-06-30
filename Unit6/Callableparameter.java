import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;
public class Callableparameter {
	public static void main(String args[])
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/20071a6931","root","root");
			java.sql.CallableStatement cst= con.prepareCall("{call proc2(?,?)}");
			cst.setInt(1, 1);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.execute();
			System.out.println(cst.getString(2));

			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
