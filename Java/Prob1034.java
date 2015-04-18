
// 题目1034：寻找大富翁

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月18日22:23:20
 * @url:http://ac.jobdu.com/problem.php?pid=1034
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Prob1034 {
    /*
      * 1034
      */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            if (n == 0 && m == 0) {
                break;
            }
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            Arrays.sort(array);
            if (m > n) {
                m = n;
            }
            StringBuffer sb = new StringBuffer();
            int k = 1;
            int i = n - 1;
            while (k <= m && i >= 0) {
                sb.append(array[i] + " ");
                k++;
                i--;
            }
            System.out.println(sb.toString().trim());
        }
    }
}
/**
 * ***********************************************************
 * Problem: 1034
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:180 ms
 * Memory:20728 kb
 * **************************************************************
 */