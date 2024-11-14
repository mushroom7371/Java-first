package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//온데간데없을뿐더러
public class N31833 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer inputA = new StringTokenizer(br.readLine());
        StringTokenizer inputB = new StringTokenizer(br.readLine());
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < n; i++) {
            a.append(inputA.nextToken());
            b.append(inputB.nextToken());
        }

        long numberA = Long.parseLong(a.toString());
        long numberB = Long.parseLong(b.toString());

        bw.write(numberA < numberB ? numberA + "" : numberB + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31833().solution();
    }
}
