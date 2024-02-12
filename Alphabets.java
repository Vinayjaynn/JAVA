import java.util.*;

public class Alphabets {
    public static void main(String args[]) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("");
        for (int i = 0; i < n; i++) {

            // A

            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) || (j == 0 && i > 0) || (j == n - 1 && i > 0) || i == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // B

            for (int j = 0; j < n; j++) {
                if ((i == 0 && j < n - 1) || j == 0 || (i == n - 1 && j < n - 1)
                        || (j == n - 1 && i < n - 1 && i > 0 && i != (n - 1) / 2) || (i == (n - 1) / 2 && j < n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // C

            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0) || (j == 0 && i > 0 && i < n - 1) || (i == n - 1 && j > 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // D

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 1 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // E

            for (int j = 0; j < n; j++) {
                if ((i == 0 && j < n - 1) || j == 0 || (i == n - 1 && j < n - 1) || (i == (n - 1) / 2 && j < n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // F

            for (int j = 0; j < n; j++) {
                if (i == 0 && j < n - 1 || j == 0 || i == (n - 1) / 2 && j < n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // G
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 || j == 0 && i > 0 && i < n - 1 || (i == n - 1 && j > 0)
                        || (i == (n - 1) / 2 && j != 1) || (j == n - 1 && i != 1 && i != 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // H

            for (int j = 0; j < n; j++) {
                if (i == (n - 1) / 2 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // I

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // J

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || (i == n - 1 && j <= (n - 1) / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("   ");
        }

        System.out.println("");

        // K

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i <= (n - 1) / 2 && i + j == n - 2) || (i >= (n - 1) / 2 && i - j == 1)
                        || j == 1 && i == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // L

            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1 && j < n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // M

            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || (j <= (n - 1) / 2 && i == j) || (j >= (n - 1) / 2 && j + i == n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // N

            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // O

            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < n - 1 || j == 0 && i > 0 && i < n - 1 || i == n - 1 && j < n - 1 && j > 0
                        || j == n - 1 && i > 0 && i < n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // P

            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j <= n - 2) || (j == n - 2 && i <= (n - 1) / 2)
                        || (i == (n - 1) / 2 && j <= n - 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // Q

            for (int j = 0; j < n; j++) {
                if ((i == 0 && j < n - 1) || (j == 0 && i < n - 1) || (i == n - 2 && j < n - 1)
                        || (j == n - 2 && i < n - 1) || (i == j && i >= (n - 1) / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // R

            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i <= (n - 1) / 2 && j == n - 2)
                        || (i == (n - 1) / 2 && j < n - 1) || (i > (n - 1) / 2 && i - j == 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // S

            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 || i == n - 1 && j < n - 1 || i == (n - 1) / 2 && j > 0 && j < n - 1
                        || (j == 0 && i < (n - 1) / 2 && i > 0) || (j == n - 1 && i > (n - 1) / 2 && i < n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // T

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < n; i++) {

            // U

            for (int j = 0; j < n; j++) {
                if (j == 0 && i < n - 1 || i == n - 1 && j > 0 && j < n - 1 || j == n - 1 && i < n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // V

            for (int j = 0; j < n; j++) {
                if ((j == 0 && i < n - 2) || (j == n - 1 && i < n - 2) || i - j == 2 || (i == j && i == n - 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // W

            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || (i + j == n - 1 && j <= (n - 1) / 2) || (i == j && i >= (n - 1) / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // X

            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // Y

            for (int j = 0; j < n; j++) {
                if ((i <= (n - 1) / 2 && i + j == n - 1) || (i <= (n - 1) / 2 && i == j)
                        || (i >= (n - 1) / 2 && j == (n - 1) / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // Z

            for (int j = 0; j < n; j++) {
                if (i == 0 || i + j == n - 1 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}