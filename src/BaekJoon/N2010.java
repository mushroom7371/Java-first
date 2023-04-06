package BaekJoon;

import java.io.*;

//플러그
public class N2010 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfMultiPlug = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < numberOfMultiPlug; i++) {
            result += Integer.parseInt(br.readLine());
        }

        result -= numberOfMultiPlug -1;

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2010().solution();
    }
}
