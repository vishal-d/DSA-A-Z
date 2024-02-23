/*
  Optimal solution
  Time complexity - O(N)
  Space complexity - O(1)
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int num: nums){
            if(num==1){
                count++;
                max=Math.max(max,count);
            } else{
                count =0;
            }
        }
        return max;
    }
}
