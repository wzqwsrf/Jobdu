
// 题目1026：又一版 A+B

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月17日14:54:09
 * @url：http://ac.jobdu.com/problem.php?pid=1026
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Prob1026 {
    /*
     * 1026
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            if (m == 0) {
                break;
            }
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = a + b;
            if (c == 0 || c == 1) {
                System.out.println(c);
            } else {
                List<Long> resultList = new ArrayList<Long>();
                while (c > 0) {
                    long tempC = c / m;
                    long num = c % m;
                    c = tempC;
                    resultList.add(num);
                }
                for (int j = resultList.size() - 1; j >= 0; j--) {
                    System.out.print(resultList.get(j));
                }
                System.out.println();
            }

        }
    }

}

/**
 * ***********************************************************
 * Problem: 1026
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:80 ms
 * Memory:15496 kb
 * ***************************************************************/
