package BaekJoon;

import java.io.*;

//Welcome to SMUPC!
public class N29699 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int index = Integer.parseInt(br.readLine()) % 14 - 1;
        String str = "WelcomeToSMUPC";

        index = index < 0 ? 13 : index;
        bw.write(str.charAt(index) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29699().solution();
    }
}
