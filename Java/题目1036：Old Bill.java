
// 题目1036：Old Bill

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1036
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
     * 1036
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int N = (int) st.nval;
            st.nextToken();
            int X = (int) st.nval;
            st.nextToken();
            int Y = (int) st.nval;
            st.nextToken();
            int Z = (int) st.nval;
            int tempNum = X * 1000 + Y * 100 + Z * 10;
            int max = 0;
            for (int i = 1; i <= 9; i++) {
                for (int j = 0; j <= 9; j++) {
                    int num = (i * 10000 + tempNum + j);
                    if (num % N == 0 && num > max) {
                        max = num;
                    }
                }
            }
            if (max == 0) {
                System.out.println(0);
            } else {
                String numStr = max + "";
                System.out.println((numStr.charAt(0) - '0') + " "
                        + (numStr.charAt(4) - '0') + " " + (max / N));
            }
        }
    }
}
/**************************************************************
 Problem: 1036
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:60 ms
 Memory:14524 kb
 ****************************************************************/




