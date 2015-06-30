
// 题目1089：数字反转

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1089
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

/**************************************************************
 Problem: 1089
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15492 kb
 ****************************************************************/




