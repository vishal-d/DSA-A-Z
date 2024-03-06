/*
    I am afraid of this question, I don't know it somehow scares me
    so let us break this down and get done with it. Stronger everyday.
    We will compare the last elements of each array and keep filling 
    from the last position. 
    Imagine, if the last element of nums1 > last element of nums2
    since the arrays are sorted then obviously last element of nums1
    would be the greatest of merged array! think about this. 
    We will leverage this approach and keep iterating until we reach the last
    element of the nums2 array, because that is the array that needs to be 
    merged in num1 so iterating till last element of nums2 makes sense.
    Now what if we have completed all the elements of nums1 array but
    We are still left with nums2 element, since we are done with nums1 array 
    We will just fix the elements of nums2 as it is in nums1 as we have
    nothing to compare to and those elements are already sorted we konw that
    already! 
    Cheers! We broke down the problem.

    Time complexity - O(N)
    Space complexity - O(1)

*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        while(p2>=0){
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[p3]=nums1[p1];
                p1--;
            } else{
                nums1[p3]=nums2[p2];
                p2--;
            }
            p3--;
        }
    }
}
