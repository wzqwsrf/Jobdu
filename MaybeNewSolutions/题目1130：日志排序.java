
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
	/*
	 * 1130
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) )  ;
		
		List<ComputerTask> comTaskList = new ArrayList<ComputerTask>();
		while (true) {
			String recordTask = br.readLine();
			if (recordTask == null || "".equals(recordTask)) {
				break;
			}
			String newRecordTask = recordTask.trim().replaceAll("['  ']+", " ");
			String []array = newRecordTask.split(Pattern.quote(" ")); 
			ComputerTask computerTask = new ComputerTask(array[0], 
					(array[1]+" "+array[2]), Double.parseDouble(array[3].replace("(s)", "")),recordTask);
			comTaskList.add(computerTask);
		}
		int size = comTaskList.size();
		ComputerTask[] comTaskArray = new ComputerTask[size];;
		for (int i = 0; i < size; i++) {
			comTaskArray[i] = comTaskList.get(i);
		}
		Arrays.sort(comTaskArray);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < size; i++) {
			sb.append(comTaskArray[i].getAllMsg()+"\n");
		}
		System.out.print(sb.toString());
	}
	
}

class ComputerTask implements Comparable<ComputerTask>{
	
	private String taskId;
	private String taskStartTime;
	private double useTime;
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
	public double getUseTime() {
		return useTime;
	}
	public void setUseTime(double useTime) {
		this.useTime = useTime;
	}
	public String getAllMsg() {
		return allMsg;
	}
	public void setAllMsg(String allMsg) {
		this.allMsg = allMsg;
	}
	public ComputerTask(String taskId, String taskStartTime, double useTime,
			String allMsg) {
		super();
		this.taskId = taskId;
		this.taskStartTime = taskStartTime;
		this.useTime = useTime;
		this.allMsg = allMsg;
	}
	public int compareTo(ComputerTask o) {
		if ( this.getUseTime() != o.getUseTime() ) {
			if (this.getUseTime() > o.getUseTime()) {
				return 1;
			}else {
				return -1;
			}
		}else {
			return this.getTaskStartTime().compareTo(o.getTaskStartTime());
		}
	}

}

/**************************************************************
	Problem: 1130
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1170 ms
	Memory:112140 kb
****************************************************************/


                        