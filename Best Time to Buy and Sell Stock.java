/*
  Brute force solution
  Time complexity - O(N*N)
  Space complexity - O(1)
*/
class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int n = prices.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int profit = prices[j]-prices[i];
                if(profit<0){
                    continue;
                }
                max=Math.max(max,profit);
            }
        }
        return max==Integer.MIN_VALUE? 0:max;
    }
}

/*  Optimal solution
    Time complexity - O(N)
    Space complexity - O(1)

    Think about it. 
    You'd buy at lowest
    and sell at highest.

    I always struggle with this solution but now I am getting it right. 
 */
class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = Integer.MAX_VALUE;

        for(int num: prices){
            buy = Math.min(buy,num); //buy low
            sell=Math.max(sell, num-buy); //sell high
        }
        return sell;
    }
}
