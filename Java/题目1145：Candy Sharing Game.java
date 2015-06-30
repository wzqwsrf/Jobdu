
// 题目1145：Candy Sharing Game

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1145
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1145
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            int candy[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                candy[i] = (int) st.nval;
            }
            int count = 0;
            while (true) {
                boolean flag = true;
                for (int i = 1; i < n; i++) {
                    if (candy[i] != candy[0]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    break;
                } else {
                    count++;
                    int give[] = new int[n];
                    for (int i = 0; i < n; i++) {
                        give[i] = candy[i] / 2;
                    }

                    for (int i = 0; i < n; i++) {
                        if (i == 0) {
                            candy[0] = give[0] + give[n - 1];
                        } else {
                            candy[i] = give[i] + give[i - 1];
                        }
                        if (candy[i] % 2 != 0) {
                            candy[i] += 1;
                        }
                    }
                }
            }
            System.out.println(count + " " + candy[0]);
        }
    }
}
/**************************************************************
 Problem: 1145
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:17156 kb
 ****************************************************************/




