package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//특정 대문자를 소문자로 바꾸기
public class N26040 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            String target = st.nextToken();
            input = input.replace(target, target.toLowerCase());
        }

        bw.write(input);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N26040().solution();
    }
}
