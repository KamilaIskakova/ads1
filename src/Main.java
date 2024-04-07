public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{4, 2, 6, 3, 1};
        System.out.println(minElement(n, arr));
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
}