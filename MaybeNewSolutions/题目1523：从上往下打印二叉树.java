
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;

public class Main {
	/*
	 * 1523
	 */
	public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			BinaSortTree[] biTrees = new BinaSortTree[n+1];
			for (int i = 1; i < n+1; i++) {
				st.nextToken();
				biTrees[i] = new BinaSortTree((int)st.nval);
			}
			for (int i = 1; i < n+1; i++) {
				st.nextToken();
				String operate = st.sval;
				if (operate.equals("d")) {
					st.nextToken();
					biTrees[i].lchild = biTrees[(int) st.nval];
					st.nextToken();
					biTrees[i].rchild = biTrees[(int) st.nval];
				}else if (operate.equals("l")) {
					st.nextToken();
					biTrees[i].lchild = biTrees[(int) st.nval];
				}else if (operate.equals("r")) {
					st.nextToken();
					biTrees[i].rchild = biTrees[(int) st.nval];
				}
			}
			printByLevel(biTrees[1]);
				
		}
	}
	
	private static void printByLevel(BinaSortTree binaSortTree) {
		StringBuilder sb = new StringBuilder();
		LinkedList<BinaSortTree> biList = new LinkedList<BinaSortTree>();
		if (binaSortTree != null) {
			biList.add(binaSortTree);
			while (!biList.isEmpty()) {
				BinaSortTree biTree = biList.element();
				if (biTree.lchild != null)
					biList.add(biTree.lchild);
				if (biTree.rchild != null)
					biList.add(biTree.rchild);
				sb.append(biTree.value + " ");
				biList.remove();
			}
			System.out.println(sb.toString().trim());
		}
		
	}

	private static class BinaSortTree {
		private BinaSortTree lchild;
		private BinaSortTree rchild;
		private int value ;
		public BinaSortTree(int value) {
			super();
			this.value = value;
		}
    }

}
/**************************************************************
	Problem: 1523
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:350 ms
	Memory:14800 kb
****************************************************************/


                        