import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Types;

public class Functions {

	public static void main(String[] args) {
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/20071a6931","root","root");
			java.sql.CallableStatement stm=con.prepareCall("{?=call fun1(?)}");
			stm.setInt(2, 1);
			stm.registerOutParameter(1, Types.VARCHAR);
			stm.execute();
			System.out.println(stm.getString(1));
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
