
// 题目1368：二叉树中和为某一值的路径

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1368
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Stack;

public class Main {
    /*
     * 1368
     */
    private static BinaSortTree[] biTrees;
    private static int valueArr[];
    private static int k;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            k = (int) st.nval;
            biTrees = new BinaSortTree[n + 1];
            valueArr = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                valueArr[i] = (int) st.nval;
                st.nextToken();
                int left = (int) st.nval;
                st.nextToken();
                int right = (int) st.nval;
                BinaSortTree leftTree = null;
                BinaSortTree rightTree = null;
                if (left != -1 && right != -1) {
                    int temp = left;
                    left = Math.min(left, right);
                    right = Math.max(temp, right);
                }
                if (left != -1) {
                    leftTree = new BinaSortTree(left);
                }
                if (right != -1) {
                    rightTree = new BinaSortTree(right);
                }
                biTrees[i] = new BinaSortTree(leftTree, rightTree, i);
            }
            createTree(biTrees[1]);
            int sum = 0;
            Stack<Integer> stack = new Stack<Integer>();
            System.out.println("result:");
            printPath(biTrees[1], sum, stack);
        }
    }


    private static void createTree(BinaSortTree binaSortTree) {
        if (binaSortTree == null) {
            return;
        }
        Stack<BinaSortTree> treeStack = new Stack<BinaSortTree>();
        treeStack.push(binaSortTree);
        while (!treeStack.isEmpty()) {
            BinaSortTree biTree = treeStack.peek();
            if (biTree.lchild != null) {
                biTree.lchild = biTrees[biTree.lchild.value];
                createTree(biTree.lchild);
            }
            if (biTree.rchild != null) {
                biTree.rchild = biTrees[biTree.rchild.value];
                createTree(biTree.rchild);
            }
            treeStack.pop();
        }
    }

    private static void printPath(BinaSortTree root, int sum, Stack<Integer> stack) {
        if (root != null) {
            sum = sum + valueArr[root.value];
            stack.push(root.value);
            printPath(root.lchild, sum, stack);
            printPath(root.rchild, sum, stack);
            if (sum == k && root.lchild == null && root.rchild == null) {
                printfStack(stack);
            }
            stack.pop();
        }
    }

    private static void printfStack(Stack<Integer> stack) {
        System.out.printf("A path is found: ");
        StringBuffer sb = new StringBuffer();
        for (int num : stack) {
            sb.append(num + " ");
        }
        System.out.printf(sb.toString().trim());
        System.out.println();

    }

    private static class BinaSortTree {
        private BinaSortTree lchild;
        private BinaSortTree rchild;
        private int value;

        public BinaSortTree(int value) {
            super();
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
 * Problem: 1368
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1310 ms
 * Memory:63380 kb
 ****************************************************************/


                        


