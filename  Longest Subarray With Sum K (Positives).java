/*
  Simple Fucking sliding window problem that I was able to figure out. 
  Time complexity - O(N)
  Space complexity - O(N)
*/

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int left=0;
        int right=0;
        long sum =0;
        int maxFreq = 0;
        while(right<a.length){
            sum=sum+a[right];
            while(sum>k){
                sum=sum-a[left];
                left++;
            }
            if(sum==k){
                maxFreq = Math.max(maxFreq, right-left+1);
            }
            right++;
        }
        return maxFreq;
    }
}
