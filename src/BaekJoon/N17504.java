package BaekJoon;

import java.io.*;
import java.util.Arrays;

//제리와 톰2
public class N17504 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int[] numberArray;
        numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long denominator = numberArray[testCase-1];    //분모, 초기값은 주어진 입력의 마지막 숫자
        long numerator = 1; //분자, 초기값은 1

        for(int i = testCase-2; i >= 0; i--){   //초기값을 배열에 저장된 마지막 숫자로 하였기에 바로 앞의 숫자부터 반복
            numerator += denominator * numberArray[i];  //분수의 덧셈이므로 분모값*정수 값이 분자값이 되며 이를 기존 분자 값에 더해줌
            long temp  = numerator; //분모, 분자를 뒤집기 위한 임시변수
            numerator = denominator;
            denominator = temp;
        }

        numerator = denominator - numerator;    //마지막은 1에서 분수를 빼야 하므로 설정해줌, 분모는 따로 건들 필요가 없다.

        br.close();
        bw.write(numerator + " " + denominator);
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N17504().solution();
    }
}
