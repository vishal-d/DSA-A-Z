/*  BRUTE FORCE SOLUTION
    Time complexity - O(N log N)
    Space complexity - O(1)
    First we sort the array. 
    Then we check is nums[i] = i;
    because sorted array will put elements in place (as per this problem)
    if nums[i]!=i then we will return i
    else we will return nums.length; (because what if N is not in the array
    but every other element is!)
*/

class Solution {
    public int missingNumber(int[] nums) {  
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!= i){
                return i;
            }
        }
        return nums.length;
    }
}

/*  OPTIMAL SOLUTION 1
    Time complexity - O(N)
    Space complexity - O(1)
    This solution does not require sorting. 
    Because think about it, you would need sorting if random
    numbers are there in the array and you need to place them in an order.
    Here, numbers are not random, we know numbers are from [0 to n] with
    only and only one number missing. 
    So we already know where the number should be placed, therefore, 
    we will start placing the number to it's correct position (nums[i]=i)
    If the number is at correct position, then we will move the pointer.
    Else we will keep repeating. 
    If everything is at right position just return n.
*/
class Solution {
    public int missingNumber(int[] nums) {  
        int i =0; 
        while(i<nums.length){
            if(nums[i]<nums.length && nums[i]!=i){
                swap(nums, nums[i], i);
            } else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*  OPTIMAL SOLUTION 2 
    Time complexity - O(N)
    Space complexity - O(1)
    The most optimal and easy solution. 
    We know the sum of first n numbers is n*(n+1)/2;
    Therefore, missing number = sum of first n numbers - sum of array!
*/
class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int num: nums){
            sum2 = sum2+num;
        }
        return sum1-sum2;
    }
}
