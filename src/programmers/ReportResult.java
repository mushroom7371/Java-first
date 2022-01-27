package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ReportResult {
	static int [] solution(String [] id_list, String [] report, int k) {
		int [] answer = new int[id_list.length];
		String [] report_info = null;
		List<String> list = new ArrayList<String>();
		Map<String, ArrayList<String>> count = new HashMap<>();
		Map<String, Integer> result = new LinkedHashMap<String, Integer>();
		
		for(int i = 0; i < report.length; i++) {
			if(!list.contains(report[i])) {
				list.add(report[i]);
			}
		}
	 
		for(int i = 0; i < list.size(); i++) {
			report_info = list.get(i).split(" ");
			String reporter = report_info[0];
			String target = report_info[1];
			
			if(count.containsKey(target)) {
				count.get(target).add(reporter);
			}else {
				ArrayList<String> al = new ArrayList<String>();
				al.add(reporter);
				count.put(target, al);
			}
		}
		
		System.out.println("list = " + list.toString());
		System.out.println("count = " + count.toString());
		
		return answer;
	}
	
	public static void main(String[] args) {
		String [] id_list = {"muzi", "frodo", "apeach", "neo"};
		String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","apeach muzi"};
		int k = 2;
		
		solution(id_list, report, k);
	}
}
