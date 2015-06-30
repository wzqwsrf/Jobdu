
// 题目1076：N的阶乘

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1076
 */

import java.io.StreamTokenizer;
import java.math.BigDecimal;

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    /*
     * 1076
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            BigDecimal result = getFactNum(n);
            System.out.println(result);
        }
    }

    private static BigDecimal getFactNum(int n) {
        BigDecimal num = new BigDecimal(1);
        if (n == 0 || n == 1) {
            return num;
        } else {
            return new BigDecimal(n).multiply(getFactNum(n - 1));
        }
    }
}
/**************************************************************
 Problem: 1076
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:3050 ms
 Memory:111144 kb
 ****************************************************************/




