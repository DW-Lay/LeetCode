package 剑指offer;

/**
 * @classname 打印从1到最大的n位数
 * @description：
 * * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 * 示例 1:
 *
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 *
 * @author：dml
 * @date 2020/9/5 15:33
 * @version: 1.0
 */
class solution17 {
    public static void main(String[] args) {
        solution17 solution17 = new solution17();
        System.out.println(solution17.printNumbers(3));
    }

//    方法一
//        public int[] printNumbers(int n) {
//            int end = (int)Math.pow(10,n)-1;
//            int[] res = new int[end];
//            for(int i=0;i<end;i++){
//                res[i]=i+1;
//            }
//            return res;
//        }

//    方法二   大数打印法
        int[] res;
        int nine =0, count=0,start,n;
        char[] num ,loop = {'0','1','2','3','4','5','6','7','8','9'};
//       char[] num ,loop = {'0','1','2','3'};

        public int[] printNumbers(int n) {
            this.n = n;
            res = new int[(int)Math.pow(10,n)-1];
            num = new char[n];
            start =n-1;
            dfs(0);
            return res;
        }

        void dfs(int x){
            if(x==n){
                String s = String.valueOf(num).substring(start);
                if(!s.equals("0")) res[count++] = Integer.parseInt(s);
                System.out.println("nine="+nine);
                System.out.println("s="+s);
                if(n-start ==nine)start--;
                return;
            }
            for(char i:loop){
                if(i=='9')nine++;
                num[x]=i;
                dfs(x+1);
            }
            nine--;
        }


}
