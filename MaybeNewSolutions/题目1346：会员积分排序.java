

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
public class Main{
	/*
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			Member members[] = new Member[n];
			for (int i = 0; i < n; i++) {
				Member member = new Member(scanner.nextInt(), scanner.nextInt());
				members[i] = member;
			}
			Arrays.sort(members);
			for (int i = 0; i < Math.min(n, m); i++) {
				System.out.println(members[i].getId());
			}
		}
	}
	
}

class Member implements Comparable<Member>{
	private int id ;
	private int s;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public Member(int id, int s) {
		super();
		this.id = id;
		this.s = s;
	}
	/**
	 * @date 2013-8-11,下午10:25:12
	 * @author wangzq
	 * @version 3.0.0
	 *
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Member o) {
		
		if (this.getS()!=o.getS()) {
			return o.getS() - this.getS();
		}else {
			return this.getId() - o.getId();
		}
	}
	
}
/**************************************************************
	Problem: 1346
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:5850 ms
	Memory:135012 kb
****************************************************************/


                        