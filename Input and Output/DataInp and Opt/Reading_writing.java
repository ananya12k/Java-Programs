import java.io.*;

public class Reading_writing {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = null;
        DataOutputStream dos = null;
        File f = new File(
                "C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f3.txt");
        try {
            dis = new DataInputStream(System.in);
            dos = new DataOutputStream(new FileOutputStream(f));
            for (int i = 0; i <= 20; i++) {
                dis.read();
                dos.writeInt(i);
            }
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
