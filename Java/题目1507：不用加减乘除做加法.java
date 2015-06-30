
// 题目1507：不用加减乘除做加法

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1507
 */

import java.util.Scanner;

public class Main {
    /*
     * 1478
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int num = addAB(a, b);
            System.out.println(num);
        }
    }

    private static int addAB(int a, int b) {
        if (b == 0)
            return a;
        if (a == 0)
            return b;
        int sum = a ^ b; //不记进位的和  
        int carry = (a & b) << 1; //进位  
        return addAB(sum, carry);
    }
}

/**************************************************************
 Problem: 1507
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:720 ms
 Memory:26972 kb
 ****************************************************************/




