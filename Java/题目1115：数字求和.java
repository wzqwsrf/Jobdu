
// 题目1115：数字求和

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1115
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
     * 1115
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                int num = scanner.nextInt();
                if (num < a) {
                    sum += num;
                }
            }
            System.out.println(sum);
        }
    }
}
/**************************************************************
 Problem: 1115
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:850 ms
 Memory:79644 kb
 ****************************************************************/




