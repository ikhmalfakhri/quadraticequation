package quadraticeq;

import java.util.Scanner;

public class QuadraticEq {

    //function to check range of integer input
    public static boolean rangeCheck(int A, int B, int C) {
        return A < -9 || A > 9 || B < -9 || B > 9 || C < -9 || C > 9;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a (1-9): ");

        int A = scanner.nextInt();

        System.out.print("Enter b (1-9): ");

        int B = scanner.nextInt();

        System.out.print("Enter c (1-9): ");

        int C = scanner.nextInt();

        double r1;
        double r2;

        if (rangeCheck(A, B, C)) {
            System.out.print("Integer(s) is not within range\n");
        } else {
            float d = B * B - 4 * A * C;

            if (d < 0) {

                System.out.println("This quadratic equation has 0 root(s).\n" + "No solution ");

            } else if (d == 0) {

                r1 = -B / (2 * A);

                System.out.println("This quadratic equation has 1 root(s),\n" + "x = " + r1);

            } else {

                r1 = (-B + (Math.sqrt(d))) / (2 * A);
                r2 = (-B - (Math.sqrt(d))) / (2 * A);

                System.out.println("This quadratic equation has 2 root(s)," + "\nx = " + r1 + "\nx = " + r2);

            }
        }
    }

}
