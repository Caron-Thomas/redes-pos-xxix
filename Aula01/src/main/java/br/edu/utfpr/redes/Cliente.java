package br.edu.utfpr.redes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    
    private static Socket conexao;
    private static DataInputStream entrada;
    private static DataOutputStream saida;
    
    public static void main(String[] args) {
        
        try {
            //conectar ao servidor
            conexao = new Socket("127.0.0.1", 55000);
            
            //enviar um numero interio
            saida = new DataOutputStream(conexao.getOutputStream());
            int num = 10;
            saida.writeInt(num);
            
            // receber resposta
            entrada = new DataInputStream(conexao.getInputStream());
            String resposta = entrada.readUTF();
            System.out.println("Resposta do servidor: " + resposta);
            
            // fechar conexão
            conexao.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
