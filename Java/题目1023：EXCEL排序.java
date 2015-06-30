
// 题目1023：EXCEL排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1023
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17219709
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

    /*
     * 1023
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            Student[] students = new Student[num];
            int seq = scanner.nextInt();
            if (num == 0 && seq == 0) {
                break;
            }
            for (int i = 0; i < num; i++) {
                Student student = new Student(seq, scanner.next(),
                        scanner.next(), scanner.nextInt());
                students[i] = student;
            }
            Arrays.sort(students);
            System.out.println("Case " + count + ":");
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].getStudentId() + " " +
                        students[i].getName() + " " + students[i].getNum());
            }
            count += 1;
        }
        System.out.println();
    }

}

class Student implements Comparable<Student> {
    private int caseNo;
    private String studentId;
    private String name;
    private int num;

    public int getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(int caseNo) {
        this.caseNo = caseNo;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Student(int caseNo, String studentId, String name, int num) {
        super();
        this.caseNo = caseNo;
        this.studentId = studentId;
        this.name = name;
        this.num = num;
    }

    /**
     * @date 2013-8-9,下午10:58:17
     * @author wangzq
     * @version 3.0.0
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Student o) {
        if (this.caseNo == 1) {
            return this.getStudentId().compareTo(o.getStudentId());
        } else if (this.caseNo == 2) {
            if (!o.getName().equals(this.getName())) {
                return this.getName().compareTo(o.getName());
            } else {
                return this.getStudentId().compareTo(o.getStudentId());
            }
        } else if (this.caseNo == 3) {
            if (o.getNum() != this.getNum()) {
                return this.getNum() - o.getNum();
            } else {
                return this.getStudentId().compareTo(o.getStudentId());
            }
        }
        return 0;
    }

}

/**************************************************************
 * Problem: 1023
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:2470 ms
 * Memory:144608 kb
 ****************************************************************/


                        


