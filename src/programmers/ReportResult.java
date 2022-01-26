package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ReportResult {
	static int [] solution(String [] id_list, String [] report, int k) {
		 int [] answer = {};
		 List<String> list = new ArrayList<String>();
		 Map<String, Integer> count = new HashMap<String, Integer>();
		 
		 for(int i = 0; i < id_list.length; i++) {
			 count.put(id_list[i], 0);
		 }
		 
		 for(int i = 0; i < report.length; i++) {
			 if(!list.contains(report[i])) {
				 list.add(report[i]);
			 }
		 }
		 
		 for(int i = 0; i < count.size(); i++) {
			 for(int j = 0; j < count.size(); j++) {
				 String [] report_info = report[i].split(" ");
				 if()
				 
			 }
		 }
		 
		 System.out.println(list.toString());
		 System.out.println(count.toString());
		 
		 return answer;
	}
	
	public static void main(String[] args) {
		String [] id_list = {"muzi", "frodo", "apeach", "neo"};
		String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		solution(id_list, report, k);
	}
}
