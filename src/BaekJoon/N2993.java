package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//세 부분
public class N2993 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        List<String> words = new ArrayList<>();
        StringBuilder sb;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < word.length(); j++) {
                for (int k = j+1; k < word.length(); k++) {
                    String result = "";
                    sb = new StringBuilder(word.substring(0, j));
                    result += sb.reverse().toString();
                    sb = new StringBuilder(word.substring(j, k));
                    result += sb.reverse().toString();
                    sb = new StringBuilder(word.substring(k));
                    result += sb.reverse().toString();
                    words.add(result);
                }
            }
        }

        Collections.sort(words);
        bw.write(words.get(0));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2993().solution();
    }
}
