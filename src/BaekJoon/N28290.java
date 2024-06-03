package BaekJoon;

import java.io.*;

//안밖? 밖안? 계단? 역계단?
public class N28290 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        if (input.equals("fdsajkl;") || input.equals("jkl;fdsa")) {
            bw.write("in-out");
        } else if (input.equals("asdf;lkj") || input.equals(";lkjasdf")) {
            bw.write("out-in");
        } else if (input.equals("asdfjkl;")) {
            bw.write("stairs");
        } else if (input.equals(";lkjfdsa")) {
            bw.write("reverse");
        } else {
            bw.write("molu");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28290().solution();
    }
}
