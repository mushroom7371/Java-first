package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//뜨거운 붕어빵
public class N11945 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        for (int i = 0; i < row; i++) {
            String[] inputArray = br.readLine().split("");

            for (int j = 0; j < column; j++) {
                bw.write(inputArray[column - j - 1]);
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11945().solution();
    }
}
