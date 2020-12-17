package 顺序刷题;

import javax.swing.*;

/**
 * @classname BuyStock_1
 * @description：类的描述
 * @author：dml
 * @date 2020/12/17 10:28
 * @version: 1.0
 */
public class BuyStock_1 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,56,2,13};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));
    }

    /**
     * 时间复杂度  n方
     * @param prices
     * @return
     */
    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
           for(int j=i+1;j<prices.length;j++){
               if(prices[j]-prices[i]>maxProfit){
                   maxProfit = prices[j]-prices[i];
               }
           }
        }
        return maxProfit;
    }
    public static int maxProfit2(int[] prices){
        int maxProfit =0;
        int minValue = Integer.MAX_VALUE;
        for (int i =0;i<prices.length;i++){
            if(prices[i]<minValue){
                minValue = prices[i];
            }else if(prices[i]-minValue>maxProfit){
                maxProfit = prices[i]-minValue;
            }
        }
        return maxProfit;
    }
}
