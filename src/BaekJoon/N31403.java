package BaekJoon;

import java.io.*;

//A + B - C
public class N31403 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int resultA = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
        int resultB = Integer.parseInt(a + b) - Integer.parseInt(c);

        bw.write(resultA + "\n" + resultB);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31403().solution();
    }
}
