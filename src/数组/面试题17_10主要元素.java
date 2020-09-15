package 数组;

import java.util.HashMap;

/**
 * @classname 面试题17_10主要元素
 * @description：
 * 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
 * @author：dml
 * @date 2020/9/15 9:21
 * @version: 1.0
 * 思路： 摩尔投票法
 * 投票法的基本原理是，维护一个众数major和一个频数count，如果出现不同的数count加1，如果出现相同的数，count-1。最终会发现，如果存在主要元素，那么最终count一定大于0，否则一定不存在主要元素。但仅大于0也不一定能判断确实存在主要元素，因为如果数组为[4,3,3,2,2,2]，会发现count为2但是，2并不是主要元素，所以还要添加验证环节。
 */
class Solution17_10 {
    public int majorityElement(int[] nums) {
//        int length = nums.length;
//        int count =0;
//        int major = 0;
//        for( int i=0;i<length;i++){
//            if(count==0){
//                major = nums[i];
//                count++;
//            }
//            else{
//                if(nums[i]!= major){
//                    count--;
//                }
//                else{
//                    count++;
//                }
//            }
//
//        }
//        if(count>0){
//            int t=0;
//            for( int m:nums){
//                if(m==major){
//                    t++;
//                }
//            }
//            if(t>(length/2)){
//                return major;
//            }
//        }
//        return -1;


//方法二
        int length = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.get(i)+1);
            if(map.get(i)>(length/2))
                return i;
        }
        return -1;
    }
}
n