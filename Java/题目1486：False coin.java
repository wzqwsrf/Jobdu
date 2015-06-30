
// 题目1486：False coin

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1486
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17339893
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
     * 1486
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int num = 0;
            int arrayA[] = new int[n + 1];
            int arrayB[] = new int[n + 1];
            Arrays.fill(arrayB, 1);
            while (k > 0) {
                int first = scanner.nextInt();
                int tempArrayA[] = new int[first];
                int tempArrayB[] = new int[first];
                for (int i = 0; i < first; i++) {
                    tempArrayA[i] = scanner.nextInt();
                }
                for (int i = 0; i < first; i++) {
                    tempArrayB[i] = scanner.nextInt();
                }
                String symbol = scanner.next();
                if (symbol.equals("=")) {
                    for (int i = 0; i < first; i++) {
                        arrayB[tempArrayA[i]] = 0;
                        arrayB[tempArrayB[i]] = 0;
                    }
                } else if (symbol.equals(">")) {
                    num++;
                    for (int i = 0; i < first; i++) {
                        arrayA[tempArrayA[i]]++;
                        arrayA[tempArrayB[i]]--;
                    }
                } else if (symbol.equals("<")) {
                    num++;
                    for (int i = 0; i < first; i++) {
                        arrayA[tempArrayA[i]]--;
                        arrayA[tempArrayB[i]]++;
                    }
                }
                k--;
            }
            int max = 0;
            int maxId = 0;
            int j = 1;
            while (j < n + 1) {
                int tempNum = Math.abs(arrayA[j]);
                if (arrayB[j] == 1 && tempNum == num) {
                    max++;
                    maxId = j;
                }
                j++;
            }
            System.out.println(max != 1 ? 0 : maxId);
        }
    }
}

/**************************************************************
 Problem: 1486
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:640 ms
 Memory:106776 kb
 ****************************************************************/




