package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//공 넣기
public class N10810 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfBasket = Integer.parseInt(st.nextToken());
        int numberOfTimes = Integer.parseInt(st.nextToken());
        int [] basketArray = new int[numberOfBasket];

        for (int i = 0; i < numberOfTimes; i++) {
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken()) - 1;
            int endIndex = Integer.parseInt(st.nextToken()) - 1;
            int ballNumber = Integer.parseInt(st.nextToken());

            for (int j = startIndex; j <= endIndex; j++) {
                basketArray[j] = ballNumber;
            }
        }

        for (int i = 0; i < basketArray.length; i++) {
            bw.write(basketArray[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10810().solution();
    }
}
