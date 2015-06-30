
// 题目1037：Powerful Calculator

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1037
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/25701791
 */

import java.util.Scanner;

public class Main {
    /*
     * 2014年5月13日12:20:08
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String num1 = scanner.next();
            String num2 = scanner.next();
            System.out.println(add(num1, num2));
            System.out.println(sub(num1, num2));
            System.out.println(multiply(num1, num2));
        }
    }

    public static String add(String num1, String num2) {
        int aLength = num1.length();
        int bLength = num2.length();
        int max = Math.max(aLength, bLength);
        int[] arrayA = new int[max + 1];
        int[] arrayB = new int[max + 1];
        int k = 0;
        for (int i = max + 1 - aLength; i < max + 1; i++) {
            arrayA[i] = num1.charAt(k) - '0';
            k++;
        }
        k = 0;
        for (int i = max + 1 - bLength; i < max + 1; i++) {
            arrayB[i] = num2.charAt(k) - '0';
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
        return printfResult(arrayC);
    }

    public static String sub(String num1, String num2) {
        int aLength = num1.length();
        int bLength = num2.length();
        int flag = compareStr(num1, num2);
        if (flag == 0) {
            return "0";
        }
        if (flag < 0) {
            String tempStr = num1;
            num1 = num2;
            num2 = tempStr;
        }
        aLength = num1.length();
        bLength = num2.length();
        int max = Math.max(aLength, bLength);
        int[] arrayA = new int[max + 1];
        int[] arrayB = new int[max + 1];
        int k = 0;
        for (int i = max + 1 - aLength; i < max + 1; i++) {
            arrayA[i] = num1.charAt(k) - '0';
            k++;
        }
        k = 0;
        for (int i = max + 1 - bLength; i < max + 1; i++) {
            arrayB[i] = num2.charAt(k) - '0';
            k++;
        }
        int[] arrayC = new int[max + 1];
        for (int i = max; i > 0; i--) {
            if (arrayA[i] < arrayB[i]) {
                arrayA[i - 1] -= 1;
                arrayA[i] += 10;
            }
            arrayC[i] += arrayA[i] - arrayB[i];
        }
        String result = printfResult(arrayC);
        result = flag < 0 ? "-" + result : result;
        return result;
    }

    private static int compareStr(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        if (len1 > len2) {
            return 1;
        }
        if (len1 < len2) {
            return -1;
        }
        if (len1 == len2) {
            return num1.compareTo(num2);
        }
        return 0;
    }

    public static String multiply(String num1, String num2) {
        if ("".equals(num1.replace("0", ""))
                || "".equals(num2.replace("0", ""))) {
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        char arrayA[];
        char arrayB[];
        arrayA = num1.toCharArray();
        arrayB = num2.toCharArray();
        int column = len1 + len2;
        int arrayC[] = new int[column];
        int k = column;
        for (int i = len2 - 1; i >= 0; i--) {
            k--;
            int tempCol = k;
            int tempArr[] = new int[column];
            int num = arrayB[i] - '0';
            for (int j = len1 - 1; j >= 0; j--) {
                tempArr[tempCol] += (arrayA[j] - '0') * num;
                if (tempArr[tempCol] >= 10) {
                    int mod = tempArr[tempCol] / 10;
                    tempArr[tempCol] %= 10;
                    tempArr[tempCol - 1] += mod;
                }
                tempCol--;
            }
            arrayC = addNum(tempArr, arrayC, column);
        }
        return printfResult(arrayC);
    }

    private static String printfResult(int[] arrayC) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        if (arrayC[0] == 0) {
            i = 1;
        }
        for (; i < arrayC.length; i++) {
            sb.append(arrayC[i]);
        }
        return sb.toString();
    }

    public static int[] addNum(int tempArr[], int result[], int column) {
        for (int i = column - 1; i >= 0; i--) {
            result[i] += tempArr[i];
            if (result[i] >= 10) {
                result[i] -= 10;
                result[i - 1] += 1;
            }
        }
        return result;
    }
}
/**************************************************************
 Problem: 1037
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:150 ms
 Memory:21048 kb
 ****************************************************************/




