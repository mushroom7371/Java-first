package BaekJoon;

import java.io.*;
import java.util.Arrays;

//ABC
public class N3047 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        String input = br.readLine();

        for(int i = 0; i < input.length(); i++){
            bw.write(numberArray[input.charAt(i) - 65] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N3047().solution();
    }
}
