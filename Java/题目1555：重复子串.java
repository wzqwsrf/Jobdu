
// 题目1555：重复子串

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1555
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
     * 1555 2014年3月19日22:07:16
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            Set<String> set = new HashSet<String>();
            String input = st.sval;
            int len = input.length();
            for (int i = 0; i < len; i++) {
                int j = 1;
                while (j * 2 + i <= len) {
                    String before = input.substring(i, i + j);
                    if (set.contains(before)) {
                        j++;
                        continue;
                    }
                    String next = input.substring(i + j);
                    if (next.indexOf(before) != -1) {
                        set.add(before);
                        j++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(set.size());
        }
    }
}

/**************************************************************
 * Problem: 1555
 * User: wangzhenqing
 * Language: Java
 * Result: Accepted
 * Time:960 ms
 * Memory:26028 kb
 ****************************************************************/




