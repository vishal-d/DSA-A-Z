//This is a super cool thing! I have realised with time that we are progressing into better soritn approaches.
//For example: Selection sort was very poor, bubble sort was kind of nice because the best case complexity was O(N)
//Insertions seems to be more refined becuase of the it is not necessary that we will always go into the nested loop! 
//Because the idea of insetion sort is to take an array for 0 to 1 and see if it is sorted, then move to 0 to 2 and check if it is sorted,
//then move from 0 t0 3 and so on till 0 to n-1; so from moving from (0 to 2) to (0 to 3) we are only concerned about the 2nd and 3rd index element
//if they are sorted we won't move into nested loop because we already sorted (0 to 2) that is why we moved to 0 to 3;
//It is basically taking each sub-array sorting it and then adding a new next element in the sub-array to see if the sub array is still sorted.
//It is like taking an element of the array, placing it to it's correct position and then moving to the next element. So it is more refine!

//Best Case - O(N), Worst Case - O(N*N), Average - O(N*N)

public class Solution {
    public static void insertionSort(int[] arr, int size) {
        int n = size;
        for(int i=1; i<n; i++){
            if(arr[i] < arr[i-1]){
                int temp = i;
                while(temp>0 && arr[temp]<arr[temp-1]){
                    reverse(arr, temp, temp-1);
                    temp--;
                }
            }
        }
    }
    public static void reverse(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
