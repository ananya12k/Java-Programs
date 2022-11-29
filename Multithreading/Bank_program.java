import java.util.*;
class account
{
    int bal=0;
    account(int ac)
    {
        bal=ac;
    }
    
    synchronized void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter withdrawal amt:");
        int x=sc.nextInt();
        if(x<bal)
        {
            bal=bal-x;
            System.out.println("Current acc bal: "+bal);
        }
        else
        {
            System.out.println("Withdrawal amt is greater than acc bal so deoposit money first:");
            System.out.println("Current acc bal: "+bal);
            deposit();
        }
        
    }
    synchronized void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amt to be deposited:");
        int x=sc.nextInt();
        bal=bal+x;
        System.out.println("Current acc bal: "+bal);
    }
}

public class Bank_program extends Thread{
    
    public void run()
    {
        account a=new account(10000);
        System.out.println("Enter 1 to withdraw and 2 to deposit money");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i==1)
            a.withdraw();
        else if(i==2)
            a.deposit();

    }
    public static void main(String[] args) {
        Bank_program b=new  Bank_program();
        Thread t=new Thread(b);
        t.start();
        
    }
}