
// 题目1094：String Matching

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1094
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1094
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            String p = st.sval;
            st.nextToken();
            String t = st.sval;
            int plen = p.length();
            int tlen = t.length();
            if (plen < tlen) {
                System.out.println(0);
                continue;
            }
            int count = 0;
            for (int i = 0; i <= plen - tlen; i++) {
                String temp = p.substring(i, i + tlen);
                if (temp.equals(t)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
/**************************************************************
 Problem: 1094
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:520 ms
 Memory:98068 kb
 ****************************************************************/




