import java.io.*;

public class Read_console {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String : ");
        String st=br.readLine();
        while ((st)!=null) {
            System.out.println(st);
        }
    }

}