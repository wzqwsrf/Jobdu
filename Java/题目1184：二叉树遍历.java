
// 题目1184：二叉树遍历

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1184
 */

import java.util.Scanner;

public class Main {
    /*
     * 1184
     */
    private static char[] inputArr;

    private static int n;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            inputArr = input.toCharArray();
            n = 0;
            BinaSortTree biTree = createTree();

            inOrder(biTree);
            System.out.println();
        }
    }

    private static BinaSortTree createTree() {
        char node = inputArr[n];
        n++;
        if (node == '#') {
            return null;
        }
        BinaSortTree biTree = new BinaSortTree(node);
        biTree.setLchild(createTree());
        biTree.setRchild(createTree());
        return biTree;
    }

    private static void inOrder(BinaSortTree biTree) {

        BinaSortTree leftTree = biTree.getLchild();
        if (leftTree != null) {
            inOrder(leftTree);
        }
        System.out.printf(biTree.getValue() + " ");
        BinaSortTree rightTree = biTree.getRchild();
        if (rightTree != null) {
            inOrder(rightTree);
        }
    }

    private static class BinaSortTree {
        private BinaSortTree lchild;

        private BinaSortTree rchild;

        private char value;

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

        public char getValue() {
            return value;
        }

        public void setValue(char value) {
            this.value = value;
        }

        public BinaSortTree(BinaSortTree lchild, BinaSortTree rchild, char value) {
            super();
            this.lchild = lchild;
            this.rchild = rchild;
            this.value = value;
        }

        public BinaSortTree(char value) {
            this.value = value;
        }
    }
}
/**************************************************************
 Problem: 1184
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:110 ms
 Memory:17528 kb
 ****************************************************************/




