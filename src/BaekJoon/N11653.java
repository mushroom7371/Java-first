package BaekJoon;

import java.io.*;

//소인수분해
public class N11653 {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //static으로 선언하여 클래스가 메모리에 적재될때 생성되어 사용가능 하다. 소인수분해 메서드를 따로 구현하여 선언함

    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());   //소인수 분해 대상 숫자
        br.close();

        soinsu(number);

        bw.flush();
        bw.close();

    }

    public static void soinsu(int number) throws IOException{   //void로 선언하여 리턴값이 없다.
        int i = 2;  //소인수 분해를 시작할 최초의 숫자
        while(number >= i){ //반복 횟수를 모르기에 조건을 두어 while문 사용
            if(number % i == 0){    //나눴을때 나머지가 0이면 나눠 떨어지눈 수이므로
                bw.write(i + "\n"); //버퍼에 기록하고
                number /= i;    //number를 다시 설정하여줌
            }else{
                i++;    //나눠떨어지지 않는다면 나눌 숫자를 증가
            }
        }
    }
}
