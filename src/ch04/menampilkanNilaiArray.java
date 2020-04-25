package ch04;
public class menampilkanNilaiArray {

    public static void main(String[] args) {

        int d[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        Array(d);
    }

    public static void Array(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}