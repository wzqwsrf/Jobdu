
// 题目1116：加减乘除

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1116
 */

import java.util.Scanner;

public class Main {

    /*
     * 1116
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long array[] = new long[20];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < 20; i++) {
            array[i] = i * array[i - 1];
        }
        while (scanner.hasNext()) {
            long a = scanner.nextLong();
            String b = scanner.next();
            if (b.equals("!")) {
                System.out.println(array[(int) a]);
                continue;
            }
            long c = scanner.nextLong();
            if (b.equals("+")) {
                System.out.println(a + c);
            } else if (b.equals("-")) {
                System.out.println(a - c);
            } else if (b.equals("*")) {
                System.out.println(a * c);
            } else if (b.equals("/")) {
                if (c == 0) {
                    System.out.println("error");
                } else {
                    System.out.println(a / c);
                }
            } else if (b.equals("%")) {
                if (c == 0) {
                    System.out.println("error");
                } else {
                    System.out.println(a % c);
                }
            }
        }
    }
}
/**************************************************************
 Problem: 1116
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:820 ms
 Memory:48508 kb
 ****************************************************************/




