
// 题目1058：反序输出

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月19日21:48:37
 * @url:http://ac.jobdu.com/problem.php?pid=1058
 */

import java.util.Scanner;

public class Prob1058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ab = scanner.next();
            String result = "";
            for (int i = ab.length() - 1; i >= 0; i--) {
                result += ab.charAt(i);
            }
            System.out.println(result);
        }
    }
}
/**
 * ***********************************************************
 * Problem: 1058
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1320 ms
 * Memory:97488 kb
 * **************************************************************
 */