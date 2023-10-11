package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//야바위 대장
public class N15814 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split("");
        int numberOfSwap = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfSwap; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstIndex = Integer.parseInt(st.nextToken());
            int secondIndex = Integer.parseInt(st.nextToken());
            String temp = input[firstIndex];
            input[firstIndex] = input[secondIndex];
            input[secondIndex] = temp;
        }

        for (String s : input) {
            bw.write(s);
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15814().solution();
    }
}
