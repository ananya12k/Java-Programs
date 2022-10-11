import java.io.*;

public class File_Input_Stream {
    public static void main(String[] args) throws IOException{
        File f= new File(args[0]);
        FileInputStream fis=new FileInputStream(f);
        int size;
        size=fis.available();
        for (int i = 0; i < size; i++) {
            System.out.print((char)fis.read());
        }
        fis.close();
    }
}
