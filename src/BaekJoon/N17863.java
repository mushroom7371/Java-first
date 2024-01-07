package BaekJoon;

import java.io.*;

//FYI
public class N17863 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        if (input.substring(0, 3).equals("555")) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17863().solution();
    }
}
