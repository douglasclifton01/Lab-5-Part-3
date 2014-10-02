/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connecttobooks;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
 public class ConnectToBooks {
 public static void main(String[] args) {
 try{
 String host = "jdbc:derby://localhost:1527/DBTests";
 String dbName = "test";
 String dbPass = "test";
 Connection conn = DriverManager.getConnection( host, dbName, dbPass );
 Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
ResultSet.CONCUR_UPDATABLE);
 String SQL = "SELECT * FROM QUESTION.TEST1";
 ResultSet Rset = state.executeQuery( SQL );
 
 System.out.println("Number"+" "+"Question");
 while(Rset.next( )){
 int Id = Rset.getInt("NUM");
 String sName = Rset.getString("QUESTION");
 
 String SQL = "SELECT * FROM QUESTION.TEST2";
 ResultSet Rset = state.executeQuery( SQL );
 
 System.out.println("Question"+" "+"Answer");
 while(Rset.next( )){
 int Id = Rset.getInt("QUESTION");
 String sName = Rset.getString("ANSWER");
 
 System.out.println(Id+" "+sName);
 }
 }
 catch ( SQLException err ) {
 System.out.println( err.getMessage( ) );
 }
 }
}

