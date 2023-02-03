package BaekJoon;

import java.io.*;

//5의 수난
public class N23037 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            int tempNumber = input.charAt(i) - '0';
            sum += Math.pow(tempNumber, 5);
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23037().solution();
    }
}
