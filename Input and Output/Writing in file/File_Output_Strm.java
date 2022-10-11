import java.io.*;

public class File_Output_Strm {
    public static void main(String[] args) throws IOException{
        File f=new File("C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f2.txt");
        FileOutputStream fos =new FileOutputStream(f);
        String s="Hello World Hi I am Ananya";
        byte b[]=s.getBytes();
        fos.write(b);
        fos.close();
    }
}
