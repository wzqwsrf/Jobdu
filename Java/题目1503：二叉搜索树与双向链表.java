
// 题目1503：二叉搜索树与双向链表

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1503
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1524
     */
    private static StringBuffer sb;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            while (n > 0) {
                n--;
                BinaSortTree biTree = createBinaTree(st);
                sb = new StringBuffer();
                inOrder(biTree);
                System.out.println(sb);
            }
        }
    }

    private static BinaSortTree createBinaTree(StreamTokenizer st)
            throws Exception {
        st.nextToken();
        int data = (int) st.nval;
        if (data == 0) {
            return null;
        }
        BinaSortTree biTree = new BinaSortTree(data);
        biTree.lchild = createBinaTree(st);
        biTree.rchild = createBinaTree(st);
        return biTree;
    }

    private static void inOrder(BinaSortTree biTree) {

        BinaSortTree leftTree = biTree.lchild;
        if (leftTree != null) {
            inOrder(leftTree);
        }
        sb.append(biTree.data + " ");
        BinaSortTree rightTree = biTree.rchild;
        if (rightTree != null) {
            inOrder(rightTree);
        }
    }

    static class BinaSortTree {
        private int data;

        private BinaSortTree lchild;

        private BinaSortTree rchild;

        public BinaSortTree(int data, BinaSortTree lchild, BinaSortTree rchild) {
            super();
            this.data = data;
            this.lchild = lchild;
            this.rchild = rchild;
        }

        public BinaSortTree() {
            super();
        }

        public BinaSortTree(int data) {
            super();
            this.data = data;
        }
    }
}
/**************************************************************
 Problem: 1503
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:1300 ms
 Memory:34080 kb
 ****************************************************************/




