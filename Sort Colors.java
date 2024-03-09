/*
  Dutch National Flag Algorithm
*/
class Solution {
    public void sortColors(int[] nums) {
        //Dutch flag algorithm
        int high =nums.length-1;
        int low=0;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,high,mid);
                high--;
            }
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
  Brute Force
*/
class Solution {
    public void sortColors(int[] nums) {
        //Dutch flag algorithm
        int high =nums.length-1;
        int low=0;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,high,mid);
                high--;
            }
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
