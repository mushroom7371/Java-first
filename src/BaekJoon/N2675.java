package BaekJoon;

import java.io.*;

//문자열 반복
public class N2675 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine()); //테스트 케이스의 갯수
        String [] strArr;   //주어진 문자열을 저장한 배열을 가리킬 참조변수 선언
        String answer = ""; //각 테스트 데이터의 결과를 저장할 변수 선언 및 초기화
        int loop;   //반복횟수를 저장할 변수 선언

        for(int i = 0; i < testCase; i++){
            strArr = br.readLine().split("");
            //split()메서드 내부를 확인해 보면 기준으로 나눈 데이터의 갯수를 크기로 가지는 String 타입의 배열을 생성하여 순차적으로 저장후 이를 반환한다
            loop = Integer.parseInt(strArr[0]); //반복 횟수를 저장

            for(int j = 2; j < strArr.length; j++){ //실제 반복될 문자는 두번째 번지에 들어있다.
                for(int k = 0; k < loop; k++){  //주어진 반복 횟수만큼
                    answer += strArr[j];    //문자를 저장한다.
                }
            }

            bw.write(answer + "\n");
            answer = "";    //초기화 하지 않으면 이전 문자열이 남게 됨
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
