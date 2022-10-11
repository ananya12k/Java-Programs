import java.io.*;

public class FileWriter_Ex {
    public static void main(String[] args) throws IOException {
        File f = new File(
                "C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f2.txt");
        String s = "Hello world";
        FileWriter fw = new FileWriter(f);
        fw.write(s);
        fw.close();
    }
}
