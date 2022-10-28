import java.beans.Statement;
import java.sql.ResultSet;

public class principal 
{
    public static void main(String[] args) 
    {
       conexao con = new conexao();
       String sql = "Select * from clientes";
       ResultSet rs = con.executaBusca(sql);
       
       try {
        while(rs.next()){
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            System.out.println(id+" - "+nome+" - "+email);
        }
        
       } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
       }
    }
}
