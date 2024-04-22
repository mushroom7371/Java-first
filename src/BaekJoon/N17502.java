package BaekJoon;

import java.io.*;

//클레어와 팰린드롬
public class N17502 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("?") && input[input.length - 1 - i].equals("?")) {
                input[i] = "a";
                input[input.length - 1 - i] = "a";
            } else if (input[i].equals("?")) {
                input[i] = input[input.length - 1 - i];
            } else if (input[input.length - 1 - i].equals("?")) {
                input[input.length - 1 - i] = input[i];
            }
        }

        for (int i = 0; i < input.length; i++) {
            bw.write(input[i]);
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17502().solution();
    }
}
