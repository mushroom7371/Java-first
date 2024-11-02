package BaekJoon;

import java.io.*;

//Serca
public class N26766 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        String heart = " @@@   @@@ \n" +
                "@   @ @   @\n" +
                "@    @    @\n" +
                "@         @\n" +
                " @       @ \n" +
                "  @     @  \n" +
                "   @   @   \n" +
                "    @ @    \n" +
                "     @     \n";

        for (int i = 0; i < a; i++) {
            bw.write(heart);
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N26766().solution();
    }
}
