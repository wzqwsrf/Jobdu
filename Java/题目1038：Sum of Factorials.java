
// 题目1038：Sum of Factorials

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1038
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
     * 1038
     */
    public static void main(String[] args) {
        int[] numArray = new int[11];
        numArray[0] = 1;
        for (int i = 1; i < 11; i++) {
            numArray[i] = numArray[i - 1] * i;
        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("NO");
            } else {
                for (int i = 10; i >= 0; i--) {
                    if (n >= numArray[i]) {
                        n -= numArray[i];
                    }
                }
                if (n == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
    }

}
/**************************************************************
 Problem: 1038
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15464 kb
 ****************************************************************/




