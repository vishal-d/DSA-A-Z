//Time Complexity - O(n*n)
//The selection sort is simple! We start by finding the smallest element in the array
///once we have the smallest element we place it at the first position by reversing the positions of First element to that to Smallest element.
//We then start the loop again from 2nd position and do the same! This time second position gets swaped with the smallest remaining element in the array!
public class Solution {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int pivot = 0;
        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            reverse(arr, i, minIndex);
        }
    }

    public static void reverse(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
