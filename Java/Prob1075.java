
// 题目1075：斐波那契数列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月22日23:11:15
 * @url:http://ac.jobdu.com/problem.php?pid=1075
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Prob1075 {

    /*
    * 1075
    */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            StringBuffer sb = new StringBuffer();
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < 2 * i - 2; j++) {
                    sb.append(getFibNum(j) + " ");
                }
                sb.append(getFibNum(2 * i - 2));
                if (i < n) {
                    sb.append("\n");
                }
            }
            System.out.println(sb.toString());
        }
    }

    private static int getFibNum(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibNum(n - 1) + getFibNum(n - 2);
        }
    }
}

/**
 * ***********************************************************
 * Problem: 1075
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:2520 ms
 * Memory:17464 kb
 * **************************************************************
 */