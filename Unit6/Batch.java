import java.sql.*;
public class Batch {

	public static void main(String[] args) {
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/20071a6931","root","root");
			con.setAutoCommit(false);
			String sql1="insert into emp values(7,'hero1',44000,'0987654329')";
			String sql2="insert into emp values(8,'zero1',55000,'1234567896')";
			String sql3="insert into emp values(9,'hero2',66000,'0987654325')";
			Statement st=con.createStatement();
			st.addBatch(sql1);
			st.addBatch(sql2);
			st.addBatch(sql3);
			int q[]=st.executeBatch();
			int c=0;
			for(int i:q)
			{
				if(i>0)
					c++;
			}
			if(c==3)
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
