package BaekJoon;

import java.io.*;
import java.util.Map;

//Chili Peppers
public class N28249 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> priceMap = Map.of(
                "Poblano", 1500,
                "Mirasol", 6000,
                "Serrano", 15500,
                "Cayenne", 40000,
                "Thai", 75000,
                "Habanero", 125000
        );

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += priceMap.get(br.readLine());
        }

        bw.write(total + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28249().solution();
    }
}
