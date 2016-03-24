package com.origin.base;

/*
 * 创建数据库连接池
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 


public class DBConnection {

/*
 * 本系统支持双数据库mysql和sqlserver，只需在这里把不要的数据库连接语句注释掉即可-------private mothed
 */	

	private Connection conn = null;
 
	 
	private static final String url = "jdbc:mysql://localhost:3306/b_140327_food?useUnicode=true&characterEncoding=utf-8"; 
	private static final String user = "root";
	private static final String password = "root";
	private String className = "com.mysql.jdbc.Driver";
	


	//private String user = "sa";
	//private String password = "sa";
	//private String className = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	//private String url = "jdbc:sqlserver://localhost:1433;databaseName=b_140327_food"; 
	
	
	public Connection getInstance() throws SQLException {

		try {	
			if(conn == null){
				Class.forName( className ).newInstance();
				conn = DriverManager.getConnection(url,user,password); 
  			}

		}  catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;	
	}
/*
 * 
 */
    public void close(){
    	try {
			if(conn != null && !conn.isClosed())
    		conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
