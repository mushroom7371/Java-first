package BaekJoon;

import java.io.*;

//수 이어 쓰기1
public class N1748 {
    public static void main(String[] args) throws IOException {
        //알고리즘을 풀어서 설명하기 어렵다... 직접 손으로 수계산을 써보면 바로 이해 가능
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String numberStr = br.readLine();   //입력 숫자의 자리수를 편하게 구하려고 String으로 숫자를 받았다.
        int numberInt = Integer.parseInt(numberStr);    //문자열을 숫자로 변환하여 변수에 저장
        int numberOfDigits = 0; //이어 쓴 숫자의 자릿수

        for(int i = 1; i < numberStr.length(); i++){    //입력 자리수-1 만큼 반복
            numberOfDigits += 9 * (double)Math.pow(10, i-1) * i;
            //입력 숫자의 자리수 전까지의 이어 쓴 수의 자리수는 9*1 + 9*10*2 + 9*10*10*3 ... 의 규칙을 가지고 있다. 위의 코드는 이를 나타냄
        }

        numberInt -= (double)Math.pow(10,numberStr.length() - 1) - 1;
        //맨 뒤의 -1을 조심하자, numberInt -= <==로 표현 했기에 -의 -가 되어 결과적으로 +1이 된다.
        //입력 숫자의 마지막 자리수의 갯수를 판단하기 위해 사용함 EX) 120은 3자리 숫자(100, 101, 102, ... 120)가 120-100+1 개 만큼 있다
        numberOfDigits += numberInt * numberStr.length();

        br.close();
        bw.write(numberOfDigits + "");
        bw.flush();
        bw.close();

    }
}
