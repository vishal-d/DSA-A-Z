/*
We keep a track of prefixSum and number of couts of that specific prefix sum in a array
then we first put (0,1) in the array to assume that the 0 perfix sum occurs one time

The idea here is that to find our a sub array that could be chopped off from the current sub array
to get the sum=k
If their exists a sum-k in the map;
That is the array that needs to be chopped off to 
get the subrray with sum=k.
Time Compelxity - O(N)
Space Complexity - O(N)
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum =0;
        HashMap<Integer,Integer> prefixsumCount = new HashMap<>();
        prefixsumCount.put(0,1);
        int count =0;
        for(int num: nums){
            sum=sum+num;
            if(prefixsumCount.containsKey(sum-k)){
                count = count + prefixsumCount.get(sum-k);
            }
            prefixsumCount.put(sum, prefixsumCount.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
