import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a:");
        ensureShort(scan);
        final short a = scan.nextShort();
        System.out.println("Enter number b:");
        ensureShort(scan);
        final short b = scan.nextShort();
        System.out.println("Enter number n:");
        ensureShort(scan);
        final short n = scan.nextShort();
        System.out.println("Enter number m:");
        ensureShort(scan);
        final short m = scan.nextShort();
        final short C = 1;
        double s = 0;
        if (a <= C && C <= n) {
            System.out.println("Error! Division by zero.");
        } else {
            for (short i = a; i <= n; i++) {
                for (short j = b; j <= m; j++) {
                    s += (double) (i - j) / (i - C);
                }
            }
            System.out.println("Result: " + s);
        }
    }

    private static void ensureShort(Scanner scan) {
        while (!scan.hasNextShort()) {
            System.out.println("was in input buffer: \"" + scan.nextShort() + "\"");
            System.out.println("Please enter number in the range -32768 to 32767 (not other symbol(s)).");
        }
    }
}