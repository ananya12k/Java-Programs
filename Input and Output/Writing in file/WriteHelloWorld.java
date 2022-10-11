import java.io.*;;

public class WriteHelloWorld {

    public static void main(String[] args) throws IOException {
        File f = new File(
                "C:\\Users\\Home\\Documents\\DDU\\DDU Sem 3\\JAVA\\Programs\\Input and Output\\Basic_demo_file_methods\\Test.java");

        if (f.exists()) {
            FileOutputStream fos = new FileOutputStream(f);
            String s = "class Test {" +
                    "public static void main(String[] args){" +
                    "System.out.println(\"Hello World\");" +
                    "}" +
                    "}";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
        }

        else {
            System.out.println("Create new file");
        }
    }
}
