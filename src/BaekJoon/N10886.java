package BaekJoon;

import java.io.*;

//0 = not cute / 1 = cute
public class N10886 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int[] isCuteArray = new int[2];

        for(int i = 0; i < testCase; i++){
            int index = Integer.parseInt(br.readLine());
            isCuteArray[index]++;
        }

        if(isCuteArray[1] > isCuteArray[0]){
            bw.write("Junhee is cute!");
        }else{
            bw.write("Junhee is not cute!");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N10886().solution();
    }
}
