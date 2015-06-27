
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
	/*
	 * 1061
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int N = scanner.nextInt();
			Student[] students = new Student[N];
			for (int i = 0; i < N; i++) {
				Student student = new Student(scanner.next(), scanner.nextInt(), scanner.nextInt());
				students[i] = student;
			}
			Arrays.sort(students);
			for (int i = 0; i < N; i++) {
				System.out.println(students[i].getName()+" "+students[i].getAge()+" "+students[i].getScore());
			}
		}
	}
	
	
}
class Student implements Comparable<Student>{
	
	private String name ;
	private int age ;
	private int score;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	/**
	 * @date 2013-8-11,下午09:36:44
	 * @author wangzq
	 * @version 3.0.0
	 *
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Student o) {
		if (o.getScore()!=this.getScore()) {
			return this.getScore() - o.getScore() ;
		}else {
			if (!o.getName().equals(this.getName())) {
				return this.getName().compareTo(o.getName());
			}else {
				return this.getAge()-o.getAge();
			}
		}
	}
	
}

/**************************************************************
	Problem: 1061
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:2100 ms
	Memory:159368 kb
****************************************************************/


                        