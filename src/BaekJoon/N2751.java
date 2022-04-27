package BaekJoon;

import java.io.*;
import java.util.Arrays;

//수 정렬하기2
public class N2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int [] numArr = new int[N];

        for(int i = 0; i < N; i++){
            numArr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        Arrays.sort(numArr);

        for(int i = 0; i < N; i++){
            bw.write(numArr[i] + "" + "\n");
        }

        bw.flush();
        bw.close();

    }
}
