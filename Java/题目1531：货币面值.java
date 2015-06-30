
// 题目1531：货币面值

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1531
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

            int n = (int) st.nval;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }

            Arrays.sort(array);

            if (array[0] != 1) {
                System.out.println(1);
                continue;
            }

            int total = array[0];
            boolean flag = true;
            for (int i = 1; i < n; i++) {
                if (array[i] <= total + 1) {
                    total += array[i];
                } else {
                    System.out.println(total + 1);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(total + 1);
            }
        }
    }
}

/**************************************************************
 Problem: 1531
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:350 ms
 Memory:14752 kb
 ****************************************************************/




