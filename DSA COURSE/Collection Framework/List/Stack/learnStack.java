import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();
        animals.push("lion");
        animals.push("cat");
        animals.push("dog");
        animals.push("cow");
        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println(animals.contains("lion"));
        System.out.println(animals.pop());
        // System.out.println(animals.get(0));
        System.out.println(animals);
        
    }
}
