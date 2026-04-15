public class Bus extends Thread {
    int available = 5;
    int passenger;
    Bus(int seats){
        passenger = seats;
    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();
        if(available >= passenger){
            System.out.println(name + " booked " + passenger + " seats");
            available = available - passenger;
        }
        else{
            System.out.println(name + " could not book " + passenger + " seats");
        }
    }
}