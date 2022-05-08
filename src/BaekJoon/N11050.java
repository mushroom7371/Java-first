package BaekJoon;

import java.io.*;

//이항 계수1
public class N11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] inputStr = br.readLine().split(" ");  //주어진 입력을 공백으로 나눠 String 배열에 저장
        int N = Integer.parseInt(inputStr[0]);
        int K = Integer.parseInt(inputStr[1]);
        int binomialCoefficient = getFactorial(N)/(getFactorial(K)*getFactorial(N-K));
        //이항계수 값을 구하고 변수에 대입

        br.close();
        bw.write(binomialCoefficient + "");
        bw.flush();
        bw.close();

    }

    //재귀를 이용한 팩토리얼
    public static int getFactorial(int target){
        if(target > 0){
            return target * getFactorial(target - 1);
        }else{
            return 1;
        }
    }
}
