import java.io.*;
import java.util.*;

public class Scanner_Read {
    public static void main(String[] args) throws IOException {
        File f = new File(
                "C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f3.txt");
        boolean ans = f.exists();
        System.out.println("File exists : " + ans);
        // String sc;
        if (ans) {
            Scanner obj = new Scanner(f);
            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());
            }
            obj.close();

        } else {
            System.out.println("Create a file first");
        }

    }
}
