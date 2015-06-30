
// 题目1014：排名

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1014
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
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }
            int M = scanner.nextInt();
            int G = scanner.nextInt();
            int queScoreArray[] = new int[M + 1];
            for (int i = 1; i <= M; i++) {
                queScoreArray[i] = scanner.nextInt();
            }
            int pastExamNum = 0;
            Student[] students = new Student[N];
            for (int i = 0; i < N; i++) {
                String stuId = scanner.next();
                int score = 0;
                int everyM = scanner.nextInt();
                for (int j = 0; j < everyM; j++) {
                    int num = scanner.nextInt();
                    score += queScoreArray[num];
                }

                if (score >= G) {
                    pastExamNum += 1;
                }
                Student student = new Student(stuId, score);
                students[i] = student;
            }
            Arrays.sort(students);
            System.out.println(pastExamNum);
            for (int i = 0; i < students.length; i++) {
                int score = students[i].getScore();
                if (score >= G) {
                    System.out.println(students[i].getStuId() + " "
                            + students[i].getScore());
                }
            }

        }
    }
}

class Student implements Comparable<Student> {

    private String stuId;
    private int score;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String stuId, int score) {
        super();
        this.stuId = stuId;
        this.score = score;
    }

    /**
     * @date 2013-8-10,下午12:58:04
     * @author wangzq
     * @version 3.0.0
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Student o) {
        if (this.score != o.score) {
            return o.score - this.score;
        } else {
            return this.getStuId().compareTo(o.getStuId());
        }
    }

}

/**************************************************************
 * Problem: 1014
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:2060 ms
 * Memory:131704 kb
 ****************************************************************/


                        


