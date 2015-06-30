
// 题目1084：整数拆分

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1084
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
     * 1084
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        long array[] = new long[1000001];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = array[i - 1];
            } else {
                array[i] = (array[i / 2] + array[i - 1]) % 1000000000;
            }
        }
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            System.out.println(array[n - 1]);
        }
    }
}

/**************************************************************
 Problem: 1084
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:160 ms
 Memory:26064 kb
 ****************************************************************/




