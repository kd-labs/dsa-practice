package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class RevisingQuadraticEquations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printRootsInfo(a, b, c);
    }

    private static void printRootsInfo(int a, int b, int c) {

        int d = getDeterminant(a, b, c);
        if(d > 0) {
            System.out.println("Real and Distinct");
        } else if(d == 0) {
            System.out.println("Real and Equal");
        } else {
            System.out.println("Imaginary");
        }
        if(d >= 0) {

            int root1 = (int)(-b + Math.sqrt(d))/2*a;
            int root2 = (int)(-b - Math.sqrt(d))/2*a;

            if(root1 <= root2)
                System.out.println(root1 + " " + root2);
            else
                System.out.println(root2 + " " + root1);
        }
    }

    private static int getDeterminant(int a, int b, int c) {
        return (b*b) - 4 * a * c;
    }
}
