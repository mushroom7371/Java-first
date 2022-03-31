package BaekJoon;

import java.io.*;
import java.math.BigInteger;

//큰 수 A+B
public class N10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] numbers = br.readLine().split(" ");

        //long의 저장 가능한 값을 넘어서는 정수형을 저장할수 있는 BigInteger 클래스 사용
        BigInteger numA = new BigInteger(numbers[0]);   //String으로 표현 된 크기가 큰 정수를 인자로 객체를 생성
        BigInteger numB = new BigInteger(numbers[1]);

        br.close();
        bw.write(numA.add(numB) + "");  //일반적인 사칙 연산이 되지 않으므로 내부 메서드를 이용하여 합계를 구함
        bw.flush();
        bw.close();

    }
}
