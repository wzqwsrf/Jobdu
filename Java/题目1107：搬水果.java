
// 题目1107：搬水果

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1107
 */

import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1065
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            if (n == 1) {
                System.out.println(array[0]);
            } else {
                // 排序 一次，基本有序。每次选取的时候，只要比较当前的和与下一个值的大小。
                Arrays.sort(array);
                int power = 0;
                int i = 0;
                while ((i + 2) <= n) {
                    findTwoMin(array, i, n);
                    int tempNum = array[i] + array[i + 1];
                    power += tempNum;
                    array[i + 1] = tempNum;
                    i++;
                }
                System.out.println(power);
            }
        }
    }

    private static void findTwoMin(int[] array, int low, int high) {

        for (int i = low; i < low + 2; i++) {
            int k = i;
            for (int j = i + 1; j < high; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int tempNum = array[k];
                array[k] = array[i];
                array[i] = tempNum;
            }
        }
    }
}

/**************************************************************
 Problem: 1107
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1470 ms
 Memory:20656 kb
 ****************************************************************/




