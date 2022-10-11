/*The main() method is initial point where java program execution starts. That's why the main() method is public, static and void. The parameters passed to main() method are String args[] i.e a String array. It is not necessarily the variable name can be only args, it can be any variable name i.e String names[].

Now, why args.length is zero, when no arguments passed:

When any java program is run from command line, it is run as java ProgName. The command line arguments are passed to java program as java ProgName Arg1 Arg2. Here in this example, two arguments are passed to java program ProgName. It is simple that, the arguments are passed to java program is the same way we run a command with parameters on any operating system. The arguments are passed along with command just by separator character as "space".

Java Interpreter interprets these arguments and pass to main() method of java program. When we pass arguments to java program from command line it is stored in the args[] String Array. As here two arguments are passed, while running java program args[0] and args[1] will be allowed, but args[2] will not. Same way if no arguments are passed, so java will not even allow args[0].

Java interprets the command line arguments as String array, as if we pass 2 arguments it is an array with args[0], args[1], if we pass 4 arguments it is an array with args[0], args[1], args[2], args[3] and when no arguments are passed it is still an String array object with no elements.

Thus, even when we do not pass any command line arguments to java program, still the args.length is equal to Zero - (0).*/
/*A subclass must come before its superclass in
a series of catch statements. If not,
unreachable code will be created and a
compile-time error will result. 
When you use multiple catch statements, it is important to remember that exception
subclasses must come before any of their superclasses. This is because a catch statement
that uses a superclass will catch exceptions of that type plus any of its subclasses. Thus, a
subclass would never be reached if it came after its superclass. Further, in Java, unreachable
code is an error.*/
class multiple_catch {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a= " + a);
            int b = 42 / a;
            int c[] = { 1 };// size of c is 1
            c[42] = 99;// assigning value at 42 which doesn't exists
        } catch (ArithmeticException a) {
            System.out.println("Divide by zero: " + a);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(" Array index out of bounds: " + a);

        }
        System.out.println("After Try-Catch");

    }
}
