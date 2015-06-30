
// 题目1187：最小年龄的3个职工

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1187
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17240641
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
     * 1187
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            Staff[] staffArray = new Staff[N];
            for (int i = 0; i < N; i++) {
                int staffId = scanner.nextInt();
                String name = scanner.next();
                int age = scanner.nextInt();
                Staff staff = new Staff(staffId, name, age);
                staffArray[i] = staff;
            }
            Arrays.sort(staffArray);
            if (N < 3) {
                for (int i = 0; i < N; i++) {
                    System.out.println(staffArray[i].getStaffId() + " " +
                            staffArray[i].getStaffName() + " " + staffArray[i].getAge());
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    System.out.println(staffArray[i].getStaffId() + " " +
                            staffArray[i].getStaffName() + " " + staffArray[i].getAge());
                }
            }
        }
    }

}

class Staff implements Comparable<Staff> {
    private int staffId;
    private String staffName;
    private int age;

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Staff(int staffId, String staffName, int age) {
        super();
        this.staffId = staffId;
        this.staffName = staffName;
        this.age = age;
    }

    public int compareTo(Staff o) {
        if (this.getAge() != o.getAge()) {
            return this.getAge() - o.getAge();
        } else {
            if (this.getStaffId() != o.getStaffId()) {
                return this.getStaffId() - o.getStaffId();
            } else {
                return this.getStaffName().compareTo(o.getStaffName());
            }
        }
    }


}
/**************************************************************
 * Problem: 1187
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:480 ms
 * Memory:44708 kb
 ****************************************************************/


                        


