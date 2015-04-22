
// 题目1080：进制转换

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月22日23:16:10
 * @url:http://ac.jobdu.com/problem.php?pid=1080
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Prob1080 {

    /*
     * 1080
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            String x = scanner.next();
            System.out.println(new BigInteger((x + ""), M).toString(N).toLowerCase());
        }
    }
}

/**
 * ***********************************************************
 * Problem: 1080
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:590 ms
 * Memory:42364 kb
 * **************************************************************
 */
