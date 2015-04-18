
// 题目1049：字符串去特定字符

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月18日22:49:14
 * @url:http://ac.jobdu.com/problem.php?pid=1049
 */

import java.util.Scanner;

public class Prob1049 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ss = scanner.nextLine();
            String c = scanner.nextLine();

            System.out.println(ss.replace(c, ""));
        }
    }
}
/**
 * ***********************************************************
 * Problem: 1049
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:90 ms
 * Memory:15440 kb
 * **************************************************************
 */