
// 题目1339：ACM（25分）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1339
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
     * 1351
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Teams[] teams = new Teams[n];
            for (int i = 0; i < n; i++) {
                teams[i] = new Teams(scanner.next(),
                        scanner.nextInt(), scanner.nextInt());
            }
            Arrays.sort(teams);
            for (int i = 0; i < teams.length; i++) {
                System.out.println(teams[i].getName());
            }
        }
    }

}

class Teams implements Comparable<Teams> {
    private String name;
    private int num;
    private int punish;

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

    public int getPunish() {
        return punish;
    }

    public void setPunish(int punish) {
        this.punish = punish;
    }

    public Teams(String name, int num, int punish) {
        super();
        this.name = name;
        this.num = num;
        this.punish = punish;
    }

    /**
     * @date 2013-8-9,上午11:13:58
     * @author wangzq
     * @version 3.0.0
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Teams o) {
        if (this.num != o.num) {
            return o.num - this.num;
        } else {
            if (this.punish != o.punish) {
                return this.punish - o.punish;
            } else {
                return this.name.compareTo(o.name);
            }
        }
    }
}

/**************************************************************
 * Problem: 1339
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1090 ms
 * Memory:18976 kb
 ****************************************************************/


                        


