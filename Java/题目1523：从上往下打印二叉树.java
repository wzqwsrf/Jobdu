
// 题目1523：从上往下打印二叉树

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1523
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/18081821
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    /*
     * 1523
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
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
            printByLevel(biTrees[1]);
        }
    }

private static void printByLevel(BinaSortTree binaSortTree) {
        StringBuilder sb = new StringBuilder();
        Queue<BinaSortTree> queue = new LinkedList<BinaSortTree>();  
        queue.offer(binaSortTree);  
        while(!queue.isEmpty()){  
            int size = queue.size();  
            for(int i = 0; i < size; i++){  
            	BinaSortTree biTree = queue.peek();  
                queue.poll();
                sb.append(biTree.value + " ");
                if(biTree.lchild != null){  
                    queue.offer(biTree.lchild);  
                }  
                if(biTree.rchild != null){  
                    queue.offer(biTree.rchild);  
                }  
            }  
        }  
        System.out.println(sb.toString().trim());
    }    private static class BinaSortTree {
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
 Problem: 1523
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:350 ms
 Memory:14792 kb
 ****************************************************************/




