package ch06;

public class selection_sort {
    public static void main(String[] args) {

        int[] tabInt = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int i,j,N;
        N=13;
        
        for (i = 0; i < N; i++) {
              int min = tabInt[i];
              int pos = i;
              for (j = i; j < N; j++) {
                   
                   if (tabInt[j] < min) {
                   min = tabInt[j];
                   pos = j;
                }
              }
              
              if(i!=pos) {
                 int temp = tabInt[i];
                 tabInt[i] = tabInt[pos];
                 tabInt[pos] = temp;
               }
            }
        for(i=0; i<13; i++){ 
            System.out.print(tabInt[i]+" ");
        }
    }
}
