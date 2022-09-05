package BaekJoon;

import java.io.*;

//KMP는 왜 KMP일까?
public class N2902 {

    void solution()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String longName = br.readLine();
        String shortName = "";

        for(int i = 0; i < longName.length(); i++){
            char temp = longName.charAt(i);

            if(temp >= 'A' && temp <= 'Z'){
                shortName += temp;
            }
        }

        bw.write(shortName);
        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N2902().solution();
    }
}
