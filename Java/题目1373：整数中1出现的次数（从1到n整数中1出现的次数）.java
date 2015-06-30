
// 题目1373：整数中1出现的次数（从1到n整数中1出现的次数）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1373
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17126977
 */

import java.util.Scanner;

public class Main {
    /*
     * 1373
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                System.out.println(0);
            } else if (a == 0 || b == 0) {
                System.out.println(calCount(Math.max(a, b)));
            } else {
                int newA = Math.min(a, b);
                int newB = Math.max(a, b);
                int count1 = calCount(newA - 1);
                int count2 = calCount(newB);
                System.out.println(count2 - count1);
            }
        }
    }

    private static int calCount(int n) {
        int iCount = 0;
        int iFactor = 1;
        int iLowerNum = 0;
        int iCurrNum = 0;
        int iHigherNum = 0;
        while (n / iFactor != 0) {
            iLowerNum = n % iFactor;
            iCurrNum = (n / iFactor) % 10;
            iHigherNum = n / (iFactor * 10);
            switch (iCurrNum) {
            case 0:
                iCount += iHigherNum * iFactor;
                break;
            case 1:
                iCount += iHigherNum * iFactor + iLowerNum + 1;
                break;
            default:
                iCount += (iHigherNum + 1) * iFactor;
                break;
            }
            iFactor *= 10;
        }
        return iCount;
    }
}

/**************************************************************
 Problem: 1373
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:560 ms
 Memory:19036 kb
 ****************************************************************/




