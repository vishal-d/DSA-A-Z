/*
An easy peasy solution. 
Iterate from back and keep finding the previous max and adding it to the list. 

Think about it!

Time Complexity - O(N)
Space complexity-O(N)
*/
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        List<Integer> answer = new ArrayList<>();
        int n  = a.length;
        int prevMax = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            if(a[i]>prevMax){
                prevMax=a[i];
                answer.add(a[i]);
            }
        }
        return answer;
    }
}
