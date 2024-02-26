//Brute Force
//Just count the frequency of every element and return the one with frequency 1
//Since we have only one such element it will be easy
//Time Complexity - O(N)
//Space Complexity - O(N)
class Solution {
    public int singleNumber(int[] nums) {
        //Count frequency method;
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        for(int num: nums){
            count.put(num, count.getOrDefault(num,0)+1);
        }
        for(Integer num: count.keySet()){
            Integer c1 = count.get(num);
            if(c1==1){
                return num;
            }
        }
        return -1;
    }
}


/*
Optimal solution
Two important properties of XOR are the following:
XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2
Here all the numbers except the single number appear twice and so will form a pair. 
Now, if we perform XOR of all elements of the array, the XOR of each pair will result in 0 according to the XOR property 1.
The result will be = 0 ^ (single number) = single number (according to property 2).
Time complexity - O(N)
Space complexity - O(1)
*/
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int num: nums){
            xor=xor^num;
        }
        return xor;
    }
}
