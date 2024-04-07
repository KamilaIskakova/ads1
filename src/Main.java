public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{4, 2, 6, 3, 1};
        // System.out.println(minElement(n, arr));
        // System.out.println(average(n, arr));
        // System.out.println(isPrime(7));
        // System.out.println(factorial(n));
        System.out.println(fibonacci(n));

    }

    static int minElement(int n, int[] arr) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    /**
     * This method finds the minimum element in an array.
     * @param n The size of the array.
     * @param arr The array containing elements.
     * @return The minimum element in the array.
     */
    static float average(int n, int[] arr){
        float sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum / n;
    }
    /**
     * This method calculates the average of elements in an array.
     * @param n The size of the array.
     * @param arr The array containing elements.
     * @return The average of elements in the array.
     */
    static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * This method checks if a given number is prime.
     * @param n The number to be checked for primality.
     * @return true if the number is prime, false otherwise.
     */
    static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }
/**
 * This method calculates the factorial of a given number recursively.
 * @param n The number for which factorial is to be calculated.
 * @return The factorial of the given number.
 */
    static int fibonacci(int n){
        if(n == 1) return 1;
        if(n == 0) return 0;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
/**
 * This method computes the nth Fibonacci number recursively.
 * @param n The index of the Fibonacci number to be computed.
 * @return The nth Fibonacci number.
 */
}
