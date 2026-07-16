public class nestedloop {
    public static void main(String[] args) {
        int n = 5; // Example input size
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sum += i * j; // Nested loop with quadratic time complexity O(n^2)
            }
        }
        System.out.println("The sum of products is: " + sum);
    }
}