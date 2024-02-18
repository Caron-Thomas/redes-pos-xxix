package local.javaredes;
/**
 * @author Thomas Caron de Castro Deus
 */

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    
    private static ServerSocket servidor;
    private static Socket conexao;
    private static ObjectInputStream entrada;
    private static DataOutputStream saida;
           
    public static void main(String[] args) {

        try {
            servidor = new ServerSocket(50000);
            System.out.println("Aguardando Conexao...");
            conexao = servidor.accept();
            
            entrada = new ObjectInputStream(conexao.getInputStream());
            Pessoa pessoa = (Pessoa)entrada.readObject();
            System.out.println("Nome"+pessoa.getNome());
            System.out.println("Idade"+pessoa.getIdade());
            
            saida = new DataOutputStream(conexao.getOutputStream());
            saida.writeUTF("Objeto recebido");
            
            conexao.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
          
}
