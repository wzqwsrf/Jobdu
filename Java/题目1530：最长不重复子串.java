
// 题目1530：最长不重复子串

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1530
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17661455
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1531
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            String a = st.sval;
            int appear[] = new int[256];
            Arrays.fill(appear, -1);
            char[] array = a.toCharArray();
            int len = array.length;
            int maxLen = 0;
            int start = 0;
            appear[(int) array[0]] = 0;
            for (int i = 1; i < len; i++) {
                if (appear[(int) array[i]] != -1) {
                    int tempLen = i - start;
                    maxLen = maxLen > tempLen ? maxLen : tempLen;
                    start = appear[(int) array[i]] + 1;
                    i = start;
                    Arrays.fill(appear, -1);
                    appear[(int) array[start]] = start;
                } else {
                    appear[(int) array[i]] = i;
                }
            }
            int tempLen = len - start;
            maxLen = maxLen > tempLen ? maxLen : tempLen;
            System.out.println(maxLen);
        }
    }
}

/**************************************************************
 Problem: 1530
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:570 ms
 Memory:23152 kb
 ****************************************************************/




