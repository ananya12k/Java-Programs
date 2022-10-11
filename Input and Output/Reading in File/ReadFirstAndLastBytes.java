import java.io.*;

public class ReadFirstAndLastBytes {
    public static void main(String[] args) throws IOException {
        File f = new File(args[0]);
        FileInputStream fis = new FileInputStream(f);
        int size;
        size = fis.available();
        for (int i = 0; i < 10; i++) {
            System.out.print((char) fis.read());
        }
        System.out.println();
        fis.skip(size - 20);
        for (int i = 0; i < 10; i++) {
            System.out.print((char) fis.read());
        }
        fis.close();
    }
}
