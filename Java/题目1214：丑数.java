
// 题目1214：丑数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1214
 */

import java.util.Scanner;

public class Main {
    /*
     * 1214
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            long array[] = new long[n];
            array[0] = 1;
            int index = 1;
            int index2 = 0;
            int index3 = 0;
            int index5 = 0;
            while (index < n) {
                long num1 = array[index2] * 2;
                long num2 = array[index3] * 3;
                long num3 = array[index5] * 5;
                long min = findMin(num1, num2, num3);
                array[index] = min;
                while (array[index2] * 2 <= min) {
                    index2++;
                }
                while (array[index3] * 3 <= min) {
                    index3++;
                }
                while (array[index5] * 5 <= min) {
                    index5++;
                }
                index++;
            }
            System.out.println(array[n - 1]);
        }
    }

    static long findMin(long a, long b, long c) {
        long min, temp;
        min = a;
        temp = b < c ? b : c;
        min = min < temp ? min : temp;
        return min;
    }

}
/**************************************************************
 Problem: 1214
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:350 ms
 Memory:34524 kb
 ****************************************************************/




