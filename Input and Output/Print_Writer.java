import java.io.*;
public class Print_Writer {
    public static void main(String[] args) throws IOException{
        File f= new File("C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f3.txt");
        PrintWriter pw =new PrintWriter(new FileOutputStream(f));
        for (int i = 0; i < 10; i++) {
            pw.print(i*100+" ");
        }
        if (pw!=null) {
            pw.close();
        }
    }
}
