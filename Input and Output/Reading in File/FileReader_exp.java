import java.io.*;

public class FileReader_exp {
    public static void main(String[] args) throws IOException{
        File f =new File("C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f3.txt");
        FileReader fr =new FileReader(f);
        int i;
        while ((i=fr.read())!=-1) {
            System.out.print((char)i);
        }
        fr.close();
    }
}
