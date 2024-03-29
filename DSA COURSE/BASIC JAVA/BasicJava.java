import java.util.Scanner;

public class BasicJava {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Variables

        // System.out.println("hi let's learn java");
        // String name = "Suraj";
        // int age = 30;
        // System.out.println("I am " + name + "and i am" + age + " years old.");

        int radius=sc.nextInt();
        final float PI = 3.14F;
        System.out.println("circumference of circle is "+(2*PI*radius));
    }

}
