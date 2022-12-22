package BaekJoon;

import java.io.*;

//수학은 체육과목 입니다
public class N15894 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long numberOfSquare = Long.parseLong(br.readLine());

        bw.write(numberOfSquare * 4 + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N15894().solution();
    }
}
