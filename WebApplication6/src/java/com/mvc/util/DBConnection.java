//DBConnection.java
package com.mvc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
public static Connection createConnection()
{
Connection con = null;
String url = "jdbc:mysql://localhost:3306/customers?zeroDateTimeBehavior=convertToNull [root on Default schema]";
String username = "root"; //MySQL username
String password = "123456"; //MySQL password
try 
{
try 
{
Class.forName("com.mysql.jdbc.Driver"); //loading MySQL drivers. This differs for database servers 
} 
catch (ClassNotFoundException e)
{
e.printStackTrace();
}
con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
System.out.println("Printing connection object "+con);
} 
catch (SQLException e) 
{
e.printStackTrace();
}
return con; 
}
}