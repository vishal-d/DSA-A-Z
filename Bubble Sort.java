//Time complexity - O(n*n)
//We start by comparing adajacent elements and keep swapping until we reach the last position
//Basically this just pushing the largest element in till the last
//Since we have already placed the largest element at the end
//This time we will do the same but run the loop only until second last position because the largest element is already at the last
//Keep repeating it until we reach the end!

public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        int swapCounter=0;
        int windowCounter =n;
        for(int i=0; i<windowCounter; windowCounter--){
            for(int j=0; j<n-1-swapCounter; j++){
                if(arr[j]>arr[j+1]){
                    reverse(arr, j, j+1);
                }
            }
            swapCounter++;
        }
    }

    public static void reverse(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
