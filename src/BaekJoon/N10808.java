package BaekJoon;

import java.io.*;

//알파벳 개수(스트레스 해소용)
public class N10808 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] alphabetCountArray = new int[26];

        for(int i = 0; i < str.length(); i++){
            alphabetCountArray[str.charAt(i) - 'a']++;
        }

        for(int i = 0; i < alphabetCountArray.length; i++){
            if(i == alphabetCountArray.length-1){
                bw.write(alphabetCountArray[i] + "");
            }else{
                bw.write(alphabetCountArray[i] + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N10808().solution();
    }
}
