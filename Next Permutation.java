/*
    Some things are so intuitive that they are harder to put in words
    than to understand them and get the head around. 
    This algorithm is one classic example of that. 
    Thanks for Striver for making the intuition easier to understand. 
    Think hard about it and you would know. 
    Pasting the solution link here: https://www.youtube.com/watch?v=LuLCLgMElus

    Time Complexity - O(N)
    Space Complexity - O(1)
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int peakElement = -1;
        int swapElement = -1;
        for(int i=n-1; i>0; i--){
            if(nums[i] > nums[i-1]){
                peakElement=i-1;
                break;
            }
        }
        if(peakElement==-1){
            reverse(nums,0,n-1);
        } else{
            for(int i=n-1; i>peakElement; i--){
                if(nums[i]>nums[peakElement]){
                    swapElement=i;
                    break;
                }
            }
            swap(nums,peakElement, swapElement);
            reverse(nums, peakElement+1, n-1);
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int index1, int index2){
        while(index1<index2){
            swap(arr, index1, index2);
            index1++;
            index2--;
        }
    }
}
