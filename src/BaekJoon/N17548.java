package BaekJoon;

import java.io.*;

//Greetings!
public class N17548 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int lengthOfE = input.length() - 2;

        StringBuilder result = new StringBuilder();
        result.append("h");
        for (int i = 0; i < lengthOfE * 2; i++) {
            result.append("e");
        }
        result.append("y");

        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17548().solution();
    }
}
