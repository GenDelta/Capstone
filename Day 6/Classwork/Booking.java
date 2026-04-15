public class Booking {
    public static void main(String[] args) {
        Bus neeta = new Bus(2);

        Thread t1 = new Thread(neeta);
        Thread t2 = new Thread(neeta);
        Thread t3 = new Thread(neeta);

        t1.start();
        t2.start();
        t3.start();

        t1.setName("Abhay");
        t2.setName("Shweta");
        t3.setName("Madhav");
    }
}