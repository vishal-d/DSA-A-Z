/*
    Solutions like these just blows away my mind at times. 
    I mean this is just simple algoritm. Simple fucking Math. 
    We at times tend to over-complicate things and think of 
    some crazy fuck algorithm. 
    At first I thought solving this problem in O(N) is impossible. 
    But here is the elegancy of this solution. Loved it. 
    Going to bookmark this one. 
    Let's look at what we are doing. 
    We know that start num(say x) of any sequence would not have 
    x-1 in the whole array. We all agree to this, right?
    Now the Idea is to store everything all elements of the array in a Set.
    Then iterate throught that array and check if for each iteration
    x-1 exists or not. 
    if x-1 exists then that number x can not be part of any sequence
    no point in calculating for that. 
    But if x-1 doesn't exists then we can say that number is a starting point of 
    a sequence. Remember that searching in Set only costs O(1) time so we are efficient till now.
    Now if x-1 doesn't exists then we will check while(x+1 exits) and keep counting till
    it exists. Do it for every iteration and keep calculating the max count. Simple. 
    Easy peasy. 

    Note that we are using a while loop inside the for loop but this algorithm still
    runs in O(N) time because
    1) Searching in sets would cost us only O(1) time. 
    2) We are only visiting every number at most 2 times. (Think about it)

    So time complexity is O(N+N) = O(2N) = O(N)

    Time complexity - O(N)
    Space complexity - O(N)
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int max = 1;
        Set<Integer> arrayNum = new HashSet<>();
        for(int num: nums){
            arrayNum.add(num);
        }
        for(Integer num : arrayNum){
            if(!arrayNum.contains(num-1)){
                int count = 1;
                int x = num; 
                while(arrayNum.contains(x+1)){
                    x=x+1;
                    count=count+1;
                }
                max=Math.max(max, count);
            }
        }
        return max;
    }
}
