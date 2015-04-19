
// 题目1050：完数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月19日21:43:20
 * @url:http://ac.jobdu.com/problem.php?pid=1050
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prob1050 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<Integer> arrList = new ArrayList<Integer>();
            for (int i = 2; i <= n; i++) {
                int sum = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    arrList.add(sum);
                }
            }
            String result = "";
            for (int i = 0; i < arrList.size(); i++) {
                result += arrList.get(i) + " ";
            }
            System.out.println(result.trim());
        }

    }

}
/**
 * ***********************************************************
 * Problem: 1050
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:330 ms
 * Memory:17156 kb
 * **************************************************************
 */