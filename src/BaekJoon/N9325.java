package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//얼마?
public class N9325 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            int totalPrice = Integer.parseInt(br.readLine());   //처음 가격은 차량 가격으로 설정

            int options = Integer.parseInt(br.readLine());  //옵션의 개수

            for(int i = 0; i < options; i++){   //옵션 수와 가격을 곱하여 더함
                StringTokenizer st = new StringTokenizer(br.readLine());
                totalPrice += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }

            bw.write(totalPrice + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N9325().solution();
    }
}
