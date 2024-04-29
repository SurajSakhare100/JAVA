import java.util.Random;

public class WhileLoop
 {
    public static void main(String[] args) {
        Random rand = new Random();
        int rollResult;
        
        // Roll the die until we get a 6
        while (true) {
            rollResult = rand.nextInt(6) + 1; 
            System.out.println("You rolled: " + rollResult);
            if (rollResult == 6) {
                System.out.println("Congratulations! You rolled a 6!");
                break; 
            }
        }
    }}
