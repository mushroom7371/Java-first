package BaekJoon;

import java.io.*;
import java.util.*;

//애너그램 그룹
public class N6566 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        Map<String, Integer> anagramMap = new HashMap<>();
        int countValue = 0;

        while((str = br.readLine()) != null && !str.isEmpty()){
            countValue++;
            anagramMap.put(str, countValue);
        }

        for(String key : anagramMap.keySet()){
            int[] alphabetCountArray = new int[26];

            for(int i = 0 ; i < key.length(); i++){
                alphabetCountArray[key.charAt(i) - 'a']++;
            }

            for(String tempKey : anagramMap.keySet()){
                int[] tempCountArray = new int[26];
                boolean isAnagram = true;

                if(!key.equals(tempKey)){
                    for(int j = 0; j < tempKey.length(); j++){
                        tempCountArray[tempKey.charAt(j) - 'a']++;
                    }

                    for(int j = 0; j < 26; j++){
                        if(!(alphabetCountArray[j] == tempCountArray[j])){
                            isAnagram = false;
                        }

                        if(!isAnagram){
                            break;
                        }
                    }
                }

                if(isAnagram){
                    anagramMap.put(tempKey, anagramMap.get(key));
                }
            }
        }

    }

    public static void main(String[] args) throws IOException{
        new N6566().solution();
    }
}
