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

public class Servidor extends Thread {
    
    private static Socket conexao;
   
    public static void main(String[] args) {

        try {
            ServerSocket servidor = new ServerSocket(50000);
           
            while(true){
                System.out.println("Aguardando Conexao..."); 
                Socket conexao = servidor.accept();
                Servidor theadServidor = new Servidor(conexao);
                theadServidor.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Servidor(Socket conexao) {
        this.conexao = conexao;
    }
    
    private Servidor() {
    }

    public void run(){
     
        try {
            ObjectInputStream entrada;
            DataOutputStream saida;
           
            entrada = new ObjectInputStream(conexao.getInputStream());
            Pessoa pessoa = (Pessoa)entrada.readObject();
            System.out.println("Objeto tipo Pessoa, recebido com sucesso.");
            System.out.println("Nome: "+pessoa.getNome());
            System.out.println("Idade: "+pessoa.getIdade());
            
            saida = new DataOutputStream(conexao.getOutputStream());
            tempo();
            saida.writeUTF("Dados recebidos corretamente!");
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

     public static void tempo(){
        
        try {
            Thread.sleep(3500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
