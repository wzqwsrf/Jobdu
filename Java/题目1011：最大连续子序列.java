
// 题目1011：最大连续子序列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1011
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
     * 1011
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int k = scanner.nextInt();
            if (k == 0) {
                break;
            }
            int array[] = new int[k];
            array[0] = scanner.nextInt();
            int sum = array[0];
            int currentSum = array[0];
            int firstNum = 0;
            int lastNum = 0;
            int head = 0;
            int tail = 0;
            for (int i = 1; i < k; i++) {
                array[i] = scanner.nextInt();
                if (currentSum < 0) {
                    currentSum = array[i];
                    firstNum = i;
                    lastNum = i;
                } else {
                    currentSum += array[i];
                    lastNum = i;
                }
                if (currentSum > sum) {
                    sum = currentSum;
                    head = firstNum;
                    tail = lastNum;
                }
            }
            if (sum < 0) {
                sum = 0;
                System.out.println(0 + " " + array[0] + " " + array[k - 1]);
            } else {
                System.out.println(sum + " " + array[head] + " " + array[tail]);
            }
        }
    }
}

/**************************************************************
 Problem: 1011
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:530 ms
 Memory:64956 kb
 ****************************************************************/




