
// 题目1035：找出直系亲属

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1035
 */

import java.util.Scanner;

public class Main {

    /*
     * 1035
     */
    private static int[] child;

    static {
        child = new int[26];
        for (int i = 0; i < 26; i++) {
            child[i] = i;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n == 0 && m == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {
                String letter = scanner.next();
                char a = letter.charAt(0);
                int num = a - 'A';
                char b = letter.charAt(1);
                char c = letter.charAt(2);
                if (b != '-') {
                    child[b - 'A'] = num;
                }
                if (c != '-') {
                    child[c - 'A'] = num;
                }

            }

            for (int i = 0; i < m; i++) {
                String letter = scanner.next();
                char a = letter.charAt(0);
                char b = letter.charAt(1);
                int num1 = a - 'A';
                int num2 = b - 'A';
                if (num1 == num2) {
                    System.out.println("-");
                    continue;
                }
                int rank1 = findRank(num1, num2);
                int rank2 = findRank(num2, num1);
                int rank = rank1 - rank2;
                if (rank == 0) {
                    System.out.println("-");
                    continue;
                }
                int finalRank = rank > 0 ? rank : (-rank);
                while (finalRank > 2) {
                    System.out.print("great-");
                    finalRank--;
                }
                if (finalRank == 2) {
                    System.out.print("grand");
                }
                if (rank > 0) {
                    System.out.print("parent");
                } else {
                    System.out.print("child");
                }
                System.out.println();
            }
        }
    }

    private static int findRank(int num1, int num2) {
        int rank = 1;
        while (child[num1] != num2) {
            if (child[num1] == num1) {
                return 0;
            }
            num1 = child[num1];
            rank++;
        }
        return rank;
    }
}
/**************************************************************
 Problem: 1035
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15464 kb
 ****************************************************************/




