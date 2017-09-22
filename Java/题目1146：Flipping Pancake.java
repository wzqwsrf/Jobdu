
// 题目1146：Flipping Pancake

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2017-09-22 13:41:59
 * @url:http://ac.jobdu.com/problem.php?pid=1146
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//最短路径
public class Main {
    /*
     * 1249
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
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
            int ans[] = new int[2 * n];
            int k = 0;
            for (int pos = n - 1; pos > 0; pos--) {
                if (array[pos] == pos + 1) {
                    continue;
                }
                int i = 0;
                for (; i < pos; i++) {
                    if (array[i] == pos + 1) {
                        break;
                    }
                }
                boolean flag = false;
                int j = 0;
                for (; j < i; j++) {
                    if (array[j] == pos) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    if (j != 0) {
                        swap(array, j);
                        ans[k++] = j + 1;
                    }
                    swap(array, i - 1);
                    ans[k++] = i;
                }
                if (i != 0) {
                    swap(array, i);
                    ans[k++] = i + 1;
                }
                swap(array, pos);
                ans[k++] = pos + 1;
            }
            StringBuffer sb = new StringBuffer();
            sb.append(k).append(" ");
            for (int i = 0; i < k; i++) {
                sb.append(ans[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }

    private static void swap(int[] array, int len) {
        int i = 0;
        int j = len;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

}
/**************************************************************
 Problem: 1146
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14468 kb
 ****************************************************************/

//比较好理解的思路
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1249
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
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
            int ans[] = new int[2 * n];
            int k = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (array[i] == i + 1) {
                    continue;
                }
                for (int j = 1; j < i; j++) {
                    if (array[j] == i + 1) {
                        swap(array, j);
                        ans[k++] = j + 1;
                    }
                }
                swap(array, i);
                ans[k++] = i + 1;
            }
            StringBuffer sb = new StringBuffer();
            sb.append(k).append(" ");
            for (int i = 0; i < k; i++) {
                sb.append(ans[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }

    private static void swap(int[] array, int len) {
        int i = 0;
        int j = len;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

}
/**************************************************************
 Problem: 1146
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14468 kb
 ****************************************************************/