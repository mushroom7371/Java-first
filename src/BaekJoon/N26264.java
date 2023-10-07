package BaekJoon;

import java.io.*;

//빅데이터? 정보보호!
public class N26264 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfStudent = Integer.parseInt(br.readLine());
        String answer = br.readLine();

        int securityCount = 0;
        int bigDataCount = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == 'c') {
                securityCount++;
            }
            if (answer.charAt(i) == 'b') {
                bigDataCount++;
            }
        }

        if (securityCount > bigDataCount) {
            bw.write("security!");
        } else if (securityCount < bigDataCount) {
            bw.write("bigdata?");
        } else {
            bw.write("bigdata? security!");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N26264().solution();
    }
}
