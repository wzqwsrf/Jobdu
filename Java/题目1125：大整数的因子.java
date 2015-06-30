
// 题目1125：大整数的因子

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1125
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/28653591
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    /*
     * 1125 2014年6月5日17:34:07
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String num = scanner.next();
            if (num.equals("-1")) {
                break;
            }
            BigInteger numBig = new BigInteger(num);
            boolean flag = false;
            StringBuffer sb = new StringBuffer();
            int k = 2;
            while (k >= 2 && k <= 9) {
                if (numBig.mod(new BigInteger(k + "")).toString().equals("0")) {
                    flag = true;
                    sb.append(k + " ");
                }
                k++;
            }
            String result = (flag == true) ? sb.toString().trim() : "none";
            System.out.println(result);
        }
    }
}
/**************************************************************
 Problem: 1125
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:1300 ms
 Memory:101376 kb
 ****************************************************************/




