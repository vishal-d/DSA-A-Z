/* Do not stress much, first look what is happening.
    Since we need to move the zeros at the end.
    Therefore, we will first look at non-zero values
    and put them in their order, ignoring zeros.
    Then we will fill the remaining positions by zeros!
    O(N) Time and Space complexity!
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for(int i=j; j<nums.length; j++){
            nums[j]=0;
        }
    }
}
