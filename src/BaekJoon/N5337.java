package BaekJoon;

import java.io.*;

//웰컴
public class N5337 {
    void solution() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(".  .   .\n" +
                "|  | _ | _. _ ._ _  _\n" +
                "|/\\|(/.|(_.(_)[ | )(/.");
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        new N5337().solution();
    }
}
