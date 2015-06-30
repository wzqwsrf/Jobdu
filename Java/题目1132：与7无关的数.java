
// 题目1132：与7无关的数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1132
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
     * 1132
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            long result = 0;
            for (int i = 0; i <= n; i++) {
                if (i % 7 == 0) {
                    continue;
                } else {
                    boolean flag = false;
                    char[] array = (i + "").toCharArray();
                    for (int j = 0; j < array.length; j++) {
                        if (array[j] == '7') {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        result += i * i;
                    }
                }
            }
            System.out.println(result);
        }
    }
}
/**************************************************************
 Problem: 1132
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:290 ms
 Memory:28556 kb
 ****************************************************************/




