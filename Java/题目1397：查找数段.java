
// 题目1397：查找数段

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1397
 */

import java.util.Scanner;

public class Main {
    /*
     * 1397
     */
    private static int arrayA[];

    private static int arrayB[];

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            String p = scanner.next();
            int len1 = s.length();
            int len2 = p.length();

            arrayA = new int[11];
            arrayB = new int[10];

            for (int i = 0; i < len2; i++) {
                int num = p.charAt(i) - '0';
                arrayB[num]++;
            }
            int left = 0;
            int right = 0;
            int min = 0;
            while (left <= right && right < len1) {
                if (s.charAt(right) == '*') {
                    arrayA[10]++;
                } else {
                    arrayA[s.charAt(right) - '0']++;
                }
                right++;
                while (left < right && containAllKey()) {
                    int tempLen = right - left;
                    if (min == 0 || tempLen > tempLen) {
                        min = tempLen;
                    }
                    min = Math.min(right - left, min);
                    if (s.charAt(left) == '*') {
                        arrayA[10]--;
                    } else {
                        arrayA[s.charAt(left) - '0']--;
                    }
                    left++;
                }
            }
            System.out.println(min);
        }
    }

    private static boolean containAllKey() {

        boolean flag = false;
        int num = 0;
        for (int i = 0; i < 10; i++) {
            if (arrayB[i] != 0 && arrayB[i] > arrayA[i]) {
                num += arrayB[i] - arrayA[i];
            }
        }
        if (arrayA[10] >= num) {
            flag = true;
        }
        return flag;
    }
}

/**************************************************************
 Problem: 1397
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1120 ms
 Memory:31216 kb
 ****************************************************************/




