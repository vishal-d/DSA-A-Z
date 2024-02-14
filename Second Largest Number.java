//Brute Force - Time Complexity - O(N log N)
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        Arrays.sort(a);
        //int secondLargest = a[n-2];
        //1,2,3,5,5
        int secondLargest = a[n-2];
        for(int i=n-1; i>=0; i--){
            if(a[n-1]!=a[i]){
                secondLargest=a[i];
                break;
            }
        }

        int secondSmallest = a[1];
        //1,1,2,3,4
        for(int i=1; i<n; i++){
            if(a[i]!=a[0]){
                secondSmallest=a[i];
                break;
            }
        }
        return new int[]{secondLargest,secondSmallest};
    }
}

//Better Solution - One Pass solution - O(N)
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(a[i],max);
            min = Math.min(a[i],min);
        }
        
        int secondMax=Integer.MIN_VALUE;
        int secondMin=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(a[i]!=max){
                secondMax=Math.max(a[i], secondMax);
            }
            if(a[i]!=min){
                secondMin=Math.min(a[i], secondMin);
            }
        }
        return new int[]{secondMax,secondMin};
    }
}

//Optimal Solution- Time Complexity - O(N)
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            }
            if(a[i]>secondMax && a[i]<max){
                secondMax=a[i];
            }
            if(a[i]<min){
                secondMin=min;
                min=a[i];
            }
            if(a[i]>min && a[i]<secondMin){
                secondMin=a[i];
            }
        }
        return new int[]{secondMax, secondMin};
    }
}
