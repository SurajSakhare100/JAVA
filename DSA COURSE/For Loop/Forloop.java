public class Forloop
 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        System.out.println("Even numbers between 1 and 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}