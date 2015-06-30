

// 题目1130：日志排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1130
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17231811
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    /*
     * 1130 
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        List<ComputerTask> comTaskList = new ArrayList<ComputerTask>();
        while (true) {
            String recordTask = br.readLine();
            if (recordTask == null || "".equals(recordTask)) {
                break;
            }
            String newRecordTask = recordTask.trim().replaceAll("['  ']+", " ");
            String[] array = newRecordTask.split(Pattern.quote(" "));
            ComputerTask computerTask = new ComputerTask(array[0],
                    (array[1] + " " + array[2]), array[3], recordTask);
            comTaskList.add(computerTask);
        }
        int size = comTaskList.size();
        Collections.sort(comTaskList);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sb.append(comTaskList.get(i).getAllMsg() + "\n");
        }
        System.out.print(sb.toString());
    }
}

class ComputerTask implements Comparable<ComputerTask> {
    private String taskId;
    private String taskStartTime;
    private String useTime;
    private String allMsg;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(String taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public String getAllMsg() {
        return allMsg;
    }

    public void setAllMsg(String allMsg) {
        this.allMsg = allMsg;
    }

    public ComputerTask(String taskId, String taskStartTime, String useTime,
                        String allMsg) {
        super();
        this.taskId = taskId;
        this.taskStartTime = taskStartTime;
        this.useTime = useTime;
        this.allMsg = allMsg;
    }

    public int compareTo(ComputerTask o) {
        int len1 = this.getUseTime().length();
        int len2 = o.getUseTime().length();
        if (len1 != len2) {
            return len1 - len2;
        } else {
            int tmp = this.getUseTime().compareTo(o.getUseTime());
            if (tmp != 0) {
                return tmp;
            } else {
                len1 = this.getTaskStartTime().length();
                len2 = o.getTaskStartTime().length();
                if (len1 != len2) {
                    return len1 - len2;
                } else {
                    return this.getTaskStartTime().compareTo(o.getTaskStartTime());
                }
            }
        }
    }
}

/**************************************************************
 * Problem: 1130
 * User: wangzhenqing
 * Language: Java
 * Result: Accepted
 * Time:1120 ms
 * Memory:101560 kb
 ****************************************************************/


                        


