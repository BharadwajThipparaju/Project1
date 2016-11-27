import java.sql.*;
public class connection {

	public static void main(String[] args){
		try{
		
		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/jdbc","sa","");
		Statement stmt = con.createStatement();
		String query = "update employee set name = 'bharadwaj' where ID = 1";
		PreparedStatement preparedStmt = con.prepareStatement(query);
		preparedStmt.executeUpdate();
	
		//String query1 = "insert into employee values(5, 'rishi', 'rishi@gmail.com')"; 
		//PreparedStatement  preparedStmt1 = con.prepareStatement(query1);
		//preparedStmt1.execute();
		
		String sql;
		sql = "select * from employee";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		System.out.println(rs.getInt(1)+""+rs.getString(2)+"");
		con.close();
	}catch(Exception e){
		System.out.println(e);
	}
		
}
}