import java.util.* ;
import java.io.*; 
//Time and Space complexity = O(N)
public class Solution {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        for(int i=0; i<n-1; i++){
            swap(arr,i, i+1);
        }
        return arr;
    }
    static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
