package BaekJoon;

import java.io.*;

//SciComLove (2024)
public class N31746 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = "SciComLove";
        String reverseStr = "evoLmoCicS";

        if (n % 2 == 0) {
            bw.write(str);
        } else {
            bw.write(reverseStr);
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31746().solution();
    }
}
