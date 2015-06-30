
// 题目1358：陈博的平均主义

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1358
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/29592955
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1358
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int a = (int) st.nval;
            st.nextToken();
            int b = (int) st.nval;
            a = Math.max(11, a);
            int count = 0;
            for (int i = a; i <= b; i++) {
                String astr = i + "";
                char array[] = astr.toCharArray();
                int size = array.length;
                int tempSum = 0;
                for (int j = 0; j < size; j++) {
                    tempSum += array[j] - '0';
                }
                if (tempSum % 2 != 0) {
                    continue;
                } else {
                    int midSum = tempSum / 2;
                    int dp[] = new int[midSum + 1];
                    for (int j = 0; j < size; j++) {
                        int num = array[j] - '0';
                        for (int k = midSum; k >= num; k--) {
                            dp[k] = Math.max(dp[k], dp[k - num] + num);
                        }
                    }
                    if (dp[midSum] == midSum) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

/**************************************************************
 Problem: 1358
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:860 ms
 Memory:87240 kb
 ****************************************************************/




