package BaekJoon;

import java.io.*;

//KOREA 문자열 만들기
public class N30700 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] korea = {'K', 'O', 'R', 'E', 'A'};
        String input = br.readLine();

        int index = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == korea[index]) {
                index++;
                count++;
            }
            if (index == 5) {
                index = 0;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30700().solution();
    }
}
