public class fibonacci {
    public static void main(String[] args) {
        int n = 5; // Example input size
        int result = fibonacci(n); // Calculate the nth Fibonacci number
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
