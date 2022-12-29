package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//서버
public class N10409 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int work = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(st.nextToken());
        int [] workArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for(int i = 0; i < work; i++){
            sum += workArray[i];

            if(sum > time){
                bw.write(i + "");
                break;
            }

            if(i == work-1){
                bw.write(i+1 + "");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10409().solution();
    }
}
