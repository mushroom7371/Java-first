package BaekJoon;

import java.io.*;

//Fridge of Your Dreams
public class N11104 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String binary = br.readLine();
            int decimal = Integer.parseInt(binary, 2);
            bw.write(decimal + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11104().solution();
    }
}
