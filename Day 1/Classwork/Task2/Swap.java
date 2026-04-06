package Task2;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        // a = 20 
        // b = 10 
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
    }
}
