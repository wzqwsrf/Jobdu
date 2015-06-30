
// 题目1087：约数的个数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1087
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1087
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int tempNum = (int) st.nval;
                int count = getDivisor(tempNum);
                sb.append(count + "\n");
            }
            System.out.print(sb);
        }
    }

    private static int getDivisor(int tempNum) {
        int num = 0;
        double dm = Math.sqrt(tempNum);
        for (int i = 1; i < dm; i++) {
            if (tempNum % i == 0) {
                num += 2;
            }
        }
        int m = (int) dm;
        if (m * m == tempNum) {
            num += 1;
        }
        return num;
    }
}

/**************************************************************
 Problem: 1087
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:430 ms
 Memory:22900 kb
 ****************************************************************/




