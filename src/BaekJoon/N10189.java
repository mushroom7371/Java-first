package BaekJoon;

import java.io.*;

//hook
public class N10189 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("#  # #### #### #  #\n" +
                "#### #  # #  # # #\n" +
                "#### #  # #  # # #\n" +
                "#  # #### #### #  #");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10189().solution();
    }
}
