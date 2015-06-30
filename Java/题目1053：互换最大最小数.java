
// 题目1053：互换最大最小数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1053
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
     * 1053
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int min = array[0];
            int max = array[0];
            int maxi = 0;
            int mini = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > max) {
                    max = array[i];
                    maxi = i;
                }
                if (array[i] < min) {
                    min = array[i];
                    mini = i;
                }
            }

            array[maxi] = min;
            array[mini] = max;
            String result = "";
            for (int i = 0; i < n; i++) {
                result += array[i] + " ";
            }
            System.out.println(result.trim());
        }
    }
}
/**************************************************************
 Problem: 1053
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15488 kb
 ****************************************************************/




