
// 题目1190：大整数排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1190
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17225519
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    /*
     * 1190
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            String array[] = new String[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.next();
            }
            Arrays.sort(array, new sortString());
            for (int i = 0; i < N; i++) {
                System.out.println(array[i]);
            }
        }
    }

}

class sortString implements Comparator<String> {

    public int compare(String o1, String o2) {
        if (o1.length() != o2.length()) {
            return o1.length() - o2.length();
        } else {
            return o1.compareTo(o2);
        }
    }
}
/**************************************************************
 * Problem: 1190
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:320 ms
 * Memory:26108 kb
 ****************************************************************/


                        


