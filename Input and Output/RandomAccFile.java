import java.io.*;
public class RandomAccFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("D:\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\test.txt","r");
        raf.skipBytes(5);
        raf.writeChar('H');
        System.out.println("Modification done");
    }
}
