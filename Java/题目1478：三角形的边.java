
// 题目1478：三角形的边

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1478
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
     * 1478
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int array[] = new int[3];
            array[0] = scanner.nextInt();
            if (array[0] == 0) {
                break;
            }
            array[1] = scanner.nextInt();
            array[2] = scanner.nextInt();

            Arrays.sort(array);
            System.out.println(array[0] + array[1] - array[2]);
        }
    }
}

/**************************************************************
 Problem: 1478
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:100 ms
 Memory:17620 kb
 ****************************************************************/




