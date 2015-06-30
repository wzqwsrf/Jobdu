
// 题目1251：序列分割

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1251
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    /*
     * 1251
     */
    private static Integer array[];

    private static int visit[];

    private static int n;

    private static int tempSum;

    private static int group;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) st.nval;
            if (n == 0) {
                break;
            }
            int sum = 0;
            array = new Integer[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                sum += array[i];
            }
            Arrays.sort(array, Collections.reverseOrder());
            int resultM = 1;
            for (int i = array[0]; i <= sum; i++) {
                if (sum % i == 0) {
                    tempSum = i;
                    group = sum / i;
                    visit = new int[n];
                    if (dfs(1, 0, 0)) {
                        resultM = group;
                        break;
                    }
                }
            }
            System.out.println(resultM);
        }
    }

    private static boolean dfs(int groupId, int sum, int start) {
        if (groupId == group) {
            return true;
        }
        for (int i = start; i < n; i++) {
            if (visit[i] != 0) {
                continue;
            }
            int needSum;
            if ((needSum = sum + array[i]) < tempSum) {
                visit[i] = groupId;
                if (dfs(groupId, needSum, i + 1)) {
                    return true;
                }
                visit[i] = 0;
                if (start == 0) {
                    break;
                }
            } else if (needSum == tempSum) {
                visit[i] = groupId;
                groupId++;
                if (dfs(groupId, 0, 0)) {
                    return true;
                }
                visit[i] = 0;
                break;
            }
        }
        return false;
    }
}

/**************************************************************
 Problem: 1251
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:20104 kb
 ****************************************************************/




