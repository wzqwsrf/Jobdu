
// 题目1419：文献排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1419
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17231173
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
     * 1419
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int N = Integer.parseInt(scanner.nextLine());
            SortString array[] = new SortString[N];
            for (int i = 0; i < N; i++) {
                String ab = scanner.nextLine();
                SortString sortStr = new SortString(ab.toLowerCase(), ab);
                array[i] = sortStr;
            }
            Arrays.sort(array);
            for (int i = 0; i < N; i++) {
                System.out.println(array[i].getAllMsg());
            }
        }
    }

    static class SortString implements Comparable<SortString> {

        private String firStr;
        private String allMsg;

        public String getFirStr() {
            return firStr;
        }

        public void setFirStr(String firStr) {
            this.firStr = firStr;
        }

        public String getAllMsg() {
            return allMsg;
        }

        public void setAllMsg(String allMsg) {
            this.allMsg = allMsg;
        }

        public SortString(String firStr, String allMsg) {
            super();
            this.firStr = firStr;
            this.allMsg = allMsg;
        }

        public int compareTo(SortString o) {
            return this.getFirStr().compareTo(o.getFirStr());
        }

    }
}
/**************************************************************
 * Problem: 1419
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1450 ms
 * Memory:30228 kb
 ****************************************************************/


                        


