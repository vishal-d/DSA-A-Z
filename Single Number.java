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
