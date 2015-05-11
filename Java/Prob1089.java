
// 题目1089：数字反转

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年05月11日17:50:15
 * @url:http://ac.jobdu.com/problem.php?pid=1089
 */

import java.util.Scanner;

public class Prob1089 {
    /*
    * 1089
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int ab = a + b;
                int newA = getOrdinalNum(a);
                int newB = getOrdinalNum(b);
                int newab = getOrdinalNum(ab);
                if (newab == (newA + newB)) {
                    System.out.println(ab);
                } else {
                    System.out.println("NO");
                }
            }

        }
    }

    private static int getOrdinalNum(int num) {
        String numStr = num + "";
        char[] array = numStr.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i] + "";
        }
        return Integer.parseInt(result);
    }
}

/**
 * ***********************************************************
 * Problem: 1089
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:90 ms
 * Memory:15492 kb
 * **************************************************************
 */