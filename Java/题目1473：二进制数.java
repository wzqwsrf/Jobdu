
// 题目1473：二进制数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1473
 */

import java.math.BigInteger;
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
     * 1473
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int T = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < T; i++) {
                String a = scanner.nextLine();
                System.out.println(new BigInteger(a).toString(2));
            }
        }
    }
}

/**************************************************************
 Problem: 1473
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15732 kb
 ****************************************************************/




