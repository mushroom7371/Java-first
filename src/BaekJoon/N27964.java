package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

//콰트로치즈피자
public class N27964 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int kindOfTopping = Integer.parseInt(br.readLine());
        String[] toppingArray = br.readLine().split(" ");
        Set<String> toppingSet = new HashSet<>();

        for (int i = 0; i < kindOfTopping; i++) {
            String topping = toppingArray[i];
            if (topping.length() >= 6) {
                String temp = topping.substring(topping.length() - 6);
                if (temp.equals("Cheese")) {
                    toppingSet.add(toppingArray[i]);
                }
            }
        }

        if (toppingSet.size() >= 4) {
            bw.write("yummy");
        } else {
            bw.write("sad");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27964().solution();
    }
}
