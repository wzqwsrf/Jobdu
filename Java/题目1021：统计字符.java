
// 题目1021：统计字符

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1021
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17187077
 */

import java.util.Scanner;

public class Main {
    /*
     * 1021
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine();
            if (a.equals("#")) {
                break;
            }
            int numArr[] = new int[200];
            String b = scanner.nextLine();
            int len1 = a.length();
            int len2 = b.length();
            for (int i = 0; i < len2; i++) {
                numArr[b.charAt(i)]++;
            }
            for (int i = 0; i < len1; i++) {
                System.out.println(a.charAt(i) + " " + numArr[a.charAt(i)]);
            }
        }
    }
}

/**************************************************************
 Problem: 1021
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15456 kb
 ****************************************************************/




