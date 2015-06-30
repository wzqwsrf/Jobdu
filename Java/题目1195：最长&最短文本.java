
// 题目1195：最长&最短文本

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1195
 */

import java.util.Scanner;

public class Main {
    /*
     * 1195
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int length = a.length();
        int max = length;
        int min = length;
        StringBuffer minSb = new StringBuffer(a + "\n");
        StringBuffer maxSb = new StringBuffer(a + "\n");
        while (scanner.hasNextLine()) {
            String b = scanner.nextLine();
            if (b == null || "".equals(b)) {
                break;
            }
            int blength = b.length();
            if (blength > max) {
                max = blength;
                maxSb = new StringBuffer();
                maxSb.append(b + "\n");
            } else if (blength == max) {
                maxSb.append(b + "\n");
            }
            if (blength < min) {
                min = blength;
                minSb = new StringBuffer();
                minSb.append(b + "\n");
            } else if (blength == min) {
                minSb.append(b + "\n");
            }
        }
        System.out.print(minSb.toString());
        System.out.print(maxSb.toString());
    }
}
/**************************************************************
 Problem: 1195
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:330 ms
 Memory:28336 kb
 ****************************************************************/




