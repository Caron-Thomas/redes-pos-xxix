package br.edu.utfpr.redes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    
    private static ServerSocket servidor;
    private static Socket conexao;
    private static DataInputStream entrada;
    private static DataOutputStream saida;
    
    public static void main(String[] args) {
        
        try {
            System.out.println("Aguardando conexão...");
            //especificar uma porta para aguardar conexão
            servidor = new ServerSocket(55000);
            conexao = servidor.accept();
            
            // receber dados
            int valor;
            entrada = new DataInputStream(conexao.getInputStream());
            valor = entrada.readInt();
            
            // realizar regra de negócio
            String resultado = "";
            if (valor > 0)
                resultado = "Valor é maior que zero";
            else 
                resultado = "Valor é menor que zero";

            //retornar dados ao cliente
            saida = new DataOutputStream(conexao.getOutputStream());
            saida.writeUTF(resultado);
            
            //fechar a conexão
            conexao.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
