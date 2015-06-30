
// 题目1481：Is It A Tree?

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1481
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1481
     */
    private static int n = 10002;

    private static int parent[];

    private static boolean flag;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        int k = 1;
        initParent();
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int a = (int) st.nval;
            st.nextToken();
            int b = (int) st.nval;
            if (a == -1 && b == -1) {
                break;
            }
            if (a == 0 && b == 0) {
                if (flag) {
                    System.out.println("Case " + k + " is a tree.");
                } else {
                    System.out.println("Case " + k + " is not a tree.");
                }
                k++;
                initParent();
                continue;
            }
            union(a, b);
        }
    }

    private static void initParent() {
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        flag = true;
    }

    private static void union(int f, int t) {

        int a = findParent(f);
        int b = findParent(t);
        if (a != b) {
            parent[b] = a;
        } else {
            flag = false;
        }

    }

    private static int findParent(int f) {
        while (parent[f] != f) {
            f = parent[f];
        }
        return f;
    }
}

/**************************************************************
 Problem: 1481
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:250 ms
 Memory:25572 kb
 ****************************************************************/




