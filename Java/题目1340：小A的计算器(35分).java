
// 题目1340：小A的计算器(35分)

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1340
 */

import java.util.Scanner;

public class Main {
    /*
     * 1340
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                String a = scanner.next();
                String b = scanner.next();
                int aLength = a.length();
                int bLength = b.length();
                int max = Math.max(aLength, bLength);
                char[] arrayA = new char[max + 1];
                char[] arrayB = new char[max + 1];
                int k = 0;
                for (int j = 0; j < max + 1; j++) {
                    arrayA[j] = 'a';
                    arrayB[j] = 'a';
                }
                for (int j = max + 1 - aLength; j < max + 1; j++) {
                    arrayA[j] = a.charAt(k);
                    k++;
                }
                k = 0;
                for (int j = max + 1 - bLength; j < max + 1; j++) {
                    arrayB[j] = b.charAt(k);
                    k++;
                }
                int[] arrayC = new int[max + 1];
                for (int j = max; j > 0; j--) {
                    arrayC[j] += (arrayA[j] - 'a') + (arrayB[j] - 'a');
                    if (arrayC[j] >= 26) {
                        arrayC[j] -= 26;
                        arrayC[j - 1] += 1;
                    }
                }
                k = 0;
                while (k < max + 1 && arrayC[k] == 0) {
                    k++;
                }
                if (k == max + 1) {
                    System.out.println("a");
                } else {
                    StringBuffer sb = new StringBuffer();
                    for (int j = k; j < max + 1; j++) {
                        char c = (char) (arrayC[j] + 'a');
                        sb.append(c);
                    }
                    System.out.println(sb);
                }
            }
        }
    }
}
/**************************************************************
 Problem: 1340
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:870 ms
 Memory:17340 kb
 ****************************************************************/




