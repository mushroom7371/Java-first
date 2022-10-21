package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//0의 개수
public class N11170 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());   //시작 숫자
            int end = Integer.parseInt(st.nextToken()); //끝 숫자
            int numberOfZero = 0;   //0의 개수

            for(int i = start; i <= end; i++){
                String number = String.valueOf(i);  //자리마다 0이 있는지 판단 할 예정으로 int -> String으로 변환

                for(int j = 0; j < number.length(); j++){   //j번지의 문자가 0이라면 개수가 증가한다.
                    if(number.charAt(j) == '0'){
                        numberOfZero++;
                    }
                }
            }

            bw.write(numberOfZero + "\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N11170().solution();
    }
}
