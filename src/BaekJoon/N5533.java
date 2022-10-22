package BaekJoon;

import java.io.*;
import java.util.Arrays;

//유니크
public class N5533 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int[][] peopleArray = new int[testCase][];
        int[] sumArray = new int[testCase];
        int sum = 0;

        for(int i = 0; i < testCase; i++){
            peopleArray[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < testCase; j++){
                for(int k = 0; k < testCase; k++){
                    if(j == k){
                        continue;
                    }
                    if(peopleArray[j][i] != peopleArray[k][i]){
                        sum = peopleArray[j][i];
                    }else{
                        sum = 0;
                        break;
                    }
                }
                sumArray[j] += sum;
                sum = 0;
            }
        }

        for(int i = 0; i < testCase; i++){
            bw.write(sumArray[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N5533().solution();
    }
}
