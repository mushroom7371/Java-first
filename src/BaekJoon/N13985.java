package BaekJoon;

import java.io.*;

//Equality
public class N13985 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] equation = br.readLine().split(" ");
        int result = Integer.parseInt(equation[0]) + Integer.parseInt(equation[2]);

        if (result == Integer.parseInt(equation[4])) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13985().solution();
    }
}
