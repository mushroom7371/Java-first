package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//팰린드로미터
public class N4096 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true){    //반복 시행을 알수 없으므로 항상 반복
            st = new StringTokenizer(br.readLine());
            String distance = st.nextToken();   //입력받은 초기 거리를 문자열로 저장
            int count = 0;  //주행 거리 카운트 변수
            boolean isPalindrome = false;   //팰린드로미터 판단 변수

            if(distance.equals("0")){   //마지막 입력이 0으로 온다면 반복 종료
                break;
            }

            while(!isPalindrome){   //팰린드로미터가 아닌 경우 반복
                int stringLength = distance.length();   //거리를 문자열로 받았기에 길이를 참고 할 예정으로 변수로 빼두었다.

                for(int i = 0; i < stringLength/2; i++){    //숫자의 대칭을 확인할 예정이므로 문자열의 절반까지 반복
                    if (distance.charAt(i) == distance.charAt(stringLength -1 - i)) {   //i를 가지고 핸들링, 앞 뒤의 대칭 인덱스의 문자가 같다면
                        if(i == stringLength/2 - 1){    //또한 반복 인덱스가 절반까지 도달 했다면
                            bw.write(count + "\n"); //팰린드로미터므로 카운트를 버퍼에 기록
                            isPalindrome = true;    //팰린드로미터 판단 변수를 true로 변경
                            break;  //for문 종료
                        }
                    }else{  //팰린드로미터가 아니라면
                        distance = String.valueOf(Integer.parseInt(distance) + 1);  //문자열 거리를 int형으로 변환 하여 1 증가 시키고

                        while(distance.length() != stringLength){   //문자열 거리의 길이가 될때 까지 반복(int형은 앞에 0을 표현할 수 없으므로)
                            distance = "0" + distance;  //앞자리에 0을 추가함
                        }

                        count++;    //주행거리 카운트를 증가시키고
                        break;  //for문 종료, 여기서 팰린드로미터가 아니므로 다시 while 반복을 실시한다.
                    }
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N4096().solution();
    }
}
