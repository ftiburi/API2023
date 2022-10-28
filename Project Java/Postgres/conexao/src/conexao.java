import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class conexao {
    private String url;
    private String usuario;
    private String senha;
    private Connection con = null;
    private Class<?> forName;


    /**
     * 
     */
    conexao(){
       url ="jdbc:postgresql://localhost:5432/Fabio Tiburi";
       usuario = "postgres";
       senha = "Ft01610220";
       try {
        forName = Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(url,usuario,senha);
        System.out.println("Conexao realizada com sucesso");
       }
        catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
       }
          }
          public int executaSQL(String sql){
            try {
                Statement stm = con.createStatement();
                int res = stm.executeUpdate(sql);
                con.close();
                return res;
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                return 0;
            }
        }
            public ResultSet executaBusca(String sql){
                try {
                    Statement stm = con.createStatement();
                    ResultSet rs = stm.executeQuery(sql);
                    con.close();
                    return rs;
                    
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                    return null;
                } 
        
                
            }

          }
        

