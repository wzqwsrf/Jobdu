
// 题目1124：Digital Roots

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1124
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
     * 1124
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String nStr = scanner.next();
            if (nStr.equals("0")) {
                break;
            }
            if (nStr.length() == 1) {
                System.out.println(nStr);
            } else {
                while (nStr.length() > 1) {
                    nStr = getSingleSum(nStr);
                }
                System.out.println(nStr);
            }
        }
    }

    private static String getSingleSum(String nStr) {
        int firnalRes = 0;
        for (int i = 0; i < nStr.length(); i++) {
            firnalRes += nStr.charAt(i) - '0';
        }
        return firnalRes + "";
    }

}

/**************************************************************
 Problem: 1124
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:320 ms
 Memory:26752 kb
 ****************************************************************/




