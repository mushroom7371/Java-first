package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//성적 통계
public class N5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 1; i <= testCase; i++){ //클래스 입력을 쉽게 하기위해 1부터 시작
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());   //클래스의 인원수
            int [] scoreArray = new int[n]; //인원수 만큼의 크기를 가진 배열 생성

            for(int j = 0; j < n; j++){ //학생 점수 입력
                scoreArray[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(scoreArray);    //오름차순으로 정렬

            int gap = 0;    //가장 큰 인접한 두점수 차이를 저장할 변수
            for(int j = 0; j < n - 1; j++){ //오름차순이라 큰 점수 - 작은 점수가 될것이므로 반복 범위는 n-1이 된다.
                gap = Math.max(gap, scoreArray[j+1] - scoreArray[j]);   //점수 차이의 최대값을 변수에 저장
            }

            bw.write("Class " + i + "\n");
            bw.write("Max " + scoreArray[n-1] + ", Min " + scoreArray[0] + ", Largest gap " + gap + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
