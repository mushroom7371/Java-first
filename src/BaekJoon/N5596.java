package BaekJoon;

import java.io.*;
import java.util.Arrays;

//시험 점수
public class N5596 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] minkookScoreArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] mansaeScoreArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int minkookScoreSum = 0;
        int mansaeScoreSum = 0;

        for(int i = 0; i < minkookScoreArray.length; i++){
            minkookScoreSum += minkookScoreArray[i];
        }

        for(int i = 0; i < mansaeScoreArray.length; i++){
            mansaeScoreSum += mansaeScoreArray[i];
        }


        if(mansaeScoreSum > minkookScoreSum){
            bw.write(mansaeScoreSum + "");
        }else {
            bw.write(minkookScoreSum + "");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N5596().solution();
    }
}
