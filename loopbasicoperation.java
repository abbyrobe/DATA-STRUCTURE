public class loopbasicoperation {
    public static void main(String[] args) {
        int n = 10; // Example of an input size
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // Linear time complexity O(n)
        }

        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}