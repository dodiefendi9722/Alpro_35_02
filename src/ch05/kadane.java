package ch05;

public class kadane {
    public int kandaneForMaxSubArray(int[] arr) {
        int maxEndHere = 0;
        int maxSoFar = 0;
        for (int i = 0; i < arr.length; i++) {
         maxEndHere += arr[i];
         if (maxEndHere < 0) {
          maxEndHere = 0;
         }
         if (maxSoFar < maxEndHere) {
          maxSoFar = maxEndHere;
         }
        }
        return maxSoFar;
       }  
       public static void main(String args[]) {
        int arr[] = { 1, 8, -3, -7, 2, 7, -1, 9 };
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        kadane maxSum = new kadane();
        System.out.println();
        System.out.println("Nilai maximum subarray =  " + maxSum.kandaneForMaxSubArray(arr));
       }
}