package BaekJoon;

import java.io.*;

//열 개씩 끊어 출력하기
public class N11721 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        while(input.length() > 10){ //주어진 문자열의 길이가 10보다 클때 까지 반복
            bw.write(input.substring(0, 10) + "\n");    //0~9번지까지의 문자를 버퍼에 기록
            input = input.replaceAll(input.substring(0, 10), "");   //0~9번지까지의 문자를 제거
        }

        bw.write(input);    //나머지 문자를 버퍼에 기록

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N11721().solution();
    }
}
