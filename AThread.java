public class AThread extends Thread{
    Customer C = new Customer();
        public void run(){
            C.withDraw(15000);
            C.deposit(10000);
        }
}
