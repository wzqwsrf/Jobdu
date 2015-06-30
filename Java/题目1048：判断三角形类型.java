
// 题目1048：判断三角形类型

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1048
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
            int[] array = new int[3];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            int sum = array[0] * array[0] + array[1] * array[1] - array[2]
                    * array[2];
            if (sum == 0) {
                System.out.println("直角三角形");
            } else if (sum < 0) {
                System.out.println("钝角三角形");
            } else {
                System.out.println("锐角三角形");
            }
        }
    }
}
/**************************************************************
 Problem: 1048
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15496 kb
 ****************************************************************/




