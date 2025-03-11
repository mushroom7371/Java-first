package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//아 맞다 마늘
public class N32978 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfIngredients = Integer.parseInt(br.readLine());
        String[] firstIngredients = br.readLine().split(" ");
        String[] secondIngredients = br.readLine().split(" ");

        Map<String, Integer> ingredientsMap = new HashMap<>();
        for (int i = 0; i < numberOfIngredients; i++) {
            ingredientsMap.put(firstIngredients[i], 0);
        }

        for (int i = 0; i < numberOfIngredients - 1 ; i++) {
            ingredientsMap.put(secondIngredients[i], 1);
        }

        for (Map.Entry<String, Integer> entry : ingredientsMap.entrySet()) {
            if (entry.getValue() == 0) {
                bw.write(entry.getKey());
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32978().solution();
    }
}
