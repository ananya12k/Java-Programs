class table {
    synchronized void printtable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + i);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("error");
        }
    }

}

class thread1 extends Thread {
    table t;

    thread1(table t) {
        this.t = t;
    }

    public void run() {
        t.printtable(2);
    }
}

class thread2 extends Thread {
    table t;

    thread2(table t) {
        this.t = t;
    }

    public void run() {
        t.printtable(3);
    }
}

public class Print_table {
    public static void main(String[] args) {
        table oTable = new table();
        thread1 t1 = new thread1(oTable);
        thread2 t2 = new thread2(oTable);
        t1.start();
        t2.start();
    }
}
