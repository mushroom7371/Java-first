package BaekJoon;

import java.io.*;
import java.util.*;

//Favorite Number
public class N10570 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase -- > 0){
            Map<Integer, Integer> numberHashMap = new HashMap<>();
            int numberOfNote = Integer.parseInt(br.readLine());
            int max = 0;

            for(int i = 0; i < numberOfNote; i++){
                int number = Integer.parseInt(br.readLine());

                if(numberHashMap.containsKey(number)){
                    numberHashMap.put(number, numberHashMap.get(number) + 1);
                }else{
                    numberHashMap.put(number, 1);
                }

                if(max <= numberHashMap.get(number)){
                    max = numberHashMap.get(number);
                }
            }

            List<Integer> resultList = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entrySet : numberHashMap.entrySet()){ //hashMap에 저장된 데이터 만큼 반복
                if(entrySet.getValue().equals(max)){
                    resultList.add(entrySet.getKey());
                }
            }

            Collections.sort(resultList);

            bw.write(resultList.get(0) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N10570().solution();
    }
}
