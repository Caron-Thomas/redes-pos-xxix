package local.javaredes;
/**
 * @author Thomas Caron de Castro Deus
 * RA 2627205
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UrnaDoPresidenteSecao extends Remote{
    
    public long contarVotos() throws RemoteException;
    
    public void atualizarContagem() throws RemoteException;
    
}
