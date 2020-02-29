import java.rmi.*;
public interface Power extends Remote{

public double power(int x,int y)throws RemoteException;
}
