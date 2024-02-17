/*Okay this is a cool one!
Suppose you have an array and if you want to check if the array is:-
1) Sorted 2) Rotated both at the same time.
You need to observe the pattern and implement the observation.
Observation: Only and only it happens one time in a array that the 
Increasing pattern changes! Count that one time when the pattern changes 
And Do not mind that one time and keep comparing the array like usual.
If the count exceed one. Then we are fucked! Then the array aint sorted
The one time change in pattern that we are ignoring is coming from the 
Rotation. It is possible that at that given point rotation happened.
Therefore we need to also compare last element of the array to the first
element to keep in mind that array might be rotated.
To keep a check on that we use: nums[(i+1)%nums.length]
*/
class Solution {
    public boolean check(int[] nums) {
        int countOfChanges = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                countOfChanges++;
            }
            if(countOfChanges>1){
                return false;
            }
        }
        return true;
    }
}
