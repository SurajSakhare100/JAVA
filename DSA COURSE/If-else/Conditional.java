import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // IF ELSE
        // int age = 30;
        // if (age > 18) {
        //     System.out.println("This is an adult");
        // } else {
        //     System.out.println("This is not an adult");
        // }

        // SWITCH CASE

        // int n = 1;
        // switch (n) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     default:
        //         System.out.println("Sunday");
        // }

        // // HOME WORK

        // // 1.MAKE CALCULATER

        // System.out.println("Enter 1st integer");
        // int a = sc.nextInt();
        // System.out.println("Enter 2nd integer");
        // int b = sc.nextInt();
        // System.out.println("Enter operation which you want to perform: ");
        // System.out.println("1:ADD 2:SUB 3:MUL 4:DIV 5:MODULO  ");
        // System.out.print("Operation : ");
        // int operation = sc.nextInt();
        // switch (operation) {
        //     case 1:
        //         System.out.println("ADDITION: " + (a + b));
        //         break;
        //     case 2:
        //         System.out.println("SUBTRACTION: " + (a - b));
        //         break;
        //     case 3:
        //         System.out.println("MULTIPLICATION: " + (a * b));
        //         break;
        //     case 4:
        //         System.out.println("DIVISION: " + (a / b));
        //         break;
        //     case 5:
        //         System.out.println("MODULOUS: " + (a % b));
        //         break;
        //     default:
        //         System.out.println("INVALID OPERATION");
        //         break;
        // }


        // Q2.Switch Months
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febuary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("invalid month");
        }
    }
}