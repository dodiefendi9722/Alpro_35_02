package ch06;

public class bubble_sort {

public static void main(String args[]){

    int d[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
    System.out.println("\nAngka sebelum diurutkan:\n");

    for(int k=0; k < d.length; k++)
        System.out.print( d[k]+"  ");

    System.out.println("\n");

    int i,j,temp=0;
    for(i = 0; i < d.length; i++){
        for(j = 1; j < (d.length-i); j++){
            if(d[j-1] > d[j]){
                temp = d[j-1];
                d[j-1]=d[j];
                d[j]=temp;
            }
        }
    }

    System.out.println("Pengurutan angka:\n");
    for(int k = 0; k <d.length; k++)
        System.out.print(d[k]+"  ");
}
}
