package BaekJoon;

import java.io.*;

//팩토리얼
public class N10872 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());   //주어진 수를 입력 받아 변수에 할당
        br.close();
        int sum = factorial(number);    //재귀 함수를 호출하여 나온 결과 값을 변수에 할당
        bw.write(sum + "");
        bw.flush();
        bw.close();

    }

    public static int factorial(int number){    //팩토리얼 재귀함수
        if(number <= 1){    //재귀 함수는 스스로를 다시 호출 하기에 끝나는 조건을 주어야 멈춘다.
            return 1;
        }

        return number * factorial(number-1);    //인자값을 -1 하여 다시 메서드 호출
    }
}
