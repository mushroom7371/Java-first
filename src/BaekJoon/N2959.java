package BaekJoon;

import java.io.*;
import java.util.Arrays;

//거북이
public class N2959 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] stepArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int result = stepArray[0] * stepArray[2];
        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2959().solution();
    }
}
