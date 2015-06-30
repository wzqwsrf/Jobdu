
// 题目1046：求最大值

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1046
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
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("max=" + max);
        }
    }
}

/**************************************************************
 Problem: 1046
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15496 kb
 ****************************************************************/




