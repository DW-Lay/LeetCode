package 顺序刷题;

/**
 * @author Lincoln
 * @classname BuyStock3
 * @description 最多允许进行两次交易（两次买入卖出，必须先卖出上一次的才能买入下一次的）
 * @params TODO
 * @return
 * @date 2020/12/28 16:48
 */
public class BuyStock_3 {
    public static void main(String[] args) {
    int[] prices = {1,2,3,4,5,6,7};
        System.out.println(maxProfit1(prices));
    }
    public static int maxProfit1(int[] prices){
        int len  = prices.length;
        if(len<2){
            return 0;
        }
//        dp[i][j][k]   i表示天数   j表示交易次数   k表示是否持有股票   0 不持有   1 持有
        int[][][] dp =new int[len][3][2];
        dp[0][0][0]=0;
        dp[0][1][0]=0;  // 无意义，但是可以设为0
        dp[0][0][1]=0; //无意义，但是可以设为0
        dp[0][1][1]=-prices[0];
        dp[0][2][0]=0; //无意义
        dp[0][2][1]=Integer.MIN_VALUE;  //同样无意义，但是此处需要设为极小值
        for(int i=1;i<len;i++){
            dp[i][1][1]=Math.max(dp[i-1][1][1],dp[i-1][0][0]-prices[i]);
            dp[i][1][0]=Math.max(dp[i-1][1][0],dp[i-1][1][1]+prices[i]);
            dp[i][2][1]=Math.max(dp[i-1][2][1],dp[i-1][1][0]-prices[i]);
            dp[i][2][0]=Math.max(dp[i-1][2][0],dp[i-1][2][1]+prices[i]);
        }
        return Math.max(dp[len-1][1][0],dp[len-1][2][0]);
    }
}
