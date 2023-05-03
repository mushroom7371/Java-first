package BaekJoon;

import java.io.*;

//선린인터넷고등학교 교가
public class N21964 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int stringLength = Integer.parseInt(br.readLine());
        String inputString = br.readLine();
        int index = stringLength - 5;

        for (int i = 0; i < 5; i++) {
            bw.write(inputString.charAt(index));
            index++;
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N21964().solution();
    }
}
