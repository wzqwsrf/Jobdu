
// 题目1042：Coincidence

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1042
 */

import java.io.StreamTokenizer;

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    /*
     * 1042
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            String a = st.sval;
            st.nextToken();
            String b = st.sval;
            char[] arrayA = a.toCharArray();
            char[] arrayB = b.toCharArray();
            int length = getLCS(arrayA, arrayB, arrayA.length - 1,
                    arrayB.length - 1);
            System.out.println(length);
        }
    }

    private static int getLCS(char[] arrayA, char[] arrayB, int a, int b) {

        if (a == -1 || b == -1)
            return 0;
        if (arrayA[a] == arrayB[b]) {
            return getLCS(arrayA, arrayB, a - 1, b - 1) + 1;
        } else {
            int aLength = getLCS(arrayA, arrayB, a - 1, b);
            int bLength = getLCS(arrayA, arrayB, a, b - 1);
            return aLength > bLength ? aLength : bLength;
        }
    }
}

/**************************************************************
 Problem: 1042
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14532 kb
 ****************************************************************/




