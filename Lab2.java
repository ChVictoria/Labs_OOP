/* 1429 % 5 = 4 =>  Дія, що виконується над матрицями -  C = A * B
   1429 % 7 = 1 => Тип елементів матриці - byte
   1429 % 11 = 10 => Дія з матрицею С - знайти середнє значення елементів матриці
 */

import java.util.Scanner;
import java.lang.Math;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width of matrix A");
        ensureInt(scan);
        final int a1 = scan.nextInt();
        System.out.println("Enter height of matrix A");
        ensureInt(scan);
        final int a2 = scan.nextInt();
        System.out.println("Enter width of matrix B");
        ensureInt(scan);
        final int b1 = scan.nextInt();
        System.out.println("Enter height of matrix B");
        ensureInt(scan);
        final int b2 = scan.nextInt();
        if (a1 < 0 | a2 < 0 | b1 < 0 | b2 < 0) {
            System.out.println("The height or width of matrix cannot be negative. Please enter a positive number.");
        } else {
            if (a1 != b2) {
                System.out.println("Error! The width of matrix A must be equal to the height of matrix B.");
            } else {
                byte[][] matrixA = new byte[a2][a1];
                byte[][] matrixB = new byte[b2][b1];
                byte[][] matrixC = new byte[a2][b1];
                System.out.println("Enter elements of matrix A");
                for (int i = 0; i < a2; i++) {
                    for (int j = 0; j < a1; j++) {
                        ensureByte(scan);
                        matrixA[i][j] = scan.nextByte();
                    }
                }
                System.out.println("Enter elements of matrix B");
                for (int i = 0; i < b2; i++) {
                    for (int j = 0; j < b1; j++) {
                        ensureByte(scan);
                        matrixB[i][j] = scan.nextByte();
                    }
                }

                for (int i = 0; i < a2; i++) {
                    for (int j = 0; j < b1; j++) {
                        for (int k = 0; k < a1; k++) {
                            matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                        }
                    }
                }
                System.out.println("\tmatrix C");
                for (byte[] value : matrixC) {
                    for (byte b : value) {
                        if (b < 0) {
                            System.out.printf("\t-%3d", Math.abs(b));
                        } else {
                            System.out.printf("\t%4d", b);
                        }
                    }
                    System.out.println();
                }
                double s = 0;
                for (byte[] bytes : matrixC) {
                    for (byte aByte : bytes) {
                        s += aByte;
                    }
                }
                double res = s / (matrixC.length * matrixC[0].length);
                System.out.println("Average value of matrix C elements: " + res);
            }
        }
    }

    private static void ensureByte(Scanner scan) {
        while (!scan.hasNextByte()) {
            System.out.println("was in input buffer: \"" + scan.next() + "\"");
            System.out.println("Please enter a number in the range -128 to 127 (not other symbol(s)).");
        }
    }

    private static void ensureInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("was in input buffer: \"" + scan.next() + "\"");
            System.out.println("Please enter a number (not other symbol(s)).");
        }

    }
}
