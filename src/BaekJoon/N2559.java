package BaekJoon;

import java.io.*;
import java.util.*;

//수열
public class N2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfTemperatureSequence = Integer.parseInt(st.nextToken()); //온도를 측정한 전체 날짜의 수
        int consecutiveDays = Integer.parseInt(st.nextToken()); //연속적인 날짜의 수
        int consecutiveDaysTemperatureSum = 0;  //연속되는 날짜의 온도 합
        int numberOfTimesForConsecutiveDaysTemperatureSum = numberOfTemperatureSequence - consecutiveDays + 1;  //연속적인 온도의 합을 구하기 위한 반복 횟수, 전체 날짜 - 연속되는 날짜 + 1 과 같다
        int [] temperatureSequenceList = new int[numberOfTemperatureSequence];  //측정한 온도가 들어갈 배열 생성
        List<Integer> consecutiveDaysSequenceList = new ArrayList<>();  //연속적인 온도의 합이 저장될 ArrayList

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberOfTemperatureSequence; i++) { //주어진 온도들을 int로 변환하여 배열에 저장
            temperatureSequenceList[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for(int i = 0; i < numberOfTimesForConsecutiveDaysTemperatureSum; i++){ //마지막 연속되는 날짜의 합이 범위를 넘어서지 않도록 반복횟수를 지정했다.
            consecutiveDaysTemperatureSum = 0;  //반복마다 변수에 담긴 데이터 초기화
            for(int j = i; j < i + consecutiveDays; j++){   //i+연속 날짜를 통해서 반복마다 일정한 횟수가 유지된다.
                consecutiveDaysTemperatureSum += temperatureSequenceList[j];
            }
            consecutiveDaysSequenceList.add(consecutiveDaysTemperatureSum); //연속되는 온도의 합을 저장
        }

        Collections.sort(consecutiveDaysSequenceList);  //최고 온도를 구하기 위해 정렬
        bw.write(consecutiveDaysSequenceList.get(consecutiveDaysSequenceList.size()-1) + "");   //오름차순으로 설정하여 마지막 데이터를 버퍼에 기록
        bw.flush();
        bw.close();
    }
}
