package BaekJoon;

import java.io.*;

//창문 닫기
public class N13909 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 1; i*i <= testCase; i++){
            count++;
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N13909().solution();
    }
}
