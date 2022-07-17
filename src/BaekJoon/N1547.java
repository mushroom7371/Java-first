package BaekJoon;

import java.io.*;
import java.util.Arrays;

//공
public class N1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int [] cupArray = {1, 0, 0};

        for(int i = 0; i < testCase; i++){
            int [] changeCupArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int temp = cupArray[changeCupArray[0] - 1];
            cupArray[changeCupArray[0] - 1] = cupArray[changeCupArray[1] - 1];
            cupArray[changeCupArray[1] - 1] = temp;
        }

        for(int i = 0; i < cupArray.length; i++){
            if(cupArray[i] == 1){
                bw.write(i + 1 + "");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
