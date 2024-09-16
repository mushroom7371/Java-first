package BaekJoon;

import java.io.*;

//Zadanie próbne
public class N8545 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        for (int i = input.length()-1; i >= 0; i--) {
            bw.write(input.charAt(i));
        }


        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N8545().solution();
    }
}
