package BaekJoon;

import java.io.*;
import java.util.*;

//점수 계산
public class N2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] scoreArray = new int [8];    //점수가 담길 배열
        int [] answerArray = new int[5];    //상위 5개 점수의 인덱스가 담길 배열
        int scoreSum = 0;   //총점이 담길 변수

        for(int i = 0; i < scoreArray.length; i++){ //점수를 배열에 저장
            int score = Integer.parseInt(br.readLine());
            scoreArray[i] = score;
        }

        Integer [] tempArray = Arrays.stream(scoreArray)
                .boxed().toArray(Integer[]::new);  
        //Array.sort를 이용하기 위해서는 Integer 타입의 배열이 필요하여 스트림을 통해 scoreArray에 담긴 int 타입 요소를 반복하며 Integer 타입으로 바꾸고 배열에 저장한다. 
        Arrays.sort(tempArray, Comparator.reverseOrder());  //점수가 높은 순으로 정렬

        for(int i = 0; i < 5; i++){ //상위 5개의 점수만큼 반복
            scoreSum += tempArray[i];   //총점 구하기
            for(int j = 0; j < scoreArray.length; j++){ //배열의 길이가 크지 않고 정적이므로 2중 for문으로 시간 복잡도를 생각 안했다.
                if(tempArray[i] == scoreArray[j]){  //정렬된 점수와 원배열의 점수가 일치하면
                    answerArray[i] = j + 1; //해당 인덱스를 뽑아낸다. 단 배열은 0번지부터 시작으로 1을 더함
                    break;  //조금이라도 시간을 줄이기 위해 break를 걸었다
                }
            }
        }

        Arrays.sort(answerArray);   //다시 인덱스를 오름차순으로 정렬
        bw.write(scoreSum + "\n");

        for(int i = 0; i < answerArray.length; i++){
            bw.write(answerArray[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
