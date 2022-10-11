import java.io.*;

public class File_constructors {
        public static void main(String[] args) {
                // 1. File(path)
                File f = new File(
                                "C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f1.txt");
                // 2. File(Directory path, child file name)
                try {
                        f.createNewFile();
                } catch (IOException e) {
                        // TODO: handle exception
                }
                File k = new File(
                                "C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods",
                                "f1.txt");
                // 3. File(File obj directory,child file name)
                File m = new File(k, "f2.txt");
                // methods for f
                System.out.println("File Name: " + f.getName());
                System.out.println("Parent name: " + f.getName());
                System.out.println("Parent File" + f.getParentFile());
                System.out.println("Path: " + f.getPath());
                System.out.println("Absolute Path: " + f.getAbsolutePath());
                System.out.println("Absolute file: " + f.getAbsoluteFile());
                System.out.println("Can read: " + f.canRead());
                System.out.println("Can write: " + f.canWrite());
                System.out.println("Is directory: " + f.isDirectory());
                System.out.println("Is file: " + f.isFile());
                System.out.println("Is hidden: " + f.isHidden());
                System.out.println("Length: " + f.length());
                System.out.println("Last Modified: " + f.lastModified());

        }

}
