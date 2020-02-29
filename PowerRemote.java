import java.rmi.*;
import java.rmi.server.*;

public class PowerRemote extends UnicastRemoteObject implements Power{

PowerRemote()throws RemoteException{
super();
}

public double power(int x,int y){return (Math.pow(x,y));}

}
