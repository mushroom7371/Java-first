package BaekJoon;

import java.io.*;
import java.util.*;

//회사에 있는 사람
public class N7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Map<String, String> peopleInfo = new HashMap<>();   //중복이 없는 이름을 key로, 출/퇴근 여부를 value로 저장 하기 위해 HashMap 객체 생성
        List<String> listForSort = new ArrayList<>();   //정렬을 위한  ArrayList 객체 생성

        for(int i = 0; i < testCase; i++){
            String [] inputArray = br.readLine().split(" ");    //0번지에 이름, 1번지에 출/퇴근 여부로 split하여 배열에 저장
            peopleInfo.put(inputArray[0], inputArray[1]);   //퇴근은 출근보다 빠를 수 없기에 "leave"가 나오면 value를 덮어쓰게 된다.
        }

        for (Map.Entry<String, String> entry : peopleInfo.entrySet()) { //entrySet()은 key와 value를 반환 하기에 원하는 값을 찾을 수 있다.
            String key = entry.getKey();
            String value = entry.getValue();

            if(value.equals("enter")){  //이미 HashMap에 퇴근한 인원이 파악 되었기에 "enter"인 인원이 회사에 남아있다.
                listForSort.add(key);
            }
        }

        Collections.sort(listForSort, Collections.reverseOrder());  //역순으로 이름 정렬

        for(int i = 0; i < listForSort.size(); i++){
            bw.write(listForSort.get(i) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
