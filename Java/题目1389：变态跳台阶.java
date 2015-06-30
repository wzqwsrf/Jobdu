
// 题目1389：变态跳台阶

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1389
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1389
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        long array[] = new long[80];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = 2 * array[i - 1];
        }
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            System.out.println(array[n]);
        }
    }
}

/**************************************************************
 Problem: 1389
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14532 kb
 ****************************************************************/




