
// 题目1205：N阶楼梯上楼问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1205
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
     * 1205
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        long array[] = new long[90];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            System.out.println(array[n - 1]);
        }
    }
}

/**************************************************************
 Problem: 1205
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14712 kb
 ****************************************************************/




