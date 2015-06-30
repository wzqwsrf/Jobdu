
// 题目1057：众数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1057
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
     * 1057
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = 20;
            int array[] = new int[n];
            int newArray[] = new int[11];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                newArray[array[i]]++;
            }
            int max = 0;
            for (int i = 0; i < 11; i++) {
                if (newArray[i] > newArray[max]) {
                    max = i;
                }
            }
            System.out.println(max);
        }
    }
}

/**************************************************************
 Problem: 1057
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:18848 kb
 ****************************************************************/




