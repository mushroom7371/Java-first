package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//주사위
public class N9295 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 1; i <= testCase; i++){
            st = new StringTokenizer(br.readLine());
            int firstDice = Integer.parseInt(st.nextToken());
            int secondDice = Integer.parseInt(st.nextToken());
            int sum = firstDice + secondDice;

            bw.write("Case " + i + ": " + sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9295().solution();
    }
}
