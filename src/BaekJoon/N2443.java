package BaekJoon;

import java.io.*;

//별 찍기 - 6
public class N2443 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder star = new StringBuilder();

        for(int i = 0; i < (2*N)-1; i++){
            star.append("*");
        }

        bw.write(star + "\n");

        for(int i = 0; i < N; i++){
            star.setCharAt(i, ' ');
            star.deleteCharAt(star.length() - 1);
            bw.write(star + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N2443().solution();
    }
}