package ch03;

import java.util.Scanner;

public class PembagiBilangan {
    public static void main(String args[]){
        
        String fak = "";
        Scanner baca;
        
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        int bil = Integer.parseInt(in.next());
        
        for (int i=1; i<=bil; i++){
            if (bil%i==0){
             fak+=i+" ";
            }   
        }
        System.out.print(fak);
    }
}    


