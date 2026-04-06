package demo1;
public class AccessDemo {

    int age = 36; //default 
    public String name = "demo";
    private float percentage = 76.65f;
    protected char grade = 'b';
    static String language = "Java";

    public static void main(String[] args) {
        System.out.println("Welcome to access demo class");
        AccessDemo aa = new AccessDemo();
        System.out.println(AccessDemo.language);
        System.out.println("My age is "+aa.age);
        System.out.println("I scored "+aa.percentage);
        System.out.println("My grade is "+aa.grade);
        System.out.println("My name is "+aa.name);
    }
}