/*
    Solid problem. A good variation of sum arrays sum equals K problem.
    Instead of sum, we put the reminders that needs to be chopped off,
    to get the remaining array divisible by K.
    We use a property where we know that:
    1) If array A when divided by K leaves reminder X
    2) And if there exists a subArray B which leaves the same reminder X when divided by K
    3) Then if we chop off that subArray from the main Array the remaining Array would be divisble by K
    4) To handle the negative reminders we add (+K) to them to get their positive equivalent.

    Time Complexity - O(N)
    Space Complexity - O(N)
*/
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> remPrefixCount = new HashMap<>();
        int count=0;
        int sum=0;
        remPrefixCount.put(0,1);
        for(int num: nums){
            sum=sum+num;
            int r = sum%k;
            if(r<0){
                r=r+k;
            }
            if(remPrefixCount.containsKey(r)){
                count=count+remPrefixCount.get(r);
            }
            remPrefixCount.put(r,remPrefixCount.getOrDefault(r,0)+1);
        }
        return count;
    }
}
