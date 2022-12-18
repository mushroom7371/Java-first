package BaekJoon;

import java.io.*;

//모음의 개수
public class N10987 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] wordArray = br.readLine().split("");
        int count = 0;

        for(int i = 0; i  < wordArray.length; i++){
            String temp = wordArray[i];
            if(temp.equals("a") || temp.equals("e") || temp.equals("i") || temp.equals("o") || temp.equals("u")){
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N10987().solution();
    }
}
