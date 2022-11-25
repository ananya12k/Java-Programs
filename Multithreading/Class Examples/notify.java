// class ThreadB extends Thread {
//     int balance = 0;

// public void run()
// {
//     synchronized(this)
//     {
//         System.out.println("Child Thread");
//         for (int i = 0; i <= 5; i++) {
//             balance+=i;
//         } }
//         System.out.println("Child Thread is work");
//         this.notify();
   
// }

// }

// class notify {
//     public static void main(String[] args) {
//         ThreadB b = new ThreadB();
//         b.start();
//         synchronized(b)
//         {
//             System.out.println("Main Thread");
//             b.wait();
//             System.out.println(" ");
//             System.out.println("Main Thread");
//         }
//     }
// }
