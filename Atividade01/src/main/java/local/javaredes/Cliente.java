package local.javaredes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thomas Caron de Castro Deus
 * RA2627205
 */
public class Cliente {
    
    private static Socket conexao;
    private static DataInputStream dadosEntrada;
    private static DataOutputStream dadosSaida;
    private static Scanner scanner;
    
    public static void main(String[] args) {
        
        boasVindas();
        try {
            //conexão com o servidor
            conexao = new Socket("127.0.0.1", 56000);
            
            //enviar dados
            dadosSaida = new DataOutputStream(conexao.getOutputStream());
            String cpf = recebeCpf();
            dadosSaida.writeUTF(cpf);
            
            //receber resposta
            dadosEntrada = new DataInputStream(conexao.getInputStream());
            boolean respostaServidor = dadosEntrada.readBoolean();
            String resposta = respostaServidor ? "Este CPF é Válido." : "Este CPF é inválido";
            System.out.println(resposta);
            
            //fecha conexão
            conexao.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void boasVindas() {
        System.out.print(" +---------------------------------------+");
        System.out.print("\n |              BEM VINDO!!              |");
        System.out.println("\n +---------------------------------------+\n");
    }
    
    private static String recebeCpf() {
        scanner = new Scanner(System.in);
        System.out.println("Digite o CPF a ser validado: ");
        String cpf = scanner.nextLine();
        
        return cpf;
    }
}
