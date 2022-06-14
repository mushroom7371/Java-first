package BaekJoon;

import java.io.*;
import java.util.*;

//파일 정리
public class N20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Map<String, Integer> fileNameExtensionHashMap = new HashMap<>();    //파일의 확장자와 개수를 저장할 HashMap 객체 생성

        for(int i = 0; i < testCase; i++){
            String [] file = br.readLine().split("\\.");    // '.'를 기준으로 문자열을 가르고 배열에 저장

            if(fileNameExtensionHashMap.containsKey(file[1])){  //두번째 번지의 데이터가 확장자며, hashMap 객체에 이미 들어있다면, 해당 value값을 +1 해준다.
                fileNameExtensionHashMap.put(file[1], fileNameExtensionHashMap.get(file[1]) + 1);
            }else{  //없는 확장자면 value를 1로 저장
                fileNameExtensionHashMap.put(file[1], 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedHashMap = new ArrayList<>(fileNameExtensionHashMap.entrySet());  //HashMap의 데이터를 정렬 하기 위한 ArrayList 객체 생성

        Collections.sort(sortedHashMap, new Comparator<Map.Entry<String, Integer>>() {  //키값을 기준으로 정렬
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for(int i = 0; i < sortedHashMap.size(); i++){  //반복을 돌면서 ArrayList에 담긴 정렬된 데이터를 key 와 value 값으로 버퍼에 저장
            bw.write(sortedHashMap.get(i).getKey() + " " + sortedHashMap.get(i).getValue() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
