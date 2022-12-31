package BaekJoon;

import java.io.*;

//첫 글자를 대문자로
public class N4458 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0) {
            String[] input = br.readLine().split("");
            input [0] = input[0].toUpperCase();

            for(int i = 0; i < input.length; i++){
                bw.write(input[i]);
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4458().solution();
    }
}
