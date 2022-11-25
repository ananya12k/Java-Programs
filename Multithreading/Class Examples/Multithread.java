
// class NewThread extends Thread {
//     Thread t;
//     String name;

//     NewThread(String s) {
//         name = s;
//         t = new Thread(this, name);
//         System.out.println("New Thread" + t);
//         t.start();
//     }

//     public void run() {
//         try {
//             for (int i = 5; i > 0; i--) {
//                 System.out.println(name + ": " + i);
//                 Thread.sleep(1000);
//             }
//         } catch (InterruptedException e) {
//             System.out.println(name + "Interrupted");
//         }
//         System.out.println(name + " exiting.");
//     }

// }

// class Multithread {
//     public static void main(String[] args) {
//         new NewThread("One");
//         new NewThread("Two");
//         new NewThread("Three");
//         try {
//             // wait for other threads to end
//             Thread.sleep(10000);
//         } catch (InterruptedException e) {
//             System.out.println("Main thread Interrupted");
//         }
//         System.out.println("Main thread exiting.");
//     }
// }
