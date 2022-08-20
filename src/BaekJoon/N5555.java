package BaekJoon;

import java.io.*;

//반지
public class N5555 {

    void solution()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String targetStr = br.readLine();
        int testCase = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < testCase; i++){
            String ringStr = br.readLine();

            for(int j = 0; j < 10; j++){    //반지에 쓰여진 문자가 10개이므로 10번 반복
                ringStr = ringStr + ringStr.charAt(0);  //반지에 쓰여진 문자의 첫번째 글자를 맨 뒤로 보내고
                ringStr = ringStr.substring(1, 11); //subString() 메서드를 이용하여 두번재 문자부터 마지막 문자까지로 재설정함
                //=> 첫번째 글자를 맨 뒤로 옮기는 것과 동일하게 되며 subString() 사용시 주의점은 2번째 인자값 전까지 가른다는 것 즉 11번지 전인 1~10번지까지가 된다.

                if(ringStr.contains(targetStr)){    //반복중 하나라도 targetStr를 포함한다면 카운팅 후 반복 종료 다음 케이스로 넘어감
                    count++;
                    break;
                }
            }
        }

        bw.write(count +"");
        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N5555().solution();
    }
}
