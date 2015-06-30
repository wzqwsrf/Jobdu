
// 题目1106：数字之和

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1106
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
     * 1106
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            String firN = n + "";
            int firResult = 0;
            for (int i = 0; i < firN.length(); i++) {
                firResult += firN.charAt(i) - '0';
            }
            String secN = n * n + "";
            int secResult = 0;
            for (int i = 0; i < secN.length(); i++) {
                secResult += secN.charAt(i) - '0';
            }
            System.out.println(firResult + " " + secResult);
        }
    }
}
/**************************************************************
 Problem: 1106
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14528 kb
 ****************************************************************/




