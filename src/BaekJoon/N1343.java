package BaekJoon;

import java.io.*;

//폴리오미노
public class N1343 {
    public static void main(String[] args) throws IOException {
        //주어진 X가 짝수로 주어지므로 이를 활용해서 문제를 풀까 생각했지만 replaceAll 이라는 메서드가 더 간편할 것 같았다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        input = input.replaceAll("XXXX", "AAAA");
        input = input.replaceAll("XX", "BB");

        if(input.contains("X")){
            bw.write("-1");
        }else{
            bw.write(input);
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
