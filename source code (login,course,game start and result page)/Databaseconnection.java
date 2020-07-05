
package quiz_game;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pankaj
 */
public class Databaseconnection {
 
   public  static  Connection  getConnection(){
    Connection con=null;
      try{
    Class.forName("com.mysql.jdbc.Driver");
    con  =  DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root", "");
    
}  catch (Exception  ex) {
    System.out.println(ex.getMessage());
}
    return con;
} 
}

