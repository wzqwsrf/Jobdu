
// 题目1167：数组排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1167 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17224793
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
     * 1167
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Map<Integer, Integer> nuMap = new HashMap<Integer, Integer>();
            int array[] = new int[n];
            int newArray[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                newArray[i] = array[i];
            }
            Arrays.sort(newArray);
            int index = 1;
            for (int i = 0; i < n; i++) {
                if (!nuMap.containsKey(newArray[i])) {
                    nuMap.put(newArray[i], index);
                    index++;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                System.out.print(nuMap.get(array[i]) + " ");
            }
            System.out.print(nuMap.get(array[n - 1]));
            System.out.println();
        }
    }
}
/**************************************************************
 Problem: 1167
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:740 ms
 Memory:37612 kb
 ****************************************************************/




