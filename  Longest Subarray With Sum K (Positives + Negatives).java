import java.util.* ;
import java.io.*;
/*
    This solution is pretty simple and crazy at the same time.
    Here we map the prefixSum to it's index!
    While we iterate the array via a loop
    we check if we get the sum=k, that way we calculate the max of max&currentIndex+1(which is length)
    Then we check if in the map we have sum-k (which is a sum that needs to be chopped off to get sum=k)
    If we find it, we caclculate the legth from that element(that we get from map) to the current index
    And calculate the max!
    And finally we put in the sum and its index in the map
    Intereseting part to note here is that we check !prefixsumIndexMap.containsKey(sum)
    If we do not do this the answer would be wrong. we do it because we do not 
    want to overide the value if we get the sameprefixSum second time.
    Because thing about it why would you want to store the prefixSum that you
    get later that would not help in maximising the longest subarray
    To maximize the value of subarray we need to store only the prefix that we got
    first time! Think about it.

    Time complexity - O(N)
    Space compelxity - O(N)

 */ 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
        int n = nums.length; 
        HashMap<Integer,Integer> prefixsumIndexMap = new HashMap<>();
        int sum =0;
        int max = 0;
        for(int i=0; i<n; i++){
            sum=sum+nums[i];
            if(sum==k){
                max=Math.max(max,i+1);
            }
            if(prefixsumIndexMap.containsKey(sum-k)){
                max=Math.max(max, i-prefixsumIndexMap.get(sum-k));
            }
            if(!prefixsumIndexMap.containsKey(sum)){
                prefixsumIndexMap.put(sum, i);
            }
        }
        return max;
	}
}
