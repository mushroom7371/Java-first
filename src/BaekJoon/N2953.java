package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//나는 요리사다
public class N2953 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] scoreArray = new int[5];
        int maxScore = 0;

        for(int i = 0; i < scoreArray.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                scoreArray[i] += Integer.parseInt(st.nextToken());
            }

            if(maxScore <= scoreArray[i]){
                maxScore = scoreArray[i];
            }
        }

        for(int i = 0; i < scoreArray.length; i++){
            if(scoreArray[i] == maxScore){
                bw.write(i + 1 + " " + maxScore);
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N2953().solution();
    }
}
