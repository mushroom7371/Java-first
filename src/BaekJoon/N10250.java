package BaekJoon;

import java.io.*;

//ACM 호텔
public class N10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String [] hwn;
        int h = 0;  //층 수
        int w = 0;  //각 층의 방 수
        int n = 0;  //n번째 고객

        for(int i = 0; i < testCase; i++){
            //입력 된 숫자를 나눠 각 변수에 할당
            hwn = br.readLine().split(" ");
            h = Integer.parseInt(hwn[0]);
            w = Integer.parseInt(hwn[1]);
            n = Integer.parseInt(hwn[2]);

            //n을 h로 나눈 나머지가 층수가 된다. 다만 나눠 떨어지는 경우를 분기 처리 해야된다.
            if(n % h == 0){ //나눠 떨어진다면 h가 배정받는 층이고, 떨어진 거리는 몫이 된다.
                bw.write((h * 100) + (n / h) + "" + "\n");
            }else{
                bw.write(((n % h) * 100) + ((n / h) + 1) + "" + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
