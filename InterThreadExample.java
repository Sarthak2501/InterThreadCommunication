public class InterThreadExample  {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        AThread t1 = new AThread();
        t1.run();
    }
}