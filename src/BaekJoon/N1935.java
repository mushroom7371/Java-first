package BaekJoon;

import java.io.*;
import java.util.Stack;

//후위 표기식2
public class N1935 {

    double calculate(double N, double M, char c){
        double result = 0;

        switch (c){
            case '+' :
                result = N + M;
                break;
            case '-' :
                result = N - M;
                break;
            case '*' :
                result = N * M;
                break;
            case '/' :
                result = N / M;
                break;
        }

        return result;
    }

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String rearNotation = br.readLine();    //후위 표기식
        Stack<Double> numberStack = new Stack<>();  //계산을 위한 stack
        double[] numberArray = new double[testCase];    //숫자가 담길 배열

        for(int i = 0; i < testCase; i++){
            numberArray[i] = Double.parseDouble(br.readLine());
        }

        for(int i = 0; i < rearNotation.length(); i++){
            char idx = rearNotation.charAt(i);  //String 객체의 i번지 문자

            if(idx >= 'A' && idx <= 'Z'){   //A~Z 라면
                numberStack.push(numberArray[idx - 'A']);   //문자에서 아스키코드만큼을 뺀 숫자(번지)를 배열에서 찾아 스택에 저장
            }else{
                Double tempNumber2 = numberStack.pop(); //연산을 위한 두번째 숫자
                Double tempNumber1 = numberStack.pop(); //연산을 위한 첫번째 숫자

                numberStack.push(calculate(tempNumber1, tempNumber2, idx)); //연산 후 스택에 다시 저장
            }
        }

        br.close();
        bw.write(String.format("%.2f", numberStack.pop()));
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1935().solution();
    }
}
