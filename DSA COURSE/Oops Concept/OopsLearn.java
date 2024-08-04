/**
 * OopsLearn
 */
import Bank.Bank ;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    Person() {

    }

    Person(Person p2) {
        this.name = p2.name;
        this.age = p2.age;
    }

    public void greet() {
        System.out.println("hi " + this.name + " and your age is " + this.age);
    }

    public void welcome() {
        System.out.println("welcome " + this.name);
    }

    public void printInfo(String name,int age) {
        System.out.println("my name" + name + " and age is " + age);
    }

    public void printInfo(int age) {
        System.out.println("my  age is " + age);
    }

    public void printInfo(String name) {
        System.out.println("my name" + name);
    }
}

class Student extends Person{
    int studId;
    Student(){
        super();
    }
}
class Shape{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{
    public void area(int l ,int b){
        System.out.println(l*b*0.5);
    }
}
class EqiTriangle extends Triangle{
    public void area(int l ,int b){
        System.out.println(l*b*0.5);
    }
}
class Circle extends Shape{
    public void area(int r ){
        System.out.println(3.14*r*r);
    }
}

public class OopsLearn {

    public static void main(String args[]) {
        Person p1 = new Person("suraj sakhare", 21);
        Person p2 = new Person(p1);
        Person p3 = new Person("baniya", 45);
        // p1.greet();
        // p1.welcome();
        // p2.greet();
        // p3.greet();
        // p1.printInfo("hardik");
        // p1.printInfo(16);
        // p1.printInfo("lalu",16);
        // Student s1=new Student();
        // s1.greet();
        Triangle t1=new Triangle();
        t1.area(12,3);
        Bank.Bank.hello();
    }
}