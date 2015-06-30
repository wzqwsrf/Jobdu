
// 题目1380：lucky number

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1380
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1380
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            int binaryElems[] = new int[32];
            for (int i = 1; i <= m; i++) {
                st.nextToken();
                int num = (int) st.nval;
                for (int j = 0; j < 32; j++) {
                    binaryElems[j] += ((num >> j) & 0x01);
                    binaryElems[j] %= n;
                }
            }

            int res = 0;
            for (int i = 0; i < 32; i++) {
                binaryElems[i] %= n;
                if (binaryElems[i] != 0) {
                    binaryElems[i] = 1;
                }
                res += (binaryElems[i] << i);
            }
            System.out.println(res);
        }
    }
}

/**************************************************************
 Problem: 1380
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2320 ms
 Memory:19060 kb
 ****************************************************************/




