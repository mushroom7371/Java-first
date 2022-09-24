package BaekJoon;

import java.io.*;

//평균 점수
public class N10039 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;

        for(int i = 0; i < 5; i++){
            int score = Integer.parseInt(br.readLine());

            if(score < 40){
                score = 40;
            }

            sum += score;

        }

        bw.write(sum/5 + "");
        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N10039().solution();
    }
}
