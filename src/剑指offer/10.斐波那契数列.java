package 剑指offer;
/**
 * @classname solution
 * @description：
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1

 * @author：dml
 * @date 2020/9/5 8:49
 * @version: 1.0
 */
class solution10 {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    public static int fib(int n){
        int a =0,b=1,sum;
        for(int i=0;i<n;i++){
            sum = (a+b)%1000_000_007;
            a=b;
            b=sum;
        }
        return  a;
    }
}
