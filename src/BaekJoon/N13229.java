package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Selection Sum
public class N13229 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int originArrayLength = Integer.parseInt(br.readLine());
        int[] originArray = new int[originArrayLength];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < originArrayLength; i++){
            originArray[i] = Integer.parseInt(st.nextToken());
        }

        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken());
            int endIndex = Integer.parseInt(st.nextToken());
            int sum = 0;

            for(int i = startIndex; i <= endIndex; i++){
                sum += originArray[i];
            }

            bw.write(sum + "\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N13229().solution();
    }
}
