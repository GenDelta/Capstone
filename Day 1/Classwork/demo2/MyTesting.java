package demo2;

import demo1.AccessDemo;

public class MyTesting extends AccessDemo{
    public static void main(String[] args) {
        AccessDemo z = new AccessDemo();
        System.out.println("This is MyTesting Class");
        System.out.println(z.name);
        // access the protected variable 
        MyTesting xyz = new MyTesting();
        System.out.println(xyz.grade);
    }
}
