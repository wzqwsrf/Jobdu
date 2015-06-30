
// 题目1065：输出梯形

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1065
 */

import java.util.Scanner;

public class Main {
    /*
     * 1065
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int h = scanner.nextInt();
            StringBuffer sb = new StringBuffer();
            int allh = 3 * h - 2;
            for (int i = 0; i < h; i++) {
                int symNum = h + i * 2;
                int blankNum = allh - symNum;
                while (blankNum > 0) {
                    sb.append(" ");
                    blankNum--;
                }
                while (symNum > 0) {
                    sb.append("*");
                    symNum--;
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}
/**************************************************************
 Problem: 1065
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:260 ms
 Memory:43208 kb
 ****************************************************************/




