import java.io.*;
public class Byte_arr {
    public static void main(String[] args) throws IOException{
        String s="Hi! I am Ananya";
        byte b[]=s.getBytes();
        ByteArrayInputStream bis =new ByteArrayInputStream(b);
        int c;
        while ((c=bis.read())!=-1) {
            System.out.print((char)c);
        }
        bis.reset();
        while ((c=bis.read())!=-1) {
            System.out.print(Character.toUpperCase((char)c));
        }
       
    }
}
