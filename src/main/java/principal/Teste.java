package principal;

import conexaoBD.Conexao;
import java.sql.Connection;

public class Teste {
    public static void main(String[] args) {
        try{
            Connection conn  = Conexao.getConexao();
            System.out.println("Conexão realizada com sucesso!" );
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
