
// 题目1080：进制转换

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1080
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
     * 1080
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            String x = scanner.next();
            System.out.println(new BigInteger((x + ""), M).toString(N)
                    .toLowerCase());
        }
    }
}

/**************************************************************
 Problem: 1080
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:590 ms
 Memory:42364 kb
 ****************************************************************/




