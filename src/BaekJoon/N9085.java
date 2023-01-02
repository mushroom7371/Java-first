package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//더하기
public class N9085 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            int numberOfInput = Integer.parseInt(br.readLine());
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 0; i < numberOfInput; i++){
                sum += Integer.parseInt(st.nextToken());
            }

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9085().solution();
    }
}
