package BaekJoon;

import java.io.*;

//팰린드롬수
public class N1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String targetNumber = br.readLine();
            boolean isSameNumber = true;    //대칭으로 이뤄진 수가 같은지 확인 할 논리형 변수

            if(targetNumber.equals("0")){   //EOF 입력이 0으로 주어지면 반복을 종료한다.
                break;
            }

            for(int i = 0; i < targetNumber.length()/2; i++){   //대칭되는 숫자를 판단할 것이므로 2로 나눈 길이만큼 반복
                if(targetNumber.charAt(i) != targetNumber.charAt(targetNumber.length() - 1 - i)){   //대칭되는 숫자가 같이 않다면
                    isSameNumber = false;   //논리형 변수를 false로 설정
                }
            }

            if(isSameNumber){   //대칭되는 숫자가 모두 같으면
                bw.write("yes" + "\n");
            }else{  //아니라면
                bw.write("no" + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
