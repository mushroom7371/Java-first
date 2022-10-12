package BaekJoon;

import java.io.*;
import java.util.*;

//Stacking Cups
public class N14769 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> cupInfoMap = new HashMap<>();  //컵의 색상과 반경이 담길 HashMap
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String inputA = st.nextToken();
            String inputB = st.nextToken();

            if(inputA.charAt(0) < 'a'){ //첫번째 입력 문자가 숫자라면 오류로 인한 늘어난 반경임
                cupInfoMap.put(inputB, Integer.parseInt(inputA));   //두번째 입력 문자(색상)이 key값으로, 반경이 value로 들어감
            }else{  //첫번재 입력 문자가 문자라면 색상임
                cupInfoMap.put(inputA, Integer.parseInt(inputB) * 2);   //첫번째 입력 문자를 key값으로, 오류로 인한 2배로 늘어난 반경을 value로 설정
            }
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(cupInfoMap.entrySet());   //HashMap을 정렬하기 위해 LinkedList를 생성하고
        entryList.sort(Map.Entry.comparingByValue());   //value를 오름차순으로 정렬한다

        for(Map.Entry<String, Integer> entry : entryList){  //출력
            bw.write(entry.getKey() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N14769().solution();
    }
}
