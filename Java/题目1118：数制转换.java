
// 题目1118：数制转换

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1118
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    /*
     * 1118
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            String N = scanner.next();
            int b = scanner.nextInt();
            System.out.println(new BigInteger((N + ""), a).toString(b)
                    .toUpperCase());
        }
    }

}
/**************************************************************
 Problem: 1118
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:350 ms
 Memory:27984 kb
 ****************************************************************/




