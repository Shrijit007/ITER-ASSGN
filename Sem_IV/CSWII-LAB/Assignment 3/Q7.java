package Assignment_3;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter number of rows for Matrix A: ");
			int rowsA = sc.nextInt();
			System.out.print("Enter number of columns for Matrix A: ");
			int colsA = sc.nextInt();
			int[][] matrixA = new int[rowsA][colsA];

			System.out.println("Enter elements of Matrix A:");
			for (int i = 0; i < rowsA; i++) {
				for (int j = 0; j < colsA; j++) {
					matrixA[i][j] = sc.nextInt();
				}
			}
			System.out.print("Enter number of rows for Matrix B: ");
			int rowsB = sc.nextInt();
			System.out.print("Enter number of columns for Matrix B: ");
			int colsB = sc.nextInt();
			int[][] matrixB = new int[rowsB][colsB];

			System.out.println("Enter elements of Matrix B:");
			for (int i = 0; i < rowsB; i++) {
				for (int j = 0; j < colsB; j++) {
					matrixB[i][j] = sc.nextInt();
				}
			}
			if (rowsA == rowsB && colsA == colsB) {
				int[][] sumMatrix = new int[rowsA][colsA];
				for (int i = 0; i < rowsA; i++) {
					for (int j = 0; j < colsA; j++) {
						sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
					}
				}
				System.out.println("Matrix Addition Result:");
				for (int i = 0; i < rowsA; i++) {
					for (int j = 0; j < colsA; j++) {
						System.out.print(sumMatrix[i][j] + " ");
					}
					System.out.println();
				}
			} else {
				System.out.println("Matrix addition is not possible due to dimension mismatch.");
			}
			if (colsA == rowsB) {
				int[][] productMatrix = new int[rowsA][colsB];
				for (int i = 0; i < rowsA; i++) {
					for (int j = 0; j < colsB; j++) {
						for (int k = 0; k < colsA; k++) {
							productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
						}
					}
				}
				System.out.println("Matrix Multiplication Result:");
				for (int i = 0; i < rowsA; i++) {
					for (int j = 0; j < colsB; j++) {
						System.out.print(productMatrix[i][j] + " ");
					}
					System.out.println();
				}
			} else {
				System.out.println("Matrix multiplication is not possible due to dimension mismatch.");
			}
			int[][] transposeA = new int[colsA][rowsA];
			for (int i = 0; i < colsA; i++) {
				for (int j = 0; j < rowsA; j++) {
					transposeA[i][j] = matrixA[j][i];
				}
			}
			System.out.println("Transpose of Matrix A:");
			for (int i = 0; i < colsA; i++) {
				for (int j = 0; j < rowsA; j++) {
					System.out.print(transposeA[i][j] + " ");
				}
				System.out.println();
			}
			try {
				System.out.println("Trying to access out-of-bounds element:");
				System.out.println(matrixA[rowsA][colsA]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out
						.println("ArrayIndexOutOfBoundsException:Attempted to access an element out of matrix bounds.");
			}

		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
