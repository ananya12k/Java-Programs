
class first implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}

class second implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}

class solution {
    public static void main(String[] args) {
        first f1 = new first();
        ThreadGroup tg1 = new ThreadGroup("Parent Thread");
        Thread t1 = new Thread(tg1, f1, "one");
        Thread t2 = new Thread(tg1, f1, "two");
        Thread t3 = new Thread(tg1, f1, "three");

        second s1 = new second();
        ThreadGroup tg2 = new ThreadGroup("Parent Thread");
        Thread T1 = new Thread(tg2, s1, "First");
        Thread T2 = new Thread(tg2, s1, "Second");
        Thread T3 = new Thread(tg2, s1, "Third");
        t1.start();
        t2.start();
        t3.start();
        T1.start();
        T2.start();
        T3.start();
    }
}
