
// 题目1521：二叉树的镜像

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1521
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/25214443
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1521
     */
    private static StringBuffer sb;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n <= 0) {
                System.out.println("NULL");
                continue;
            }
            BinaSortTree[] biTrees = new BinaSortTree[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                biTrees[i] = new BinaSortTree((int) st.nval);
            }
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                String operate = st.sval;
                if (operate.equals("d")) {
                    st.nextToken();
                    biTrees[i].lchild = biTrees[(int) st.nval];
                    st.nextToken();
                    biTrees[i].rchild = biTrees[(int) st.nval];
                } else if (operate.equals("l")) {
                    st.nextToken();
                    biTrees[i].lchild = biTrees[(int) st.nval];
                } else if (operate.equals("r")) {
                    st.nextToken();
                    biTrees[i].rchild = biTrees[(int) st.nval];
                }
            }

            mirror(biTrees[1]);
            sb = new StringBuffer();
            preOrder(biTrees[1]);
            System.out.println(sb.toString().trim());

        }
    }

    private static void mirror(BinaSortTree binaSortTree) {
        if (binaSortTree == null) {
            return;
        }
        BinaSortTree biTree = binaSortTree.lchild;
        binaSortTree.lchild = binaSortTree.rchild;
        binaSortTree.rchild = biTree;
        mirror(binaSortTree.lchild);
        mirror(binaSortTree.rchild);
    }

    private static void preOrder(BinaSortTree biTree) {
        sb.append(biTree.value + " ");
        BinaSortTree leftTree = biTree.lchild;
        if (leftTree != null) {
            preOrder(leftTree);
        }

        BinaSortTree rightTree = biTree.rchild;
        if (rightTree != null) {
            preOrder(rightTree);
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
 Problem: 1521
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:350 ms
 Memory:14768 kb
 ****************************************************************/




