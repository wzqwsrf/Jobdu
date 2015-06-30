
// 题目1403：神奇的开关

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1403
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
     * 1403
     */
    private static int n, c, len1, len2;
    private static boolean success;
    private static List<Integer> openList, closeList;
    private static List<String> resultList;
    private static int array[];

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) st.nval;
            array = new int[n + 1];
            Arrays.fill(array, 1);
            openList = new ArrayList<Integer>();
            closeList = new ArrayList<Integer>();
            st.nextToken();
            c = (int) st.nval;
            if (c > 4) {
                if (c % 2 == 1) {
                    c = 3;
                } else {
                    c = 4;
                }
            }
            while (true) {
                st.nextToken();
                int num = (int) st.nval;
                if (num != -1) {
                    openList.add(num);
                } else {
                    break;
                }
            }

            while (true) {
                st.nextToken();
                int num = (int) st.nval;
                if (num != -1) {
                    closeList.add(num);
                } else {
                    break;
                }
            }
            success = false;
            len1 = openList.size();
            len2 = closeList.size();
            resultList = new ArrayList<String>();
            dfs(0);
            if (success) {
                Collections.sort(resultList);
                int size = resultList.size();
                for (int i = 0; i < size; i++) {
                    System.out.println(resultList.get(i));
                }
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }

    private static void dfs(int k) {
        if (k > c) {
            return;
        }
        if (checkStatus()) {
            if (k == c) {
                success = true;
                StringBuffer sb = new StringBuffer();
                for (int j = 1; j < n + 1; j++) {
                    sb.append(array[j]);
                }
                String result = sb.toString();
                if (!resultList.contains(result)) {
                    resultList.add(result);
                }
                return;
            }
        }
        for (int i = 0; i < 4; i++) {
            changeStatus(i);
            dfs(k + 1);
            changeStatus(i);
        }
    }

    private static void changeStatus(int i) {
        if (i == 0) {
            for (int j = 1; j < n + 1; j++) {
                array[j] = array[j] == 1 ? 0 : 1;
            }
        } else if (i == 1) {
            for (int j = 1; j < n + 1; j += 2) {
                array[j] = array[j] == 1 ? 0 : 1;
            }
        } else if (i == 2) {
            for (int j = 2; j < n + 1; j += 2) {
                array[j] = array[j] == 1 ? 0 : 1;
            }
        } else {
            for (int j = 1; j < n + 1; j += 3) {
                array[j] = array[j] == 1 ? 0 : 1;
            }
        }
    }

    private static boolean checkStatus() {
        boolean flag1 = true;
        boolean flag2 = true;
        for (int i = 0; i < len1; i++) {
            if (array[openList.get(i)] == 0) {
                flag1 = false;
                break;
            }
        }
        for (int i = 0; i < len2; i++) {
            if (array[closeList.get(i)] == 1) {
                flag2 = false;
                break;
            }
        }
        if (flag1 && flag2) {
            return true;
        } else {
            return false;
        }
    }
}
/**************************************************************
 * Problem: 1403
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:330 ms
 * Memory:27084 kb
 ****************************************************************/


                        


