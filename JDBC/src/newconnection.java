import java.sql.*;
public class newconnection {
	public static void main(String[] args){
		try{
		
		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/jdbc","sa","");
		Statement stmt = con.createStatement();
		String query = "create table users(ID int primary key, name varchar2(20), mobile int)";
		PreparedStatement preparedStmt = con.prepareStatement(query);
		preparedStmt.execute();
		System.out.println("succesfully created");
		String sql;
		sql = "select * from users";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		System.out.println(rs.getInt(1)+""+rs.getString(2)+"");
		con.close();
	}catch(Exception e){
		System.out.println(e);
	}
	
}
}