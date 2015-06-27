
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
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			Student[] students = new Student[n];
			for (int i = 0; i < n; i++) {
				students[i] = new Student(scanner.nextInt(), scanner.nextInt());
			}
			Arrays.sort(students);
			for (int i = 0; i < students.length; i++) {
				System.out.println(students[i].getSeq()+" "+students[i].getScore());
			}
		}
	}
	
}	

class Student implements Comparable<Student>{
	private int seq;
	private int score;
	
	public Student(int seq, int score) {
		super();
		this.seq = seq;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}


	/**
	 * @date 2013-8-9,下午02:01:20
	 * @author wangzq
	 * @version 3.0.0
	 *
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Student o) {
		if(this.score!=o.score){
            return this.score-o.score;
        }else {
            return this.seq-o.seq;
        }
	}
	
}
/**************************************************************
	Problem: 1196
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1950 ms
	Memory:144068 kb
****************************************************************/


                        