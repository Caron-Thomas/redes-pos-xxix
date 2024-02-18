package local.javaredes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thomas Caron de Castro Deus
 * RA2627205
 */
public class Servidor {
    
    private static ServerSocket servidor;
    private static Socket conexao;
    private static DataInputStream dadosEntrada;
    private static DataOutputStream dadosSaida;
    private static final int[] bulk = {11,10,9,8,7,6,5,4,3,2};
            
    public static void main(String[] args) {
        
        try {
            //init servidor
            System.out.println("Servidor aguardando conexão...");
            InetAddress bindAddr = InetAddress.getByName("127.0.0.1");
            servidor = new ServerSocket(56000, 0, bindAddr);  
            conexao = servidor.accept();
            
            //receber dados
            String cpf;
            dadosEntrada = new DataInputStream(conexao.getInputStream());
            cpf = dadosEntrada.readUTF();
            
            //regra de negócio
            boolean validado;
            validado = validaCpf(cpf);
            
            //retorna dados ao cliente
            dadosSaida = new DataOutputStream(conexao.getOutputStream());
            dadosSaida.writeBoolean(validado);
            
            //fecha conexão
            conexao.close();
            
        }    
        catch (IOException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static boolean validaCpf(String cpf){
    
    cpf = cpf.trim().replaceAll("\\D" , "");
    if(cpf == null)
        return false;

    cpf = zeroLeft(cpf, '0');
    System.out.println(cpf);

    for(int i = 0; i < 10; i++) {
        if(zeroLeft(Integer.toString(i), Character.forDigit(i, 10)).equals(cpf))
            return false;
    }

    Integer dig1 = calculateDigit(cpf.substring(0,9), bulk);
    Integer dig2 = calculateDigit(cpf.substring(0,9) + dig1, bulk);

        return cpf.equals(cpf.substring(0,9) + dig1.toString() + dig2.toString());
    }

    private static int calculateDigit(String s, int[] bulk) {
        int sum = 0;
        for (int i = s.length() - 1 , digit; i >= 0 ; i--) {
            digit = Integer.parseInt(s.substring(i, i+1));
            sum +=digit * bulk[bulk.length - s.length() + i];
        }
        sum = 11 - sum % 11;
        return sum > 9 ? 0 : sum;
    }

    private static String zeroLeft(String cpf, char character) {
        return String.format("%11s", cpf).replace(' ' , character);
    }
}
