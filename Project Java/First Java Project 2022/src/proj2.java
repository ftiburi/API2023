import java.sql.Connection;
import java.sql.DriverManager;

import javax.xml.crypto.dsig.Reference;

public class PostgreSQLJDBC {
   /**
    * @param args
    */
   public static void main(String args[]) {
      Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/Fabio Tiburi",
            "postgres", "Ft01610220");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
   }
   @Override
   public String toString() {
      return "PostgreSQLJDBC []";
   }
}