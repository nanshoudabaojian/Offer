package d67剪绳子;

/**
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 
 * 输入一个数n，意义见题面。（2 <= n <= 60）  8
 * 输出 18
 * 
 * 思路：
 * 尽可能剪成3的，不能出现1，如果出现1就和3合并变成4
 * eg 10->3 3 4
 * 特殊情况 2->1 1    3->1 2
 * @author NSDBJ
 * @date 2020年6月22日 上午8:44:04
 */

public class Solution {
    public int cutRope(int target) {
    	if(target == 2){
    		return 1;
    	}
    	if(target == 3){
    		return 2;
    	}
    	if(target % 3 == 1){
    		return (int) (4 * Math.pow(3, target/3-1));
    	}else if(target % 3 == 0){
    		return (int) Math.pow(3, target/3);
    	}else{
    		return (int) (2 * Math.pow(3, target/3));
    	}
    }
}