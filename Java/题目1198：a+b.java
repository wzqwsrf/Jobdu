
// 题目1198：a+b

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1198
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17788941
 */

import java.util.Scanner;

/** 
 * @ClassName: Main1046 
 * @Description: TODO 
 * @author wangzq
 * @date 2013-8-7 下午04:00:39 
 * 
 * @version 3.0.0 
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            int aLength = a.length();
            int bLength = b.length();
            int max = Math.max(aLength, bLength);
            int[] arrayA = new int[max + 1];
            int[] arrayB = new int[max + 1];
            int k = 0;
            for (int i = max + 1 - aLength; i < max + 1; i++) {
                arrayA[i] = a.charAt(k) - '0';
                k++;
            }
            k = 0;
            for (int i = max + 1 - bLength; i < max + 1; i++) {
                arrayB[i] = b.charAt(k) - '0';
                k++;
            }
            int[] arrayC = new int[max + 1];

            for (int i = max; i > 0; i--) {
                arrayC[i] += arrayA[i] + arrayB[i];
                if (arrayC[i] >= 10) {
                    arrayC[i] -= 10;
                    arrayC[i - 1] += 1;
                }
            }
            if (arrayC[0] == 0) {
                for (int i = 1; i < arrayC.length; i++) {
                    System.out.print(arrayC[i]);
                }
                System.out.println();
            } else {
                for (int i = 0; i < arrayC.length; i++) {
                    System.out.print(arrayC[i]);
                }
                System.out.println();
            }
        }
    }
}
/**************************************************************
 Problem: 1198
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2290 ms
 Memory:95360 kb
 ****************************************************************/




