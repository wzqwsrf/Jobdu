
// 题目1201：二叉排序树

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1201
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1201
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            BinaSortTree biTree = null;
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                int node = (int) st.nval;
                biTree = createTree(biTree, node);
            }

            preOrder(biTree);
            System.out.println();
            inOrder(biTree);
            System.out.println();
            postOrder(biTree);
            System.out.println();
        }
    }

    private static BinaSortTree createTree(BinaSortTree biTree, int node) {
        if (biTree == null) {
            biTree = new BinaSortTree(null, null, node);
            return biTree;
        }
        BinaSortTree poinTree = biTree;

        if (node > biTree.getValue()) {
            //			poinTree = poinTree.getRchild();
            BinaSortTree righTree = createTree(poinTree.getRchild(), node);
            poinTree.setRchild(righTree);
        } else if (node < biTree.getValue()) {
            //			poinTree = poinTree.getLchild();
            BinaSortTree leftTree = createTree(poinTree.getLchild(), node);
            poinTree.setLchild(leftTree);
        }
        return biTree;
    }

    private static void preOrder(BinaSortTree biTree) {
        System.out.printf("%d ", biTree.getValue());
        BinaSortTree leftTree = biTree.getLchild();
        if (leftTree != null) {
            preOrder(leftTree);
        }
        BinaSortTree rightTree = biTree.getRchild();
        if (rightTree != null) {
            preOrder(rightTree);
        }
    }

    private static void inOrder(BinaSortTree biTree) {

        BinaSortTree leftTree = biTree.getLchild();
        if (leftTree != null) {
            inOrder(leftTree);
        }
        System.out.printf("%d ", biTree.getValue());
        BinaSortTree rightTree = biTree.getRchild();
        if (rightTree != null) {
            inOrder(rightTree);
        }
    }

    private static void postOrder(BinaSortTree biTree) {

        BinaSortTree leftTree = biTree.getLchild();
        if (leftTree != null) {
            postOrder(leftTree);
        }
        BinaSortTree rightTree = biTree.getRchild();
        if (rightTree != null) {
            postOrder(rightTree);
        }
        System.out.printf("%d ", biTree.getValue());
    }

    private static class BinaSortTree {
        private BinaSortTree lchild;

        private BinaSortTree rchild;

        private int value;

        public BinaSortTree getLchild() {
            return lchild;
        }

        public void setLchild(BinaSortTree lchild) {
            this.lchild = lchild;
        }

        public BinaSortTree getRchild() {
            return rchild;
        }

        public void setRchild(BinaSortTree rchild) {
            this.rchild = rchild;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public BinaSortTree(BinaSortTree lchild, BinaSortTree rchild, int value) {
            super();
            this.lchild = lchild;
            this.rchild = rchild;
            this.value = value;
        }
    }
}
/**************************************************************
 Problem: 1201
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2120 ms
 Memory:96552 kb
 ****************************************************************/




