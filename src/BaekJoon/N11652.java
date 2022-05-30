package BaekJoon;

import java.io.*;
import java.util.*;

//카드
public class N11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Map<Long, Integer> cardsHashMap = new HashMap<>();  //중복숫자를 제외 하기 위한 HashMap
        List<Long> maxNumberList = new ArrayList<>();   //가장 많이 중복된 숫자를 저장할 ArrayList 객체 생성
        int maxValue = 1;   //초기 value값

        for(int i = 0; i < testCase; i++){
            Long cardNumber = Long.parseLong(br.readLine());

            if(cardsHashMap.containsKey(cardNumber)){   //hashMap에 입력으로 받은 숫자가 중복된다면
                cardsHashMap.put(cardNumber, cardsHashMap.get(cardNumber) + 1); //value를 1 증가 시켜준다.
                if(maxValue <= cardsHashMap.get(cardNumber)){   //최대 중복 숫자라면
                    maxValue = cardsHashMap.get(cardNumber);    //중복 숫자의 최대 값으로 설정해 준다.
                }
            }else{
                cardsHashMap.put(cardNumber, 1);    //처음 나오는 숫자일때
            }
        }

        for(Long key : cardsHashMap.keySet()){  //hashMap의 key 숫자만큼 반복하면서
            if(cardsHashMap.get(key).equals(maxValue)){ //해당 key의 value값이 가장 많이 최대 중복수와 같다면
                maxNumberList.add(key); //key를 ArrayList에 담아둔다
            }
        }

        Collections.sort(maxNumberList);    //key값 중 최소 값을 구하기 위해 정렬

        br.close();
        bw.write(maxNumberList.get(0) + "");
        bw.flush();
        bw.close();

    }
}
