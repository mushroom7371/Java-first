package BaekJoon;

import java.io.*;

//Goodbye, Code Jam
public class N29738 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n > 4500 && n <= 30000) {
                bw.write("Case #" + i + ": Round 1\n");
            } else if (n > 1000) {
                bw.write("Case #" + i + ": Round 2\n");
            } else if (n > 25){
                bw.write("Case #" + i + ": Round 3\n");
            } else {
                bw.write("Case #" + i + ": World Finals\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29738().solution();
    }
}
