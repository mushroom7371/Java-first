package BaekJoon;

import java.io.*;
import java.util.*;

//Yangjojang of The Year
public class N11557 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            int numberOfUniversity = Integer.parseInt(br.readLine());
            int maxAlcoholicDrink = 0;
            Map<Integer, String> universityInfoMap = new HashMap<>();

            for (int i = 0; i < numberOfUniversity; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String universityName = st.nextToken();
                int alcoholicDrink = Integer.parseInt(st.nextToken());

                if (maxAlcoholicDrink < alcoholicDrink) {
                    maxAlcoholicDrink = alcoholicDrink;
                }

                universityInfoMap.put(alcoholicDrink, universityName);
            }

            bw.write(universityInfoMap.get(maxAlcoholicDrink) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11557().solution();
    }
}
