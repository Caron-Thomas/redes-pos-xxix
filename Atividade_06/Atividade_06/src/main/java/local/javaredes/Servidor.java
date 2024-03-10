package local.javaredes;
/**
 * @author Thomas Caron de Castro Deus
 * RA 2627205
 */

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor implements UrnaDoPresidenteSecao{
    
    private Candidato candidato = new Candidato();
    
    public static void main(String[] args) {
        
        try {
            Registry servidorRegistro = LocateRegistry.createRegistry(1099);
            Servidor servidor = new Servidor();
            
            UrnaDoPresidenteSecao skeleton = (UrnaDoPresidenteSecao) UnicastRemoteObject.exportObject(servidor, 0);
            servidorRegistro.bind("UrnaPresidente", skeleton);
            System.out.println("Servidor Urna iniciado....");
            
            
            
        } catch (RemoteException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public long contarVotos() throws RemoteException {
        return candidato.getVotos();
    }

    @Override
    public void atualizarContagem() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
