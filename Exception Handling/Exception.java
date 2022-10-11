class Exception {
    public static void main(String[] args) {
        int a, d;
        d = 0;
        try {
            a = 42 / d;
            System.out.println("This statement will not be executed");
        } catch (ArithmeticException k) {
            System.out.println("Divide by zero not allowed");
        }
        System.out.println("After catch statement");
    }
}