import java.sql.*;
import javax.sql.rowset.*;

public class Rowset {

	public static void main(String[] args) {
		try
		{
			JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
			rowSet.setUrl("jdbc:mysql://localhost:3306/20071a6931");  
			rowSet.setUsername("root");  
			rowSet.setPassword("root");  
			           
			rowSet.setCommand("select * from emp");  
			rowSet.execute();
			while (rowSet.next())
			{
				System.out.println(rowSet.getInt(1)+" "+rowSet.getString(2)+" "+rowSet.getInt(3)+" "+rowSet.getString(4)+" ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
