
// 题目1354：和为S的连续正数序列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1354
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1354
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int s = (int) st.nval;
            if (s < 0) {
                break;
            }
            boolean flag = false;
            int m = (int) ((Math.sqrt(8 * s + 1) - 1) / 2);
            for (int i = m; i >= 2; i--) {
                if ((s - (i - 1) * i / 2) % i == 0) {
                    flag = true;
                    int min = (s - (i - 1) * i / 2) / i;
                    StringBuffer sb = new StringBuffer();
                    for (int j = 0; j < i; j++) {
                        sb.append(min++ + " ");
                    }
                    System.out.println(sb.toString().trim());
                }
            }
            if (!flag) {
                System.out.println("Pity!");
            }
            System.out.println("#");
        }
    }
}
/**************************************************************
 Problem: 1354
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:870 ms
 Memory:75876 kb
 ****************************************************************/




