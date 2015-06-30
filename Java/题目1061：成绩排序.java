
// 题目1061：成绩排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1061
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17219925
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1061
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int N = (int) st.nval;
            Student[] students = new Student[N];
            for (int i = 0; i < N; i++) {
                st.nextToken();
                String name = st.sval;
                st.nextToken();
                int age = (int) st.nval;
                st.nextToken();
                int score = (int) st.nval;
                Student student = new Student(name, age, score);
                students[i] = student;
            }
            Arrays.sort(students);
            for (int i = 0; i < N; i++) {
                System.out.println(students[i].getName() + " " +
                        students[i].getAge() + " " + students[i].getScore());
            }
        }
    }
}

class Student implements Comparable<Student> {

    private String name;
    private int age;
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

    public int compareTo(Student o) {
        if (o.getScore() != this.getScore()) {
            return this.getScore() - o.getScore();
        } else {
            if (!o.getName().equals(this.getName())) {
                return this.getName().compareTo(o.getName());
            } else {
                return this.getAge() - o.getAge();
            }
        }
    }

}

/**************************************************************
 * Problem: 1061
 * User: wangzhenqing
 * Language: Java
 * Result: Accepted
 * Time:1590 ms
 * Memory:107776 kb
 ****************************************************************/


                        


