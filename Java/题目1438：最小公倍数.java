
// 题目1438：最小公倍数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1438
 */

import java.util.Scanner;

public class Main {
    /*
     * 1438
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int newA = Math.max(a, b);
            int newB = Math.min(a, b);
            int tempNum = 0;
            if (newA % newB == 0) {
                tempNum = newB;
            } else {
                while (newA % newB != 0) {
                    tempNum = newA % newB;
                    newA = newB;
                    newB = tempNum;
                }
            }
            System.out.println(a * b / newB);

        }
    }

}
/**************************************************************
 Problem: 1438
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:18964 kb
 ****************************************************************/




