//Optimal Solution
class Solution {
    public int maxFrequency(int[] nums, int k) {
        //Fucking sliding window!
        //What do I want <= What do I have
        //nums[right]*len_of_window <= prefixSum + k
        Arrays.sort(nums);
        int right =0;
        int left =0;
        long windowLength = right-left+1;
        long sum=0;
        long maxFreq = 1;
        while(right<nums.length){
            //int operationCost = k;
            sum=sum+nums[right];
            if(!(nums[right]*windowLength<=sum+k)){
                sum=sum-nums[left];
                left++;
                windowLength--;
            }
            maxFreq=Math.max(maxFreq,windowLength);
            right++;
            windowLength++;
        }
        return (int) maxFreq;
    }
}

//Brute Force
class Solution {
    public int maxFrequency(int[] nums, int k) {
        //let us try the brute force approach first
        ///I will start first sort the array and then
        //start iterating from the end(i=1) and try to make other elements
        //i-1 elements equals to ith element by using the operationCost (K)
        //Will repeat it for the loop and keep the count of max! Let's start
        Arrays.sort(nums);
        int count=1;
        int maxFreq=1;
        int len = nums.length;
        for(int i=len-1; i>=0; i--){
            int operationCost = k;
            count=1;
            for(int j=i-1; j>=0; j--){
                int diff = nums[i]-nums[j];
                System.out.println("Diff is " + diff);
                operationCost = operationCost-diff;
                System.out.println("Remaining operating cost is "+operationCost);
                if(operationCost<0){
                    break;
                }
                count++;
                System.out.println("Count right now is "+count);
            }
            System.out.println("");
            maxFreq = Math.max(maxFreq,count);
        }
        return maxFreq;
    }
}
