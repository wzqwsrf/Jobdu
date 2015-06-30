
// 题目1147：Jugs

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1147
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1147
     */
    private static int ca, cb, cn;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            ca = (int) st.nval;
            st.nextToken();
            cb = (int) st.nval;
            st.nextToken();
            cn = (int) st.nval;
            System.out.println("fill B");
            pourAB(0, cb);
            System.out.println("success");
        }
    }

    private static void pourAB(int al, int bl) {
        if (bl == cn) {
            return;
        }

        if (bl > ca) {
            System.out.println("pour B A");
            int cbnow = bl - (ca - al);
            if (cbnow == cn) {
                return;
            }
            System.out.println("empty A");
            pourAB(0, cbnow);
        } else {
            System.out.println("pour B A");
            System.out.println("fill B");
            pourAB(bl, cb);
        }
    }
}
/**************************************************************
 Problem: 1147
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14588 kb
 ****************************************************************/




