package local.javaredes;
/**
 * @author Thomas Caron de Castro Deus
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    
    private static Socket conexao;
    private static ObjectOutputStream saida;
    private static DataInputStream entrada;

    public static void main(String[] args) {
        
        try {
            conexao = new Socket("127.0.0.1", 50000);
            
            Pessoa p = new Pessoa();
            p.setNome("Thomas");
            p.setIdade(42);
            saida = new ObjectOutputStream(conexao.getOutputStream());
            saida.writeObject(p);
            
            entrada = new DataInputStream(conexao.getInputStream());
            String resposta = entrada.readUTF();
            System.out.println("Resposta do Servidor"+resposta);
            
            conexao.close();
        
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
}
