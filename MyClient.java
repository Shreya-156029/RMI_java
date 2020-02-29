import java.rmi.*;

public class MyClient{

public static void main(String args[]){
try{

Power stub=(Power)Naming.lookup("rmi://localhost:5000/sonoo");
System.out.println(stub.power(2,3));

}catch(Exception e){System.out.println(e);}
}

}
