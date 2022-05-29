package BaekJoon;

import java.io.*;

//다리 놓기
public class N1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            String [] riverSite = br.readLine().split(" ");
            long westSite = Long.parseLong(riverSite[0]);
            long eastSite = Long.parseLong(riverSite[1]);
            long result = 1;

            for(int j = 0; j < westSite; j++){  //컴비네이션을 이용, 곱하자 마자 나눠 준다면 자료형의 범위를 넘지 않는다.
                result *= (eastSite - j);   // ex) 5 * (5-1) * (5-1-1)
                result /= (j + 1);          // ex) 1 * (1+1) * (1+1+1)
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
