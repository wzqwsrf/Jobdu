
// 题目1370：数组中出现次数超过一半的数字

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1370
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1370
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            Arrays.sort(array);
            int count = 0;
            int mid = array[n / 2];
            for (int i = 0; i < n; i++) {
                if (array[i] == mid) {
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.println(mid);
            } else {
                System.out.println(-1);
            }
        }
    }
}
/**************************************************************
 Problem: 1370
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:560 ms
 Memory:23960 kb
 ****************************************************************/




