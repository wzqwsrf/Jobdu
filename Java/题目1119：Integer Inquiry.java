
// 题目1119：Integer Inquiry

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1119
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    /*
     * 1119
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = "0";
        while (scanner.hasNext()) {
            String a = scanner.next();
            if (a.equals("0")) {
                break;
            }
            b = highPreAdd(a, b);
        }
        System.out.println(b);
    }

    private static String highPreAdd(String a, String b) {
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }
}

/**************************************************************
 Problem: 1119
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:140 ms
 Memory:17696 kb
 ****************************************************************/




