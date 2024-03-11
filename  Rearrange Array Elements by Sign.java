/*
  Time complexity - O(N)
  Space complexity -O(N) 
  The trickiest part was to figure out that the solution can't be solved without extra spaces. 
*/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,0);
        int posIndex=0;
        int negIndex=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                ans[posIndex]=nums[i];
                posIndex+=2;
            } else{
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        return ans;
    }
}
