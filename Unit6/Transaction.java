import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Transaction {
	public static void main(String args[])
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/20071a6931","root","root");
			con.setAutoCommit(false);
			String sql1="insert into emp values(5,'hero',34000,'0987654322')";
			String sql2="insert into emp values(6,'zero',43000,'1234567899')";
			Statement st=con.createStatement();
			int q1=st.executeUpdate(sql1);
			Statement st1=con.createStatement();
			int q2=st1.executeUpdate(sql2);
			if(q1>0 && q2>0)
			{
				con.commit();
			}
			else
			{
				con.rollback();
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
