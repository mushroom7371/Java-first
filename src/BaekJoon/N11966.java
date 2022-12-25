package BaekJoon;

import java.io.*;

//2의 제곱인가?
public class N11966 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long inputNumber = Long.parseLong(br.readLine());
        String[] binaryArray = Long.toBinaryString(inputNumber).split("");
        binaryArray[0] = "0";
        boolean isPowerOfTwo = true;

        for(int i = 0; i < binaryArray.length; i++){
            if(binaryArray[i].equals("1")){
                isPowerOfTwo = false;
                break;
            }
        }

        if(isPowerOfTwo){
            bw.write("1");
        }else{
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N11966().solution();
    }
}
