/* Write a Java program to multiply two matrices using multithreading. Divide the task
of multiplying rows of the matrices among multiple threads to improve performance. */

package Assignment_8;

public class Q4 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        Thread[] threads = new Thread[rowsA];

        for (int i = 0; i < rowsA; i++) {
            final int row = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < colsB; j++) {
                    int sum = 0;
                    for (int k = 0; k < colsA; k++) {
                        sum += A[row][k] * B[k][j];
                    }
                    result[row][j] = sum;
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < rowsA; i++) {
            try { threads[i].join(); } 
            catch (InterruptedException e) {}
        }

        // Print result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}