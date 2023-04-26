package BaekJoon;

import java.io.*;
import java.util.Arrays;

//세수정렬
public class N2752 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        for (int i = 0; i < numberArray.length; i++) {
            bw.write(numberArray[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2752().solution();
    }
}
