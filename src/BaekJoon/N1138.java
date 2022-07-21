package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//한 줄로 서기
public class N1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int [] sequenceInfoArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();   //주어진 사람들이 기억하는 순서, N1026 주석 참고
        List<Integer> answerList = new ArrayList<>();

        for(int i = testCase; i > 0; i--){  //키를 큰 사람부터 해당 순서에 추가를 함
            answerList.add(sequenceInfoArray[i - 1], i);    //키가 큰 사람부터 본인보다 키가 큰 사람이 있는 곳(i번지) 로 추가해준다
        }

        for(int i = 0; i < testCase; i++){
            bw.write(answerList.get(i) + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
