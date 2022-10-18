public class Customer{
    int amount = 1000;

    synchronized void withDraw(int amount){
        System.out.println("going to withdraw..");

        if(this.amount < amount){
            System.out.println("Less balance ; waiting for deposit..");
        }

        this.amount -= amount;

        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit..");

        this.amount += amount;

        System.out.println("deposit completed...");

        notify();
    }
}
