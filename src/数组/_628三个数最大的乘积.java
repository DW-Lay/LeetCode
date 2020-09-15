package 数组;

/**
 * @classname _628三个数最大的乘积
 * @description：
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * @author：dml
 * @date 2020/9/15 12:18
 * @version: 1.0
 */
class Solution168 {
    public int maximumProduct(int[] nums) {
        //   Arrays.sort(nums);
        //   return Math.max(nums[0]*nums[1]*nums[nums.length-1], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);

//        方法二
        int min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE,max3 = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<=min1){
                min2 = min1;
                min1 = nums[i];
            }else if(nums[i]<=min2){
                min2 = nums[i];
            }
            if(nums[i]>max3){
                max1= max2;
                max2 = max3;
                max3 =nums[i];
            }else if(nums[i]>=max2){
                max1= max2;
                max2=nums[i];
            }else if(nums[i]>=max1){
                max1 =nums[i];
            }
        }
        return Math.max(min1*min2*max3,max1*max2*max3);
    }
}