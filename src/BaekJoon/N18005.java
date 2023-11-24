package BaekJoon;

import java.io.*;

//Even or Odd?
public class N18005 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());

        if (number % 2 == 0) {
            if (number % 4 == 0) {
                bw.write("2");
            } else {
                bw.write("1");
            }
        } else {
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N18005().solution();
    }
}
