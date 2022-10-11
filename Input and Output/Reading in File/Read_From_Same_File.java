import java.io.*;

public class Read_From_Same_File {
    public static void main(String[] args) throws IOException {
        File f =new File(args[0]);
        BufferedReader br=new BufferedReader(new FileReader(f));
        String sc;
        while ((sc=br.readLine())!=null) {
            System.out.println(sc);
        }
        br.close();
    }
}
