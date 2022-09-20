package BaekJoon;

import java.io.*;

//애너그램 거리
public class N3778 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 1; i <= testCase; i++){
            String firstStr = br.readLine();    //첫번째 문자열
            String secondStr = br.readLine();   //두번째 문자열

            int[] firstArray = new int[26];
            int[] secondArray = new int[26];
            int anagramDistance = 0;

            for(int j = 0; j < firstStr.length(); j++){ //첫번째 문자열의 알파벳을 카운팅
                firstArray[firstStr.charAt(j) - 'a']++;
            }

            for(int j = 0; j < secondStr.length(); j++){    //두번재 문자열의 알파벳을 카운팅
                secondArray[secondStr.charAt(j) - 'a']++;
            }

            for(int j = 0; j < 26; j++){
                if(firstArray[j] > secondArray[j]){ //많이 나온 카운팅에서 적제나온 카운팅을 빼면 거리가 된다.
                    anagramDistance += firstArray[j] - secondArray[j];
                }else if(firstArray[j] < secondArray[j]){
                    anagramDistance += secondArray[j] - firstArray[j];
                }
            }

            bw.write("Case #" + i + ": " + anagramDistance + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N3778().solution();
    }
}
