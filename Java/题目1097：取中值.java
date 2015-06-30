
// 题目1097：取中值

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1097
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
     * 1097
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int aLength = scanner.nextInt();
                int bLength = scanner.nextInt();
                int[] arrayA = new int[aLength];
                int[] arrayB = new int[bLength];
                for (int j = 0; j < aLength; j++) {
                    arrayA[j] = scanner.nextInt();
                }
                for (int j = 0; j < bLength; j++) {
                    arrayB[j] = scanner.nextInt();
                }
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = scanner.nextInt();

                //				int index = 0;

                //				a = a <= 0 ? 1 : a;
                //				a = a > aLength ? aLength:a;
                //				b = b <= 0 ? 1 : b;
                //				b = b > aLength ? aLength:b;
                //				a = a > b ? b : a;
                //				
                //				c = c <= 0 ? 1 : c;
                //				c = c > bLength ? bLength:c;
                //				d = d <= 0 ? 1 : d;
                //				d = d > bLength ? bLength:d;
                //				c = c > d ? d : c;
                int aSub = b - a + 1;
                int bSub = d - c + 1;
                int count = aSub + bSub;
                int middle = (int) Math.ceil(count / 2.0);
                if (middle > aSub) {
                    int index = middle - aSub;
                    System.out.println(arrayB[c - 1 + index - 1]);
                } else {
                    System.out.println(arrayA[a - 1 + middle - 1]);
                }
                //				int[] arrayC = new int[cLength];
                //				
                //				for (int j = a; j <= b; j++, index++) {
                //					
                //					arrayC[index] = arrayA[j - 1];
                //				}
                //				for (int j = c; j <= d; j++, index++) {
                //					
                //					arrayC[index] = arrayB[j - 1];
                //				}
                //				System.out.println(arrayC[(index - 1) / 2]);

            }
        }
    }
}
/**************************************************************
 Problem: 1097
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:800 ms
 Memory:94840 kb
 ****************************************************************/




