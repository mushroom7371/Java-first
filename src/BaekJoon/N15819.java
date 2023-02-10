package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//너의 핸들은
public class N15819 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCase = Integer.parseInt(st.nextToken());
        int targetIndex = Integer.parseInt(st.nextToken());
        String [] handleArray = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            handleArray[i] = br.readLine();
        }

        Arrays.sort(handleArray);
        bw.write(handleArray[targetIndex-1]);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15819().solution();
    }
}
