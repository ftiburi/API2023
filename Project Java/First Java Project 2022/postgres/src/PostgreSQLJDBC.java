import java.sql.Connection;
import java.sql.DriverManager;

import org.postgresql.core.SqlCommand;




public class PostgreSQLJDBC {
   /**
    * @param args
    */
   public static void main(String args[]) {
      Connection c = null;
      try 
      {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/Fabio Tiburi",
            "postgres", "Ft01610220");
       } 
      catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");

      String d = ("idade");

      //System.out.println("O nome da tabela é" + d);
     //System.executeUpdate("CREATE TABLE basic (a int, b int)");
      


   }
   @Override
   public String toString() {
      return "PostgreSQLJDBC []";
   }
}