//Suppose K is 3 and N is 7. First reverse 0 to 4 positioned elements,
//then reverse 5 to 7 positioned elements
//then fucking reverse the whole array! 
//Apply this logic and solve the problem!
//NOTE: Make sure to do k=k%nums.length because after every nums.length times
//The rotation would repeat itself.
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int x = 0;
        int y = nums.length-1-k;
        reverse(nums,x,y);
        x= nums.length-k;
        y = nums.length-1;
        reverse(nums,x,y);
        x=0;
        y=nums.length-1;
        reverse(nums,x,y);
    }

    public void reverse(int[] nums, int x, int y){
        while(x<y){
            int temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;
            x++;
            y--;
        }
    }

}
