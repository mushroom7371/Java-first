package BaekJoon;

import java.io.*;

//치킨 쿠폰
public class N1673 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int numberOfCoupon = Integer.parseInt(input.split(" ")[0]);
            int stampOfOneCoupon = Integer.parseInt(input.split(" ")[1]);
            int result = numberOfCoupon;

            while (numberOfCoupon >= stampOfOneCoupon) {
                result += numberOfCoupon / stampOfOneCoupon;
                numberOfCoupon = numberOfCoupon / stampOfOneCoupon + numberOfCoupon % stampOfOneCoupon;
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1673().solution();
    }
}
