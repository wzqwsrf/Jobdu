
// 题目1528：最长回文子串

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1528
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1528
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            String a = st.sval;
            char array[] = a.toCharArray();
            int len = array.length;

            int maxLen = 1;
            for (int i = 0; i < len; i++) {
                int len1 = getMaxPalindromes(i, i, len, array);
                if (len1 > maxLen) {
                    maxLen = len1;
                }
                int len2 = getMaxPalindromes(i, i + 1, len, array);
                if (len2 > maxLen) {
                    maxLen = len2;
                }
            }
            System.out.println(maxLen);
        }
    }

    private static int getMaxPalindromes(int l, int r, int len, char array[]) {
        while (l >= 0 && r < len && array[l] == array[r]) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}

/**************************************************************
 Problem: 1528
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:850 ms
 Memory:25460 kb
 ****************************************************************/




