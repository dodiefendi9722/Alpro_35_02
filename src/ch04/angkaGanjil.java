package ch04;

public class angkaGanjil {
    public static void main(String[] args) {
        int d[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

       System.out.println("");
       System.out.print("Bilangan Ganjil :  ");
       for (int i = 0; i < d.length; i++){
           if (d [i] % 2!= 0){
               System.out.print(d[i] + " ");
           }
       }      
       System.out.println("");
   }
}