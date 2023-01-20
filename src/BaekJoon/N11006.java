package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//남욱이의 닭장
public class N11006 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            int numberOfChickenLegs = Integer.parseInt(st.nextToken());
            int numberOfChicken = Integer.parseInt(st.nextToken());
            int numberOfNoLegsChicken = (numberOfChicken*2 - numberOfChickenLegs);
            int numberOfNormalChicken = numberOfChicken - numberOfNoLegsChicken;

            bw.write(numberOfNoLegsChicken + " " + numberOfNormalChicken + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11006().solution();
    }
}
