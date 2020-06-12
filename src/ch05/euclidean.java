package ch05;

import java.util.Scanner;

public class euclidean {

    public static void main(String[] args) {

        int a, b, r;

        Scanner dataInput = new Scanner(System.in);

        System.out.print("Masukkan nila a : ");
        a = dataInput.nextInt();
        System.out.print("Masukkan nila b : ");
        b = dataInput.nextInt();
        System.out.println();

        r = a % b;

        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        System.out.println("FPB = " + b);
    }
}
