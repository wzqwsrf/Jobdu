
// 题目1041：Simple Sorting

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月18日22:31:20
 * @url:http://ac.jobdu.com/problem.php?pid=1041
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Set;
import java.util.TreeSet;

public class Prob1041 {
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            Set<Integer> arrSet = new TreeSet<Integer>();
            for (int i = 0; i < n; i++) {
                st.nextToken();
                arrSet.add((int) st.nval);
            }
            StringBuffer sb = new StringBuffer();
            for (Integer num : arrSet) {
                sb.append(num + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}


/**
 * ***********************************************************
 * Problem: 1041
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:70 ms
 * Memory:14664 kb
 * **************************************************************
 */