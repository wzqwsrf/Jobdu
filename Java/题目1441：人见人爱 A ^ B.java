
// 题目1441：人见人爱 A ^ B

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1441
 */

import java.util.Scanner;

public class Main {
    /*
     * 1441
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int p = a;
            a = 1;
            for (int i = 1; i <= b; i++) {
                a = a % 1000;
                a = a * p;
            }
            System.out.println(a % 1000);
        }

    }
}

/**************************************************************
 Problem: 1441
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:140 ms
 Memory:18996 kb
 ****************************************************************/




