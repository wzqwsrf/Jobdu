
// 题目1491：求1和2的个数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1491
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17128027
 */

import java.util.Scanner;

public class Main {
    /*
     * 1491
     */
    private static int mod = 20123;

    private static char array[];

    private static int len;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            array = input.toCharArray();
            len = array.length;
            System.out.println(modValue(calCount(1) + calCount(2)));
        }
    }

    private static int calCount(int num) {
        int k = len - 1;
        int factor = 1;
        int count = 0;
        while (k >= 0) {
            int lowNum = 0;
            int currNum = 0;
            int highNum = 0;
            for (int i = 0; i < k; i++) {
                highNum = modValue(modValue(highNum * 10) + (array[i] - '0'));
            }
            for (int i = k + 1; i < len; i++) {
                lowNum = modValue(modValue(lowNum * 10) + array[i] - '0');
            }
            currNum = array[k] - '0';
            if (currNum < num) {
                count = modValue(count + highNum * factor);
            } else if (currNum == num) {
                count = modValue(count + highNum * factor + lowNum + 1);
            } else if (currNum > num) {
                count = modValue(count + (highNum + 1) * factor);
            }

            factor = modValue(factor * 10);
            k--;
        }
        return count;
    }

    private static int modValue(int n) {
        return n % mod;
    }
}

/**************************************************************
 Problem: 1491
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:130 ms
 Memory:18248 kb
 ****************************************************************/




