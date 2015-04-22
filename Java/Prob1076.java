
// 题目1076：N的阶乘

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月22日23:11:46
 * @url:http://ac.jobdu.com/problem.php?pid=1076
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigDecimal;

public class Prob1076 {

    /*
     * 1076
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
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
/**
 * ***********************************************************
 * Problem: 1076
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:3050 ms
 * Memory:111144 kb
 * **************************************************************
 */