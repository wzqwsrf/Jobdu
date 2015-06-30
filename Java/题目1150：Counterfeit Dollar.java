
// 题目1150：Counterfeit Dollar

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1150
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17339141
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
     * 1150
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            //          ABCDEFGHIJKL
            for (int m = 0; m < n; m++) {
                int arrayA[] = new int[12];
                int arrayB[] = new int[12];
                Arrays.fill(arrayB, 1);
                int num = 0;
                for (int i = 0; i < 3; i++) {
                    String left = scanner.next();
                    String right = scanner.next();
                    String result = scanner.next();
                    int len1 = left.length();
                    int len2 = right.length();
                    if (result.equals("even")) {
                        for (int j = 0; j < len1; j++) {
                            arrayB[left.charAt(j) - 'A'] = 0;
                        }
                        for (int j = 0; j < len2; j++) {
                            arrayB[right.charAt(j) - 'A'] = 0;
                        }
                    } else if (result.equals("up")) {
                        num++;
                        for (int j = 0; j < len1; j++) {
                            arrayA[left.charAt(j) - 'A']--;
                        }
                        for (int j = 0; j < right.length(); j++) {
                            arrayA[right.charAt(j) - 'A']++;
                        }
                    } else if (result.equals("down")) {
                        num++;
                        for (int j = 0; j < left.length(); j++) {
                            arrayA[left.charAt(j) - 'A']++;
                        }
                        for (int j = 0; j < right.length(); j++) {
                            arrayA[right.charAt(j) - 'A']--;
                        }
                    }
                }

                int maxId = 0;
                int k = 0;
                while (k < 12) {
                    if (arrayB[k] == 1 && Math.abs(arrayA[k]) == num) {
                        maxId = k;
                    }
                    k++;
                }
                char c = (char) (maxId + 'A');
                if (arrayA[maxId] < 0) {
                    System.out.println(c
                            + " is the counterfeit coin and it is heavy.");
                } else {
                    System.out.println(c
                            + " is the counterfeit coin and it is light.");
                }
            }

        }
    }
}

/**************************************************************
 Problem: 1150
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15488 kb
 ****************************************************************/




