package BaekJoon;

import java.io.*;

//회전
public class N23813 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int mult = 1;
        for (int i = 0; i < str.length()-1; i++) {
            mult *= 10;
        }
        int n = Integer.parseInt(str);

        long sum = 0;
        int next = n;
        do {
            sum += next;
            next = next/10 + next%10*mult;
        } while (next != n);

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23813().solution();
    }
}
