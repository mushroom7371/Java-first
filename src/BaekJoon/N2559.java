package BaekJoon;

import java.io.*;
import java.util.*;

//수열
public class N2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfTemperatureSequence = Integer.parseInt(st.nextToken());
        int consecutiveDays = Integer.parseInt(st.nextToken());
        int consecutiveDaysTemperatureSum = 0;
        List<Integer> temperatureSequenceList = new ArrayList<>();
        List<Integer> consecutiveDaysSequenceList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numberOfTemperatureSequence; i++){
            temperatureSequenceList.add(Integer.parseInt(st.nextToken()));
        }
        br.close();

        if(consecutiveDays == 1){
            Collections.sort(temperatureSequenceList);
            bw.write(temperatureSequenceList.get(temperatureSequenceList.size() -1) + "");
        }else{
            while(temperatureSequenceList.size() >= consecutiveDays){
                for(int i = 0; i < consecutiveDays; i++){
                    consecutiveDaysTemperatureSum += temperatureSequenceList.get(i);
                }
                consecutiveDaysSequenceList.add(consecutiveDaysTemperatureSum);
                consecutiveDaysTemperatureSum = 0;
                temperatureSequenceList.remove(0);
            }

            Collections.sort(consecutiveDaysSequenceList);
            bw.write(consecutiveDaysSequenceList.get(consecutiveDaysSequenceList.size() -1) + "");
        }

        bw.flush();
        bw.close();
    }
}
