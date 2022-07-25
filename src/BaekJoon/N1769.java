package BaekJoon;

import java.io.*;

//3의 배수
public class N1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String initialNumber = br.readLine();   //초기 숫자
        int count = 0;  //변환 횟수를 셀 변수

        while(initialNumber.length() > 1){  //초기 숫자가 한자리 숫자가 될때까지 변환 함수를 호출한다. 문자열이기에 길이로 판단
            initialNumber = changeEz(initialNumber);
            count++;
        }

        bw.write(count + "\n");

        if(Integer.parseInt(initialNumber) % 3 == 0){   //3의 배수면 YES 아니면 NO
            bw.write("YES");
        }else{
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    static String changeEz(String number) { //static으로 선언하여 클래스가 메모리에 적재될 때 생성되어 사용가능
        String result = number; //인자로 받은 값으로 String 설정
        int tempType = 0;   //임시로 담을 int형 변수

        for(int i = 0; i < result.length(); i++){   //문자열의 길이만큼 반복
            tempType += result.charAt(i) - '0'; //해당 번지의 문자에 0을 빼주어 숫자로 변환하고, 임시 변수에 저장
        }

        result = Integer.toString(tempType);    //다시 문자열로 바꾸어 반환
        return result;
    }
}
