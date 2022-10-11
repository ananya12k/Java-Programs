import java.io.*;

class Create {
    public static void main(String[] args) {
        File f = new File(
                "C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\f1.txt");
        System.out.println(f.getName());
        System.out.println(f.getParentFile());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getParent());
        boolean ans = f.isDirectory();
        boolean k = f.isFile();
        boolean m = f.isHidden();
        boolean l = f.canRead();
        boolean p = f.canWrite();
        boolean s = f.exists();
        System.out.println("Is directory: "+ans);
        System.out.println("Is file: "+k);
        System.out.println("Is hidden: "+m);
        System.out.println("Can write: "+p);
        System.out.println("Can read: "+l);
        System.out.println("Exists :"+s);
    }
}