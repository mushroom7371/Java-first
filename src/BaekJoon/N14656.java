package BaekJoon;

import java.io.*;
import java.util.Arrays;

//조교는 새디스트야!!
public class N14656 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfStudent = Integer.parseInt(br.readLine());
        int [] correctSequenceArray = new int[numberOfStudent];
        int BbaDdaTarget = 0;

        for(int i = 0; i < correctSequenceArray.length; i++){
            correctSequenceArray[i] = i + 1;
        }

        int [] studentSequenceArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < correctSequenceArray.length; i++){
            if(correctSequenceArray[i] != studentSequenceArray[i]){
                BbaDdaTarget++;
            }
        }

        bw.write(BbaDdaTarget + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14656().solution();
    }
}
