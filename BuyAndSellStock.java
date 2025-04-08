//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/


public class BuyAndSellStock{
    public static void main (String[] args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices)); //output:5

    }
    public static int maxProfit(int[] prices){
        
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int i=0;i<prices.length;i++){

            if(prices[i]<min)
            {
                min=prices[i];
            }
            int currentprofit=prices[i]-min;
            
            if(currentprofit>maxProfit)
            {
                maxProfit=currentprofit;
            }
        }
        return maxProfit;
    }
}