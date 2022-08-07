package BaekJoon;

import java.io.*;

//숫자 놀이
public class N2145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String number = br.readLine();

            if(number.equals("0")){ //EOF.. 입력이 0으로 들어오면 while 종료
                break;
            }

            bw.write(makeOneNumber(number) + "\n"); //규칙을 적용해서 나온 숫자를 버퍼에 기록

        }

        br.close();
        bw.flush();
        bw.close();

    }

    static String makeOneNumber(String number){ //static 메서드로 선언하여 클래스가 메모리에 올라갈때 생성되어 사용가능
        String target = number;
        int result = 0;

        while(target.length() > 1){ //문자열을 기준으로 반복을 돌릴 예정. 길이가 1이면 반복을 종료
            for(int i = 0; i < target.length(); i++){   //target의 길이만큼 반복
                result += Character.getNumericValue(target.charAt(i));  //해당 번지의 문자를 숫자로 변환하고 int 변수에 더한다.
            }

            target = Integer.toString(result);  //참조변수 target이 문자열로 바뀐 result를 가리키도록 함
            result = 0; //다시 0으로 설정
        }

        return target;
    }
}
