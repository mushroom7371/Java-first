package BaekJoon;

import java.io.*;

//수 이어 쓰기 3
public class N2154 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int targetNumber = Integer.parseInt(br.readLine());

        StringBuilder numberString = new StringBuilder();
        for (int i = 1; i <= targetNumber; i++) {
            numberString.append(i);
        }

        int index = numberString.indexOf(String.valueOf(targetNumber)) + 1;
        bw.write(index + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2154().solution();
    }
}
