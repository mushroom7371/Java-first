package BaekJoon;

import java.io.*;

//모음의 개수
public class N1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String inputStr = br.readLine();
            int count = 0;

            if(inputStr.equals("#")){
                break;
            }

            String lowerStr = inputStr.toLowerCase();   //문자열을 소문자로 변환

            for(int i = 0; i < lowerStr.length(); i++){
                char temp = lowerStr.charAt(i); //i번지의 데이터(문자) 저장
                if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){    //모음이라면
                    count++;
                }
            }

            bw.write(count + "\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }
}
