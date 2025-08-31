public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            int val = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(val + " ");
                val = val * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }

}
