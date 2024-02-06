package stream;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExp {

    public static void main(String[] args) {
        // Implementing addition using a lambda expression
        MathOperation addition = (a, b) -> a + b;

        // Example usage
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result);
    }
}
