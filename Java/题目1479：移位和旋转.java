
// 题目1479：移位和旋转

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1479
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1479
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            int arrayA[] = new int[n + 1];
            int arrayB[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                arrayA[i] = i;
            }
            int midN = 0;
            if (n % 2 == 0) {
                midN = n / 2;
            } else {
                midN = (n - 1) / 2;
            }

            st.nextToken();
            int k = (int) st.nval;
            for (int i = 0; i < k; i++) {
                st.nextToken();
                int seq = (int) st.nval;

                int tempLen = n - seq;
                for (int j = 1; j < n + 1; j++) {
                    int location = j + tempLen;
                    if (location > n) {
                        location = (j + tempLen) % n;
                    }
                    arrayB[location] = arrayA[j];
                }
                for (int j = 1; j < n + 1; j++) {
                    arrayA[j] = arrayB[j];
                }
                int low = 1;
                int high = midN;
                while (low < high) {
                    int tempNum = arrayA[low];
                    arrayA[low] = arrayA[high];
                    arrayA[high] = tempNum;
                    low++;
                    high--;
                }
            }

            StringBuffer sb = new StringBuffer();
            for (int i = 1; i < n + 1; i++) {
                sb.append(arrayA[i] + " ");
            }
            System.out.println(sb);
        }
    }
}

/**************************************************************
 Problem: 1479
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:170 ms
 Memory:21940 kb
 ****************************************************************/




