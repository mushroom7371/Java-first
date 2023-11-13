package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

//동일한 단어 그룹화하기
public class N16499 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfWord = Integer.parseInt(br.readLine());
        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < numberOfWord; i++) {
            String word = br.readLine();
            int[] alphabetArray = new int[26];
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                alphabetArray[word.charAt(j) - 'a']++;
            }

            for (int j = 0; j < alphabetArray.length; j++) {
                if (alphabetArray[j] > 0) {
                    String temp = (char) (j + 'a') + "" + alphabetArray[j];
                    sb.append(temp);
                }
            }

            wordSet.add(sb.toString());
        }

        bw.write(wordSet.size() + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16499().solution();
    }
}
