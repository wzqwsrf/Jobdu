
// 题目1005：Graduate Admission

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:51
 * @url:http://ac.jobdu.com/problem.php?pid=1005
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int N, M, K;
            N = scanner.nextInt();
            M = scanner.nextInt();
            K = scanner.nextInt();
            int[] universityCount = new int[M];
            for (int i = 0; i < M; i++) {
                universityCount[i] = scanner.nextInt();
            }
            Integer[][] students = new Integer[N][2 + K];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 2 + K; j++) {
                    students[i][j] = scanner.nextInt();
                }
            }

            Set<Student> stuList = new TreeSet<Student>();
            int num = 0;
            for (Integer[] student : students) {
                List<Integer> set = new ArrayList<Integer>();
                for (int i = 2; i < student.length; i++) {
                    set.add(student[i]);
                }

                int sutNum = num++;
                Student stu = new Student(student[0], student[1], set, sutNum);
                if (!stuList.add(stu)) {
                    System.out.println("in");
                    stu.setIn(true);
                    stuList.add(stu);
                }
            }

            University[] uns = new University[M];

            int unnum = 1;
            for (int i = 0; i < universityCount.length; i++) {
                University un = new University(universityCount[i], false,
                        new TreeSet<Integer>(), unnum++);
                uns[i] = un;
            }

            for (Student stu : stuList) {
                List<Integer> set = stu.getUniversitySet();
                changeUniversity(stu, set, uns);
            }

            for (University university : uns) {
                Set<Integer> set = new TreeSet<Integer>();
                set = university.getStuNum();
                String result = "";
                for (Integer re : set) {
                    result += re + " ";
                }
                System.out.println(result.trim());
            }

        }

    }

    /**
     * @param stu
     * @param set
     * @param uns
     * @author lyz
     * @version 3.0.0
     */
    private static boolean changeUniversity(Student stu, List<Integer> set,
                                            University[] uns) {
        for (Integer unum : set) {
            University un = uns[unum];
            List<Student> stus = un.getStuList();
            if (!un.isFull()) {
                int count = un.getCount();
                un.setCount(count - 1);
                un.getStuNum().add(stu.getNum());
                stus.add(stu);
                if (un.getCount() == 0) {
                    un.setFull(true);
                }
                return true;
            } else {
                if (stu.isIn) {
                    for (Student student : stus) {
                        if (student.ge == stu.ge && student.avg == stu.avg) {
                            stus.add(stu);
                            un.getStuNum().add(stu.getNum());
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}

class Student implements Comparable<Student> {

    int num;

    int ranking;

    int ge;

    int gi;

    int error;

    List<Integer> universitySet;

    int avg;

    boolean isIn;

    public Student(int ge, int gi, List<Integer> universitySet, int num) {
        super();
        this.ge = ge;
        this.gi = gi;
        this.universitySet = universitySet;
        this.avg = (ge + gi) / 2;
        this.isIn = false;
        this.num = num;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getGe() {
        return ge;
    }

    public void setGe(int ge) {
        this.ge = ge;
    }

    public int getGi() {
        return gi;
    }

    public void setGi(int gi) {
        this.gi = gi;
    }

    public List<Integer> getUniversitySet() {
        return universitySet;
    }

    public void setUniversitySet(List<Integer> universitySet) {
        this.universitySet = universitySet;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }


    /**
     * @author lyz
     * @version 3.0.0
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Student stu2) {
        int avg1 = this.getAvg();
        int avg2 = stu2.getAvg();
        if (avg1 > avg2) {
            return -1;
        }
        if (avg1 < avg2) {
            return 1;
        }
        if (avg1 == avg2) {
            if (this.getGe() > stu2.getGe()) {
                return -1;
            } else if (this.getGe() < stu2.getGe()) {
                return 1;
            } else {
                stu2.setIn(true);
                return -1;
            }
        }
        return 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public boolean isIn() {
        return isIn;
    }

    public void setIn(boolean isIn) {
        this.isIn = isIn;
    }

}

class University {

    int num;

    int count;

    boolean isFull;

    Set<Integer> stuNum;

    List<Student> stuList;

    public University(int count, boolean isFull, Set<Integer> stuNum, int num) {
        super();
        this.num = num;
        this.count = count;
        this.isFull = isFull;
        this.stuNum = stuNum;
        this.stuList = new ArrayList<Student>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }

    public Set<Integer> getStuNum() {
        return stuNum;
    }

    public void setStuNum(Set<Integer> stuNum) {
        this.stuNum = stuNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

}
/**************************************************************
 * Problem: 1005
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:120 ms
 * Memory:19048 kb
 ****************************************************************/


                        


