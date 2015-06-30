
// 题目1169：比较奇偶数个数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1169
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
     * 1169
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int array[] = new int[n];
            int evenNum = 0;
            int oddNum = 0;
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                if (array[i] % 2 == 0) {
                    evenNum++;
                } else {
                    oddNum++;
                }
            }
            if (evenNum > oddNum) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}

/**************************************************************
 Problem: 1169
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:200 ms
 Memory:22888 kb
 ****************************************************************/




