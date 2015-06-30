
// 题目1348：数组中的逆序对

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1348
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1348
     */
    private static long count = 0;

    private static int array[];

    private static int tempArr[];

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            array = new int[n];
            tempArr = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            count = 0;
            mergeSort(0, n - 1);
            System.out.println(count);
        }
    }

    private static void mergeSort(int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(low, mid);
        mergeSort(mid + 1, high);
        mergeArray(low, mid, high);
    }

    private static void mergeArray(int low, int mid, int high) {
        int center = mid + 1;
        int k = low;
        int temp = low;
        while (low <= mid && center <= high) {
            if (array[low] > array[center]) {
                tempArr[k] = array[center];
                count += mid - low + 1;
                center++;
            } else {
                tempArr[k] = array[low];
                low++;
            }
            k++;
        }

        while (low <= mid) {
            tempArr[k] = array[low];
            low++;
            k++;
        }

        while (center <= high) {
            tempArr[k] = array[center];
            center++;
            k++;
        }
        while (temp <= high) {
            array[temp] = tempArr[temp++];
        }
    }
}
/**************************************************************
 Problem: 1348
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:740 ms
 Memory:27752 kb
 ****************************************************************/




