import java.util.*;

public class Encapsulation {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        System.out.println("Total balance is:" + b1.getBalance());

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the amount to deposit:");
        double depositAmount = sc.nextDouble();
        b1.deposit(depositAmount);
        System.out.println("amaount after deposit is:" + b1.getBalance());

        System.out.println("enter the amount to withdarw:");
        double withdarwAmount = sc.nextDouble();
        b1.withdraw(withdarwAmount);
        System.out.println("amaount left after withdraw is:" + b1.getBalance());

        

    }

}

class Bank {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount < balance && amount > 0) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient Balance , Transaction failed!");
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
