
// 题目1032：ZOJ

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1032
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ab = scanner.next();
            int znum = 0;
            int onum = 0;
            int jnum = 0;
            for (int i = 0; i < ab.length(); i++) {
                if (ab.charAt(i) == 'Z') {
                    znum++;
                } else if (ab.charAt(i) == 'O') {
                    onum++;
                } else if (ab.charAt(i) == 'J') {
                    jnum++;
                }
            }

            if (ab.equals("E")) {
                break;
            }
            String result = "";
            for (int i = 0; i < znum; i++) {
                result += "Z";

                if (onum != 0) {
                    result += "O";
                    onum--;
                }

                if (jnum != 0) {
                    result += "J";
                    jnum--;
                }
            }

            for (int i = 0; i < onum; i++) {
                result += "O";
                if (jnum != 0) {
                    result += "J";
                    jnum--;
                }
            }

            for (int i = 0; i < jnum; i++) {
                result += "J";
            }
            System.out.println(result);
        }
    }

}

/**************************************************************
 Problem: 1032
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15544 kb
 ****************************************************************/




