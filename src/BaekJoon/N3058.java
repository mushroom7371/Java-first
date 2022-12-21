package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//짝수를 찾아라
public class N3058 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while(testCase --> 0){
            st = new StringTokenizer(br.readLine());
            int min = 100;
            int sum = 0;

            while(st.hasMoreTokens()){
                int number = Integer.parseInt(st.nextToken());

                if(number % 2 == 0){
                    sum += number;

                    if(min >= number){
                        min = number;
                    }
                }
            }

            bw.write(sum + " " + min + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N3058().solution();
    }
}
