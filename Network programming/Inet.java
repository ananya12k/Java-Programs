import java.net.*;

public class Inet{
public static void main(String[] args) {
    InetAddress []adr=null;
    try {
        adr=InetAddress.getAllByName(args[0]);
    } catch (Exception e) {
        // TODO: handle exception
    }
   
    for (int i = 0; i < adr.length; i++) {
        System.out.println(adr[i]);
    }
}
}