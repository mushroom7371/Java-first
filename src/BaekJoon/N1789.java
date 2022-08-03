package BaekJoon;

import java.io.*;

//수들의 합
public class N1789 {
    public static void main(String[] args) throws IOException {
        //가우스 덧셈을 활용한 문제풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long targetNumber = Long.parseLong(br.readLine());
        long answerNumber = 1;

        while(numberSum(answerNumber) <= targetNumber){
            answerNumber++;
        }

        if(targetNumber - numberSum(answerNumber) < answerNumber){
            //targetNubmer 에서 1~answerNumber 까지의 합을 뺀 결과가 answerNumber 보다 작다면 -1을 해준다
            //ex) targetNumnber = 200, while문에서 도출된 answerNumber = 20, 1~20까지 더했을때 210이 된다
            //1~19까지 더했을때는 190이 되고, 이는 1~18까지 합인 171에서 18개 + 29(1개) 로 19개라 1~19까지의 개수와 동일하다.
            answerNumber--;
        }

        bw.write(answerNumber + "");
        br.close();
        bw.flush();
        bw.close();

    }

    //가우스 뎃셈 메서드 static으로 선언하여 클래스가 메모리에 적재될때 생성되서 사용가능
    static long numberSum(long n){
        return (n*(n+1))/2;
    }
}
