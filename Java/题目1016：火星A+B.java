
// 题目1016：火星A+B

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1016
 */

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    /*
     * 1016
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            if (a.equals("0") || b.equals("0")) {
                break;
            }
            String newArrayA[] = a.split(Pattern.quote(","));
            String newArrayB[] = b.split(Pattern.quote(","));

            int aLength = newArrayA.length;
            int bLength = newArrayB.length;
            int max = Math.max(aLength, bLength);
            int[] arrayA = new int[max + 1];
            int[] arrayB = new int[max + 1];
            //			将a和b的位数补成一样的，并且赋值
            constructAandB(arrayA, arrayB, newArrayA, newArrayB);
            //			计算a+b
            int[] arrayC = caculateResult(arrayA, arrayB, max);

            printResult(arrayC);

        }
    }

    /**
     * @Description: TODO
     *
     * @date 2013-8-11,下午04:16:31
     * @author wangzq
     * @version 3.0.0
     *
     * @param arrayC
     */
    private static void printResult(int[] arrayC) {
        if (arrayC[0] == 0) {
            String result = "";
            for (int i = 1; i < arrayC.length; i++) {
                result += arrayC[i] + ",";
            }
            System.out.println(result.substring(0, result.length() - 1));
        } else {
            String result = "";
            for (int i = 0; i < arrayC.length; i++) {
                result += arrayC[i] + ",";
            }
            System.out.println(result.substring(0, result.length() - 1));
        }

    }

    /**
     * @Description: TODO
     *
     * @date 2013-8-11,下午04:15:54
     * @author wangzq
     * @version 3.0.0
     *
     * @param arrayA
     * @param arrayB
     * @param max
     * @return
     */
    private static int[] caculateResult(int[] arrayA, int[] arrayB, int max) {
        int[] arrayC = new int[max + 1];
        int array[] = getPrimeArray();
        for (int i = max; i > 0; i--) {
            arrayC[i] += arrayA[i] + arrayB[i];
            if (arrayC[i] >= array[max - i]) {
                arrayC[i] -= array[max - i];
                arrayC[i - 1] += 1;
            }
        }
        return arrayC;
    }

    /**
     * @Description: TODO
     *
     * @date 2013-8-11,下午04:13:53
     * @author wangzq
     * @version 3.0.0
     *
     * @param arrayA
     * @param arrayB
     * @param newArrayA
     * @param newArrayB
     */
    private static void constructAandB(int[] arrayA, int[] arrayB,
            String[] newArrayA, String[] newArrayB) {
        int aLength = newArrayA.length;
        int bLength = newArrayB.length;
        int max = Math.max(aLength, bLength);
        int k = 0;
        for (int i = max + 1 - aLength; i < max + 1; i++) {
            if (k < aLength) {
                arrayA[i] = Integer.parseInt(newArrayA[k]);
                k++;
            }

        }
        k = 0;
        for (int i = max + 1 - bLength; i < max + 1; i++) {
            if (k < bLength) {
                arrayB[i] = Integer.parseInt(newArrayB[k]);
                k++;
            }
        }

    }

    /**
     * @Description: TODO
     *
     * @date 2013-8-11,下午03:46:05
     * @author wangzq
     * @version 3.0.0
     *
     * @return
     */
    private static int[] getPrimeArray() {
        int array[] = new int[25];
        int k = 0;
        for (int i = 2; i < 10000 && k < 25; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                array[k] = i;
                k++;
            }
        }
        return array;
    }

}

/**************************************************************
 Problem: 1016
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:210 ms
 Memory:24416 kb
 ****************************************************************/




