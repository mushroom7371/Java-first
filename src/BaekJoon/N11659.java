package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//구간 합 구하기4
public class N11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());    //StringTokenizer를 통한 문자열 분리, 인자를 따로 설정하지 않아 띄어쓰기가 기본 기준
        int numberOfNaturalNumber = Integer.parseInt(st.nextToken());   //구간 합을 구하기 위한 자연수의 개수
        int numberOfTimesForSum = Integer.parseInt(st.nextToken()); //합을 구해야 하는 횟수
        int [] cumulativeSum = new int[numberOfNaturalNumber +1];   //뒤의 반복문에서 0번지가 아닌 1번지부터 시작 할 예정으로 크기를 +1 해주었다.
        int sum = 0;    //배열에 저장될 각 구간 합이 저장될 변수

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= numberOfNaturalNumber; i++){    //1부터 자연수 개수까지
//            sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());   ==> 아래의 합을 간소화 하는 방법중 하나 by myc. 이전 번지의 합에 새로 들어올 숫자를 더한다.
            sum += Integer.parseInt(st.nextToken());
            cumulativeSum[i] = sum; //각각의 번지에 구간 합을 저장
        }

        while(numberOfTimesForSum-->0) {    //for문 대신으로 사용할 while문, 반복 횟수가 정해졌기에 사용 가능, 0이 될때까지 반복 한다
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());   //i번째 숫자부터
            int j = Integer.parseInt(st.nextToken());   //j번째 숫자까지의 구간 합을 위한 변수

            bw.write(cumulativeSum[j] - cumulativeSum[i-1] + "\n"); //j까지의 구간 합에서 i-1까지의 구간합을 빼면 원하는 구간 합이 나온다.
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
