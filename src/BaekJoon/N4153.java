package BaekJoon;

import java.io.*;

//직각삼각형
public class N4153 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] strArr;   //입력으로 주어진 숫자를 나눠 담을 배열을 가리킬 참조변수 선언
        int a;
        int b;
        int c;

        while(true){    //언제까지 반복이 실시 될지 모르므로 while문 사용
            String str = br.readLine();

            strArr = str.split(" ");    //공백을 기준으로 나눈 문자를 배열에 담아 참조변수가 가리키도록 함
            a = Integer.parseInt(strArr[0]);    //String 타입이므로 계산을 위해 int형으로 변환
            b = Integer.parseInt(strArr[1]);
            c = Integer.parseInt(strArr[2]);

            if(a == 0){ //입력이 "0 0 0"으로 들어오면 반복을 마침
                break;
            }

            //직각 삼각형은 가장 긴 변의 제곱이 나머지 변들의 제곱의 합과 같다
            if(c * c == a * a + b * b){
                bw.write("right" + "\n");
            }else if(b * b == a * a + c * c){
                bw.write("right" + "\n");
            }else if(a * a == b * b + c * c){
                bw.write("right" + "\n");
            }else{
                bw.write("wrong" + "\n");
            }

        }

        br.close();
        bw.flush();
        bw.close();

    }
}
