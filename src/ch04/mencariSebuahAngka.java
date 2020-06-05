package ch04;
import java.util.Scanner;
public class mencariSebuahAngka {
    public static void main(String[] args) {
        int nilai[] = {92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};
        Scanner ipt = new Scanner(System.in);

        System.out.println("masukkan nilai yang ingin anda cari");
        int nilaiX = ipt.nextInt();
        boolean benar = false;

        for (int i = 0; i < nilai.length; i++) {

            if (nilai[i] == nilaiX) {
                System.out.println("Angka = " + nilaiX + " berada pada indeks " + i);
                benar = true;

            }
        }
    }
}
