package ch03;
public class nilaiTertinggiXYZ {
 public static void main(String[] args) {
     int x = 20;
     int y = 55;
     int z = 14;

     System.out.println("nilai x = " + x);
     System.out.println("nilai y = " + y);
     System.out.println("nilai y = " + z);

     if (x > y && x > z)  {
         System.out.println("nilai tertinggi = " + x);

      } else if (y > x && y > z) {
         System.out.println("nilai tertinggi = " + y);

      }else{
          System.out.println("nilai tertinggi = " + z);

      }
     }
 }