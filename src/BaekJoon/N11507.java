package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

//카드셋트
public class N11507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String cardInfo = br.readLine();
        int [] numberOfCards = new int[4];  //카드 종류별 개수를 담을 배열
        Set<String> cardSet = new HashSet<>();  //카드를 담고, 중복 판단을 위한 HashSet 객체 생성
        int startIndex = 0; //주어진 문자열을 가를 기준
        boolean flag = false;   //중복시 체크될 변수

        for(int i = 0; i < cardInfo.length()/3; i++){   //카드의 정보가 3글자로 주어지므로 문자열을 3으로 나눈 횟수만큼 반복
            String card = cardInfo.substring(startIndex, startIndex + 3);   //index를 기준으로 3자리를 가른다.
            startIndex += 3;    //인덱스 재 설정

            if(cardSet.contains(card)){ //동일한 카드가 존재한다면 플래그 값을 바꾸고 반복 종료
                flag = true;
                break;
            }

            cardSet.add(card);  //카드 정보를 저장하고

            switch (card.charAt(0)){    //해당 카드의 모양에 맞는 배열의 숫자를 증가 시킨다.
                case 'P' :
                    numberOfCards[0]++;
                    break;
                case 'K' :
                    numberOfCards[1]++;
                    break;
                case 'H' :
                    numberOfCards[2]++;
                    break;
                case 'T' :
                    numberOfCards[3]++;
                    break;
            }
        }

        if(flag){
            bw.write("GRESKA");
        }else{
            for(int i = 0; i < 4; i++){ //카드는 13장이므로 있는 카드를 빼서 잃어버린 카드 숫자를 출력
                bw.write(13-numberOfCards[i] + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
