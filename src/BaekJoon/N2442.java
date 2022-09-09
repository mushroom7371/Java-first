package BaekJoon;

import java.io.*;

//별 찍기 - 5
public class N2442 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder star = new StringBuilder();

        for(int i = 0; i < N; i++){
            if(i < N - 1){
                star.append(" ");
            }else{
                star.append("*");
            }
        }

        bw.write(star + "\n");

        for(int i = N - 1; i > 0; i--){
            star.setCharAt(i - 1, '*');
            star.append("*");
            bw.write(star + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N2442().solution();
    }
}