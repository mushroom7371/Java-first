package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//삼각 김밥
public class N2783 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double priceOfKimbob = Double.parseDouble(st.nextToken());
        double gram = Double.parseDouble(st.nextToken());
        double price = (priceOfKimbob/gram)*1000;

        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            double tempPriceOfKimbob = Double.parseDouble(st.nextToken());
            double tempGram = Double.parseDouble(st.nextToken());
            double tempPrice = (tempPriceOfKimbob/tempGram)*1000;

            if(price >= tempPrice){
                price = tempPrice;
            }
        }

        bw.write(String.format("%.2f", price));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2783().solution();
    }
}
