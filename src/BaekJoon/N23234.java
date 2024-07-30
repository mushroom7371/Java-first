package BaekJoon;

import java.io.*;

//The World Responds
public class N23234 {

    void solution() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("The world says hello!");

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23234().solution();
    }
}
