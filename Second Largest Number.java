//Optimal Solution
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            }
            else if(a[i]<max && a[i]>secondMax){
                secondMax=a[i];
            }
        }

        for(int i=0; i<n; i++){
            if(a[i]<min){
                secondMin=min;
                min=a[i];
            }
            else if(a[i]<min && a[i]>secondMin){
                secondMin=a[i];
            }
        }
        int ans[] = new int[2];
        ans[0]=secondMax;
        ans[1]=secondMin;
        return ans;
    }
}
