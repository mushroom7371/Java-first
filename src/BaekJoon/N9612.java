package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//Maximum Word Frequency
public class N9612 {

    void soltuion() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Map<String, Integer> wordMap = new HashMap<>();
        int max = 0;

        while(testCase --> 0){
            String word = br.readLine();

            if(wordMap.containsKey(word)){
                wordMap.put(word, wordMap.get(word) + 1);
            }else{
                wordMap.put(word, 1);
            }

            if(max <= wordMap.get(word)){
                max = wordMap.get(word);
            }

        }

        for(String key : wordMap.keySet()){
            if(wordMap.get(key) == max){
                bw.write(key + " " + max);
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N9612().soltuion();
    }
}
