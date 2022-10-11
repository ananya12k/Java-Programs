import java.io.*;

public class Copy_File {
    public static void main(String[] args) throws IOException {
        File f1 = new File(
                "C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f2.txt");
        File f2 = new File(
                "C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f3.txt");

        FileInputStream fis = new FileInputStream(f2);
        FileOutputStream fos = new FileOutputStream(f1);
        int size = fis.available();
        for (int i = 0; i < size; i++) {
            char c = (char) fis.read();
            fos.write(c);
        }
        fis.close();
        fos.close();
    }
}
