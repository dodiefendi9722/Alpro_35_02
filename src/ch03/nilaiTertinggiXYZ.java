public class nilaiTertinggiXYZ {
 public static void main(String[] args) {
     int x = 7;
     int y = 6;
     int z = 8;

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