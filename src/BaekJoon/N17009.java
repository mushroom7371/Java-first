package BaekJoon;

import java.io.*;

//Winning Score
public class N17009 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int appleScore = 0;
        int bananaScore = 0;

        for (int i = 0; i < 3; i++) {
            appleScore += Integer.parseInt(br.readLine()) * (3 - i);
        }

        for (int i = 0; i < 3; i++) {
            bananaScore += Integer.parseInt(br.readLine()) * (3 - i);
        }

        if (appleScore > bananaScore) {
            bw.write("A");
        } else if (appleScore < bananaScore) {
            bw.write("B");
        } else {
            bw.write("T");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17009().solution();
    }
}
