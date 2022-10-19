package BaekJoon;

import java.io.*;

//도미노
public class N2921 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int dominoSetSize = Integer.parseInt(br.readLine());
        int[] dominoSet = new int[dominoSetSize + 1];
        int result = 0;

        for(int i = 1; i < dominoSet.length; i++){  //단순히 규칙을 식으로 옮겼다.
            dominoSet[i] = (i * (i +1)) + (i * (i + 1)/2);
        }

        for(int i = 1; i < dominoSet.length; i++){
            result += dominoSet[i];
        }

        bw.write(result + "");
        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N2921().solution();
    }
}
