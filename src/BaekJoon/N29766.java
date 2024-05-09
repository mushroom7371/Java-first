package BaekJoon;

import java.io.*;

//DKSH 찾기
public class N29766 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        int count = 0;
        for (int i = 0; i < input.length() - 3; i++) {
            if (input.charAt(i) == 'D' && input.charAt(i + 1) == 'K' && input.charAt(i + 2) == 'S' && input.charAt(i + 3) == 'H') {
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29766().solution();
    }
}
