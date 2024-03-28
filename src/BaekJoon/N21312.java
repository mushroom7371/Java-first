package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//홀짝 칵테일
public class N21312 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cocktailA = Integer.parseInt(st.nextToken());
        int cocktailB = Integer.parseInt(st.nextToken());
        int cocktailC = Integer.parseInt(st.nextToken());

        long result = 0;
        long[] cocktails = {
                cocktailA, cocktailB, cocktailC,
                cocktailA * cocktailB, cocktailB * cocktailC, cocktailC * cocktailA, cocktailA * cocktailB * cocktailC
        };

        for (int i = 0; i < cocktails.length; i++) {
            if (cocktails[i] % 2 == 1) {
                result = Math.max(result, cocktails[i]);
            }
        }

        if (result == 0) {
            result = cocktailA * cocktailB * cocktailC;
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N21312().solution();
    }
}
