
// 题目1502：最大值最小化

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1502
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1502
     */
    private static int array[];

    private static int m, k;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            while (n > 0) {
                st.nextToken();
                m = (int) st.nval;
                st.nextToken();
                k = (int) st.nval;
                int totalValue = 0;
                int minValue = Integer.MAX_VALUE;
                array = new int[m];
                for (int i = 0; i < m; i++) {
                    st.nextToken();
                    array[i] = (int) st.nval;
                    totalValue += array[i];
                    if (array[i] < minValue) {
                        minValue = array[i];
                    }
                }
                int result = getMinTime(minValue, totalValue);
                System.out.println(result);
                n--;
            }
        }
    }

    private static int getMinTime(int minValue, int totalValue) {
        int low = minValue;
        int high = totalValue;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (canSplit(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static boolean canSplit(int mid) {
        int s = 0;
        int t = 0;
        for (int i = 0; i < m; i++) {
            if (array[i] > mid) {
                return false;
            }
            if (s + array[i] > mid) {
                t++;
                if (t > k - 1) {
                    return false;
                }
                s = array[i];
            } else {
                s += array[i];
            }
        }
        return true;
    }
}

/**************************************************************
 Problem: 1502
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:780 ms
 Memory:24024 kb
 ****************************************************************/




