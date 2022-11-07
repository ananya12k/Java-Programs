class A {
    int a = 10;

    void show() {
        System.out.println(a);
    }
}

class B extends A {
    int a = 20;

    void show() {
        System.out.println(a);
        System.out.println(super.a);
    }
}

class C extends B {
    int a = 30;

    void show1() {
        System.out.println(a);
    }

    void show() {
        System.out.println(super.a);
    }
}

public class Multilevel_Inheritance {

    public static void main(String[] args) {
        // System.out.println("hi");
        C m = new C();
        m.show1();
        m.show();
    }
}
