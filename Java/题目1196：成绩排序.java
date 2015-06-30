
// 题目1196：成绩排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1196
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17225947
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangzq
 * @version 3.0.0
 * @ClassName: Main1046
 * @Description: TODO
 * @date 2013-8-7 下午04:00:39
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Student[] students = new Student[n];
            for (int i = 0; i < n; i++) {
                students[i] = new Student(scanner.nextInt(),
                        scanner.nextInt());
            }
            Arrays.sort(students);
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].getSeq() + " " +
                        students[i].getScore());
            }
        }
    }

}

class Student implements Comparable<Student> {
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
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Student o) {
        if (this.score != o.score) {
            return this.score - o.score;
        } else {
            return this.seq - o.seq;
        }
    }

}
/**************************************************************
 * Problem: 1196
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1950 ms
 * Memory:144068 kb
 ****************************************************************/


                        


