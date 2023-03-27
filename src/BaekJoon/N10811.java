package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//바구니 뒤집기
public class N10811 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketSize = Integer.parseInt(st.nextToken());
        int testCase = Integer.parseInt(st.nextToken());
        int [] basketArray = new int[basketSize];

        for (int i = 0; i < basketSize; i++) {
            basketArray[i] = i+1;
        }

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken()) - 1;
            int endIndex = Integer.parseInt(st.nextToken()) - 1;

            for (int j = 0; j < (endIndex-startIndex+1)/2; j++) {
                int temp = basketArray[startIndex+j];
                basketArray[startIndex+j] = basketArray[endIndex-j];
                basketArray[endIndex-j] = temp;
            }
        }

        for (int i = 0; i < basketSize; i++) {
            bw.write(basketArray[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10811().solution();
    }
}
