package BaekJoon;

import java.io.*;
import java.util.Arrays;

//점수계산
public class N2506 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfQuestions = Integer.parseInt(br.readLine());
        int[] answerSheetArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int score = 0;
        int sum = 0;
        for(int i = 0; i < numberOfQuestions; i++){
            if(answerSheetArray[i] != 0){   //정답이라면 점수 + 1, 연속 정답일 경우 누적된다.
                score++;
                sum += score;
            }else{  //정답이 아니라면 스코어 초기화
                score = 0;
            }
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N2506().solution();
    }
}
