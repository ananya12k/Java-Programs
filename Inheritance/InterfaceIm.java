interface A {
    void add();
}

interface B {
    void sub();
}

public class InterfaceIm implements A, B {
    public void add() {
        System.out.println(77);
    }

    public void sub() {
        System.out.println(88);
    }

    public static void main(String[] args) {
        InterfaceIm I = new InterfaceIm();
        I.add();
        I.sub();
    }
}
