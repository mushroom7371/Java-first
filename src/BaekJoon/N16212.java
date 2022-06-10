package BaekJoon;

import java.io.*;
import java.util.Arrays;

//정열적인 정렬
public class N16212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String testCase = br.readLine();    //안씀...
        int [] numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numberArray);

        for(int i = 0; i < numberArray.length; i++){
            bw.write(numberArray[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
