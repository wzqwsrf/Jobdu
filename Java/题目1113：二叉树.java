
// 题目1113：二叉树

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1113
 */

import java.util.Scanner;

public class Main {
    /*
     * 1113
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            if (m == 0 && n == 0) {
                break;
            }

            int deepM = (int) (Math.log(m) / Math.log(2)) + 1;
            int deepN = (int) (Math.log(n) / Math.log(2)) + 1;

            int deep = deepN - deepM;

            int count = (int) Math.pow(2, deep) - 1;

            int left = m;
            int right = m;
            for (int i = 1; i <= deep; i++) {
                left *= 2;
                right = right * 2 + 1;
            }

            if (n >= right) {
                count += right - left + 1;
            } else if (n > left) {
                count += n - left + 1;
            }
            System.out.println(count);
        }
    }
}
/**************************************************************
 Problem: 1113
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15532 kb
 ****************************************************************/




