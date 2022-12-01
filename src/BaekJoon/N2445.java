package BaekJoon;

import java.io.*;

//별 찍기 - 8
public class N2445 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        StringBuilder star = new StringBuilder();

        for(int i = 0; i < input * 2; i++){ //입력 길이의 2배만큼 반복하여 공백으로 초기 세팅
            star.append(" ");
        }

        for(int i = 0; i < input; i++){ //상단 별모양 
            star.setCharAt(i, '*'); //i번째 인덱스를 별로 치환
            star.setCharAt(star.length() - 1 - i, '*'); //대칭 인덱스를 별로 치환
            bw.write(String.valueOf(star) + "\n");
        }

        for(int i = input - 1; i > 0; i--){ //하단 별모양
            star.setCharAt(i, ' '); //i번째 인덱스를 공백으로 치환
            star.setCharAt(star.length() - 1 - i, ' '); //대칭 인덱스를 공백으로 치환
            bw.write(String.valueOf(star) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N2445().solution();
    }
}
