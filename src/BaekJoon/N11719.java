package BaekJoon;

import java.io.*;

//그대로 출력하기 2
public class N11719 {

    void solution()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        
        while((input = br.readLine()) != null){
            //인텔리제이에서 eof 방식이 백준과 상이함... 지금 코드는 인텔리제이에서는 안끝나는점 참고
            //while 조건에 && !input.isEmpty() 를 붙히면 EOF가 되지만, 문제에서 빈줄로 주어진 경우에 멈추므로 생각할 필요가 있음
            bw.write(input + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N11719().solution();
    }
}
