package BaekJoon;

import java.io.*;
import java.util.*;

//생일
public class N5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        HashMap<String, Integer> nameAndAge = new HashMap<>();  //이름과 나이 중복이 없기에 hashMap 생성후 데이터 저장 예정

        for(int i = 0; i < testCase; i++){
            String [] inputArray = br.readLine().split(" ");    //공백을 기준으로 String을 가른다. 0번지는 이름, 1번지는 일, 2번지는 월, 3번지는 년도

            if(inputArray[2].length() == 1){    //월이 한자리로 들어온다면 0을 더해준다.
                inputArray[2] = "0" + inputArray[2];
            }

            if(inputArray[1].length() == 1){    //일이 한자리로 들어온다면 0을 더해준다.
                inputArray[1] = "0" + inputArray[1];
            }

            int age = Integer.parseInt(inputArray[3] + inputArray[2] + inputArray[1]);  //생년월일 비교를 위해 문자열을 년월일 순으로 붙혀 int타입으로 변환 하였다.
            nameAndAge.put(inputArray[0], age); //이름과 생년월일을 저장
        }

        br.close();

        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(nameAndAge.entrySet());  //value로 정렬
        entryList.sort(((o1, o2) -> o1.getValue().compareTo(o2.getValue())));

        bw.write(entryList.get(entryList.size()-1).getKey() + "\n");    //오름차순이기에 마지막 데이터가 나이가 가장 적다
        bw.write(entryList.get(0).getKey() + "");   //반대로 첫번째 데이터는 나이가 가장 많다.
        bw.flush();
        bw.close();

    }
}
