import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{4, 2, 6, 3, 1};
        // System.out.println(minElement(n, arr));
        // System.out.println(average(n, arr));
        // System.out.println(isPrime(7));
        // System.out.println(factorial(n));
        // System.out.println(fibonacci(n));
        // System.out.println(power(4, 3));
        // arr = reverseArray(n, arr);
        //for (int i = 0; i < n; i++) {
            //System.out.print(i + " ");
        //}
        // System.out.println(isDigit("123a123"));
        int a = 5;        int b = 4;
        //System.out.println(binomial(5, 4));
        // System.out.println(gcd(a, b));
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(upper(input));
        scanner.next();
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
    static int power(int a, int n){
        if(n == 0) return 1;
        return a * power(a, n - 1);
    }
/**
 * This method computes the power of a number recursively.
 * @param a The base.
 * @param n The exponent.
 * @return The result of a raised to the power of n.
 */
    static int[] reverseArray(int n, int[] arr){
        int temp = arr[arr.length - n];
        arr[arr.length - n] = arr[n - 1];
        arr[n - 1] = temp;
        if(n - 1 == Math.floor(arr.length / 2f)) return arr;
        return reverseArray(n - 1, arr);
}
/**
 * This method reverses an array recursively.
 * @param n The size of the array.
 * @param arr The array to be reversed.
 * @return The reversed array.
 */
    static boolean isDigit(String s){
        if(s.equals("")) return true;
        if(48 > s.charAt(0) || 57 < s.charAt(0)) return false;
        return isDigit(s.substring(1));
    }
/**
 * This method checks if a given string consists of digits only.
 * @param s The string to be checked.
 * @return true if the string consists of digits only, false otherwise.
 */
    static int binomial(int n, int k){
        if(k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
/**
 * This method computes binomial coefficients recursively.
 * @param n The total number of items.
 * @param k The number of items to choose from the total.
 * @return The binomial coefficient (n choose k).
 */
    static int gcd(int a, int b){
        if(a == 0) return b;
        if(b == 0) return a;
        return gcd(b, a % b);
    }
/**
 * This method computes the greatest common divisor (GCD) of two numbers using Euclid's algorithm recursively.
 * @param a The first number.
 * @param b The second number.
 * @return The greatest common divisor (GCD) of a and b.
 */

    static String upper(String text){
        if(text.isEmpty()) return "";
        int text= text.charAt(0);
        if(text >= 97 && text <= 122) text-=32;
        return (char) text+ upper (text.substring(1));
    }

}



