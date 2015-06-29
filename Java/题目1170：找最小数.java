
import java.util.Arrays;
import java.util.Scanner;

/** 
 * @ClassName: Main1046 
 * @Description: TODO 
 * @author wangzq
 * @date 2013-8-7 下午04:00:39 
 * 
 * @version 3.0.0 
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			
			int n = scanner.nextInt();
			Data[] datas = new Data[n];
			for (int i = 0; i < n; i++) {
				Data data = new Data(scanner.nextInt(), scanner.nextInt());
				datas[i] = data;
			}
			Arrays.sort(datas);
			Data data =datas[0];
			System.out.println(data.getX()+" "+data.getY());
		}
	}
	
	
}
class Data implements Comparable<Data>{
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Data(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * @date 2013-8-9,下午09:28:18
	 * @author wangzq
	 * @version 3.0.0
	 *
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Data data) {
		if (this.x!=data.getX()) {
			return this.x - data.getX();
		}else {
			return this.y - data.getY();
		}
	}
	
}
/**************************************************************
	Problem: 1170
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:260 ms
	Memory:24976 kb
****************************************************************/


                        