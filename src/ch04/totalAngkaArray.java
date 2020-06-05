package ch04;

public class totalAngkaArray {
    public static void main (String[] args){
        int [] nilai = {92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};
        
	System.out.print("Menampilkan semua nilai array : ");

        for (int i=0;i<nilai.length;i++){
    	   System.out.print(nilai[i]+" ");
        }
	
	System.out.println();
    	System.out.print("Jumlah angka dalam array : "+nilai.length);

	System.out.println();
	
	int jumlah = 0;
	for (int angka : nilai){
	   jumlah = jumlah+angka;
	}
    	System.out.print("Penjumlahan atas semua angka : "+jumlah);
    }
}
