
// 题目1387：斐波那契数列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1387
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1387
     */
    public static void main(String[] args) throws Exception {
        long array[] = new long[80];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < 80; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            System.out.println(array[n]);
        }
    }
}
/**************************************************************
 Problem: 1387
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14540 kb
 ****************************************************************/




