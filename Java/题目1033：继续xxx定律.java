
// 题目1033：继续xxx定律

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1033
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
     * 1033
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int numArray[] = new int[300001];
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                int num = array[i];
                while (num > 1) {
                    if (num % 2 == 0) {
                        num = num / 2;
                    } else {
                        num = (3 * num + 1) / 2;
                    }
                    numArray[num] = 1;
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int i = array.length - 1; i >= 0; i--) {
                if (numArray[array[i]] != 1) {
                    sb.append(array[i] + " ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }

}
/**************************************************************
 Problem: 1033
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:290 ms
 Memory:38464 kb
 ****************************************************************/




