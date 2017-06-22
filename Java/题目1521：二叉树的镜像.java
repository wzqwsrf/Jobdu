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
            TreeNode[] nodes = new TreeNode[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                nodes[i] = new TreeNode((int) st.nval);
            }
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                String operate = st.sval;
                if (operate.equals("d")) {
                    st.nextToken();
                    nodes[i].left = nodes[(int) st.nval];
                    st.nextToken();
                    nodes[i].right = nodes[(int) st.nval];
                } else if (operate.equals("l")) {
                    st.nextToken();
                    nodes[i].left = nodes[(int) st.nval];
                } else if (operate.equals("r")) {
                    st.nextToken();
                    nodes[i].right = nodes[(int) st.nval];
                }
            }

            mirror(nodes[1]);
            sb = new StringBuffer();
            preOrder(nodes[1]);
            System.out.println(sb.toString().trim());

        }
    }

    private static TreeNode mirror(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode node = root.left;
        root.left = mirror(root.right);
        root.right = mirror(node);
        return root;
    }

    private static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        sb.append(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
/**************************************************************
 Problem: 1521
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:350 ms
 Memory:14656 kb
 ****************************************************************/