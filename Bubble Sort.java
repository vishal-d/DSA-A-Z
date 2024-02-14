//Time complexity - O(n*n)
//We start by comparing adajacent elements and keep swapping until we reach the last position
//Basically this just pushing the largest element in till the last
//Since we have already placed the largest element at the end
//This time we will do the same but run the loop only until second last position because the largest element is already at the last
//Keep repeating it until we reach the end!
//Visualization: https://www.youtube.com/watch?v=nmhjrI-aW5o

//Best Case - O(N), Worst Case - O(N*N), Average - O(N*N)

//Jesi-tesi approach
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
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

//Izzadar approach

public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        boolean swap = false;
        for(int i=n-1; i>=1; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    reverse(arr, j, j+1);
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
    }
    public static void reverse(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

