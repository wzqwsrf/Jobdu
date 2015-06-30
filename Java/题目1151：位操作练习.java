
// 题目1151：位操作练习

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1151
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/19042223
 */

import java.util.Scanner;

public class Main {
    /*
     * 1151
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                boolean flag = false;
                for (int j = 0; j < 16; j++) {
                    int c = (a >> (16 - j)) | (a << j);
                    c &= 0xFFFF;
                    if (c == b) {
                        flag = true;
                        System.out.println("YES");
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("NO");
                }
            }
        }
    }
}
/**************************************************************
 Problem: 1151
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15488 kb
 ****************************************************************/




