package 顺序刷题;

/**
 * @classname BuyStock_2
 * @description：buyStock1只是买卖一次，这个是可以买卖多次，求最大收益
 * @author：dml
 * @date 2020/12/17 11:11
 * @version: 1.0
 */
public class BuyStock_2 {
    public static void main(String[] args) {
        int[] prices ={1,2,3,5,6,7,8};
        System.out.println(maxProfit1(prices));
        System.out.println(maxProfit2(prices));
        System.out.println(maxProfit3(prices));
    }
    public static int maxProfit1(int[] prices){
        int length = prices.length;
        if(length<2){
            return 0;
        }
        int[][] dp = new int[length][2];
//        dp[i][j]  i表示第i天，j表示有无股票，0表示卖出，1表示持有
        dp[0][0]=0;
        dp[0][1]= -prices[1];

        for(int i=1;i<length;i++){
            dp[i][0]= Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]= Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);

        }
        return dp[length-1][0];
    }
//  优化空间，设置一维向量
    public static int maxProfit2(int[] prices){
        int length = prices.length;
        if(length<2){
            return 0;
        }
/**
 *  cash 持有现金
 *  hold 持有股票
 *
 */
        int[] cash = new int[length];
        int[] hold = new int[length];

        cash[0] = 0;
        hold[0] = -prices[1];


        for(int i=1;i<length;i++){
            cash[i]= Math.max(cash[i-1],hold[i-1]+prices[i]);
            hold[i]= Math.max(hold[i-1],cash[i-1]-prices[i]);

        }
        return cash[length-1];
    }

    public static int maxProfit3(int[] prices){
        int length = prices.length;
        if(length<2){
            return 0;
        }
/**
 *  cash 持有现金
 *  hold 持有股票
 *
 */
        int cash = 0;
        int hold = -prices[1];
        /**
         * 这是第三种节省空间的方式，重点是要加两个precash 和prehold
         */
        int preCash = cash;
        int preHold = hold;
        for(int i=1;i<length;i++){
            cash= Math.max(preCash,preHold+prices[i]);
            hold= Math.max(preHold,preCash-prices[i]);
            preCash = cash;
            preHold = hold;
        }
        return cash;
    }


}
