/*
  This might look small from the solution stand point, but this is some interesting one. 
  This uses the famous Kadence Algorithm to calculat the maximum sub-array!
  I am not writing notes for this, since this is a very famous algorithm.
  And I mustk know this.  
  Time Complexity - O(N)
  Space Complexity - O(1)
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

/*
  Solution where I print the indexes of that maximum sub array
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int startIndex =0;
        int endIndex=0;
        for(int i=0; i<nums.length; i++){
            if(currentSum+nums[i]<nums[i]){
                currentSum=nums[i];
                startIndex=i;
                endIndex=i;
            }else{
                currentSum=currentSum+nums[i];
            }

            if(currentSum>maxSum){
                maxSum=currentSum;
                endIndex=i;
            }
        }
        System.out.println("Start index is "+startIndex+" End index is "+endIndex);
        return maxSum;
    }
}
