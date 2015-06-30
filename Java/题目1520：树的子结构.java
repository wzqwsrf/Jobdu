
// 题目1520：树的子结构

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1520
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1520
     */
    private static int arrayA[];

    private static int arrayB[];

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            arrayA = new int[n + 1];
            BinaSortTree biTreeA[] = new BinaSortTree[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                arrayA[i] = (int) st.nval;
                biTreeA[i] = new BinaSortTree(i);
            }

            organizeData(st, n, biTreeA);
            BinaSortTree biTreeB[] = new BinaSortTree[m + 1];
            arrayB = new int[m + 1];
            for (int i = 1; i < m + 1; i++) {
                st.nextToken();
                arrayB[i] = (int) st.nval;
                biTreeB[i] = new BinaSortTree(i);
            }
            organizeData(st, m, biTreeB);

            if (n == 0) {
                System.out.println("NO");
                continue;
            }

            if (m == 0) {
                System.out.println("NO");
                continue;
            }

            boolean flag = containsTree(biTreeA[1], biTreeB[1]);
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean containsTree(BinaSortTree t1, BinaSortTree t2) {
        if (t2 == null) {
            return false;
        } else {
            return subTree(t1, t2);
        }
    }

    private static boolean subTree(BinaSortTree r1, BinaSortTree r2) {
        if (r1 == null) {
            return false;
        }
        if (arrayA[r1.value] == arrayB[r2.value]) {
            if (matchTree(r1, r2)) {
                return true;
            }
        }
        return (subTree(r1.lchild, r2) || subTree(r1.rchild, r2));
    }

    private static boolean matchTree(BinaSortTree r1, BinaSortTree r2) {
        if (r2 == null) {
            return true;
        }
        if (r1 == null && r2 != null) {
            return false;
        }
        if (arrayA[r1.value] != arrayB[r2.value]) {
            return false;
        }
        return (matchTree(r1.lchild, r2.lchild) && matchTree(r1.rchild,
                r2.rchild));
    }

    private static void organizeData(StreamTokenizer st, int n,
            BinaSortTree[] biTree) throws Exception {

        for (int i = 1; i < n + 1; i++) {
            BinaSortTree leftTree = null;
            BinaSortTree rightTree = null;
            st.nextToken();
            int ki = (int) st.nval;
            if (ki == 2) {
                st.nextToken();
                leftTree = biTree[(int) st.nval];
                st.nextToken();
                rightTree = biTree[(int) st.nval];
            } else if (ki == 1) {
                st.nextToken();
                leftTree = biTree[(int) st.nval];
            }
            biTree[i].lchild = leftTree;
            biTree[i].rchild = rightTree;
        }
    }

    private static class BinaSortTree {
        private BinaSortTree lchild;

        private BinaSortTree rchild;

        private int value;

        public BinaSortTree(int value) {
            super();
            this.value = value;
        }
    }
}
/**************************************************************
 Problem: 1520
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:480 ms
 Memory:24264 kb
 ****************************************************************/




