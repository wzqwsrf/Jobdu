
// 题目1346：会员积分排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1346
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17226673
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
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            Member members[] = new Member[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int id = (int) st.nval;
                st.nextToken();
                int s = (int) st.nval;
                Member member = new Member(id, s);
                members[i] = member;
            }
            Arrays.sort(members);
            int tmp = Math.min(n, m);
            for (int i = 0; i < tmp; i++) {
                System.out.println(members[i].getId());
            }
        }
    }

}

class Member implements Comparable<Member> {
    private int id;
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

    public int compareTo(Member o) {

        if (this.getS() != o.getS()) {
            return o.getS() - this.getS();
        } else {
            return this.getId() - o.getId();
        }
    }

}

/**************************************************************
 * Problem: 1346
 * User: wangzhenqing
 * Language: Java
 * Result: Accepted
 * Time:2810 ms
 * Memory:50996 kb
 ****************************************************************/


                        


