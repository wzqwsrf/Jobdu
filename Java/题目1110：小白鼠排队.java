

// 题目1110：小白鼠排队

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1110
 */

import java.io.StreamTokenizer;
import java.util.Arrays;
/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
	public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(System.in);
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int N = (int) st.nval;
			Mouse[] mouses = new Mouse[N];
			for (int i = 0; i < N; i++) {
				st.nextToken();
				int weight = (int) st.nval;
				st.nextToken();
				String color = st.sval;
				Mouse mouse = new Mouse(weight, color);
				mouses[i] = mouse;
			}
			Arrays.sort(mouses);
			for (int i = 0; i < mouses.length; i++) {
				System.out.println(mouses[i].getColor());
			}
			
		}
	}
}

class Mouse implements Comparable<Mouse>{
	
	private int weight;
	private String color;

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Mouse(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	/**
	 * @date 2013-8-13,下午06:03:32
	 * @author wangzq
	 * @version 3.0.0
	 *
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Mouse o) {
		
		return o.weight - this.getWeight();
	}
	
}

/**************************************************************
	Problem: 1110
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:70 ms
	Memory:14564 kb
****************************************************************/


                        


