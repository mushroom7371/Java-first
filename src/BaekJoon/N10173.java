package BaekJoon;

import java.io.*;

//니모를 찾아서
public class N10173 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while (!(input = br.readLine()).equals("EOI")) {
            if (input.toLowerCase().contains("nemo")) {
                bw.write("Found\n");
            } else {
                bw.write("Missing\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10173().solution();
    }
}
