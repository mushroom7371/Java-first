package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//치킨 두 마리 (...)
public class N14489 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstBankbook = Integer.parseInt(st.nextToken());
        int secondBankbook = Integer.parseInt(st.nextToken());
        int priceOfChicken = Integer.parseInt(br.readLine());

        int sum = firstBankbook + secondBankbook;
        int result = sum >= priceOfChicken * 2 ? sum - priceOfChicken * 2 : sum;

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14489().solution();
    }
}
