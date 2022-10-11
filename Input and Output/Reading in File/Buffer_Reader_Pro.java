import java.io.*;

public class Buffer_Reader_Pro {
    public static void main(String[] args) throws IOException{
        File f =new File("C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f3.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
        String st;
        while ((st=br.readLine())!=null) {
            System.out.println(st);
        }
        br.close();
    }
}
