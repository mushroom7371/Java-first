package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//5와 6의 차이
public class N2864 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String inputA = st.nextToken();
        String inputB = st.nextToken();

        int min = Integer.parseInt(inputA.replaceAll("6", "5")) + Integer.parseInt(inputB.replaceAll("6", "5"));
        int max = Integer.parseInt(inputA.replaceAll("5", "6")) + Integer.parseInt(inputB.replaceAll("5", "6"));

        bw.write(min + " " + max);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2864().solution();
    }
}
