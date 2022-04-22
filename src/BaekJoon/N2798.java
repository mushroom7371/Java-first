package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//블랙잭
public class N2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] input1 = br.readLine().split(" ");    //카드 개수와 목표 번호
        String [] input2 = br.readLine().split(" ");    //카드의 숫자들
        int numberOfCards = Integer.parseInt(input1[0]);    //카드 개수
        int targetNum = Integer.parseInt(input1[1]);    //목표 번호
        int [] cardsNum = new int[numberOfCards];   //카드들이 담길 배열
        List<Integer> al = new ArrayList<>();   //세가지 카드의 합이 담길 리스트

        for(int i = 0; i < input2.length; i++) {    //String으로 받은 숫자를 int로 변환 하여 배열에 저장
            cardsNum[i] = Integer.parseInt(input2[i]);
        }

        for(int i = 0; i < cardsNum.length-2; i++){ //첫번째 카드, 3중 for문으로 인하여 인덱스 범위를 넘지 않기 위해 길이-2
            for(int j = i+1; j < cardsNum.length-1; j++){   //두번째 카드
                for(int k = j+1; k < cardsNum.length; k++){ //세번재 카드
                    al.add(cardsNum[i] + cardsNum[j] + cardsNum[k]);    //각 반복마다의 합을 저장
                }
            }
        }

        Collections.sort(al, Collections.reverseOrder()); //내림차순 정렬

        for(int i = 0; i < al.size(); i++){ //큰수부터 작은수까지
            if(al.get(i) <= targetNum){ //목표 숫자보다 작거나 같으면 버퍼에 기록
                bw.write(al.get(i) + "");
                break;
            }
        }

        bw.flush();
        bw.close();

    }
}
