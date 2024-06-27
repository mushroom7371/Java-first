package BaekJoon;

import java.io.*;

//특별한 학교 이름
public class N27889 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        if (input.equals("NLCS")) {
            bw.write("North London Collegiate School");
        } else if (input.equals("BHA")) {
            bw.write("Branksome Hall Asia");
        } else if (input.equals("KIS")) {
            bw.write("Korea International School");
        } else {
            bw.write("St. Johnsbury Academy");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27889().solution();
    }
}
