
class demo extends Thread{
public void run()
{
    for (int i = 1; i <=10; i++) {
        System.out.println("demo "+i);
    }
}
        public static void main(String[] args) {
            demo d1=new demo();
            d1.start();
        }
}