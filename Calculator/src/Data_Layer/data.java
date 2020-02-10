package Data_Layer;
import java.sql.*;
public class data {
	public void dat(int x,int y,int c,String s1)
	{
		try
		{
			DriverManager.deregisterDriver(new oracle.jdbc.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			PreparedStatement p=conn.prepareStatement("insert into "+s1+"values(?,?,?)");
			p.setInt(1, x);
			p.setInt(2,  y);
			p.setInt(3,  c);
			p.executeUpdate();
			p.close();
		}
		catch(SQLException ee)
		{
			ee.printStackTrace();
			
			
		}
	}
}
