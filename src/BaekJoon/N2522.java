package BaekJoon;

import java.io.*;

//
public class N2522 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        StringBuilder star = new StringBuilder();

        for(int i = 0; i < input; i++){
            star.append(" ");
        }

        for(int i = input -1; i >= 0; i--){ //상단 별모양
            star.setCharAt(i, '*'); //i번째 인덱스를 별로 치환
            bw.write(String.valueOf(star) + "\n");
        }

        for(int i = 0; i < input; i++){ //하단 별모양
            star.setCharAt(i, ' '); //i번째 인덱스를 공백으로 치환
            bw.write(String.valueOf(star) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N2522().solution();
    }
}
