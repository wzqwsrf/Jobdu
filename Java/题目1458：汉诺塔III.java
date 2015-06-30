
// 题目1458：汉诺塔III

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1458
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1458
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        long array[] = new long[36];
        array[1] = 2;
        for (int i = 2; i < array.length; i++) {
            array[i] = 3 * array[i - 1] + 2;
        }
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            System.out.println(array[n]);
        }
    }
}
/**************************************************************
 Problem: 1458
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:60 ms
 Memory:14716 kb
 ****************************************************************/




