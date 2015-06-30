
// 题目1148：Financial Management

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1148
 */

import java.util.Scanner;

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
     * 1148
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double sum = 0.0;
            for (int i = 0; i < 12; i++) {
                sum += scanner.nextDouble();
            }
            System.out.printf("$%.2f", sum / 12);
            System.out.println();
        }
    }
}

/**************************************************************
 Problem: 1148
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:19292 kb
 ****************************************************************/




