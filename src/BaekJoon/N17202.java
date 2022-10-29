package BaekJoon;

import java.io.*;

//핸드폰 번호 궁합
public class N17202 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String numberA = br.readLine(); //A의 번호
        String numberB = br.readLine(); //B의 번호
        StringBuilder result = new StringBuilder(); //궁합이 담길 StringBuilder

        for(int i = 0; i < numberA.length(); i++){  //A와 B의 번호를 번갈아가면서 저장
            result.append(numberA.charAt(i));
            result.append(numberB.charAt(i));
        }

        while(result.length() > 2){ //궁합이 담긴 StringBuiler의 길이가 2보다 클때 까지 반복
            StringBuilder tempNumber = new StringBuilder(); //임시 궁합을 가리킬 변수

            for(int i = 0; i < result.length() - 1; i++){   //두 숫자씩 비교할 것이므로 길이 -1
                int temp = Integer.parseInt(String.valueOf(result.charAt(i))) + Integer.parseInt(String.valueOf(result.charAt(i+1)));
                //i와 i+1 인덱스를 int형으로 더하여 줌
                tempNumber.append(temp % 10);   //나머지 연산자를 통해 일의자리 숫자를 임시 변수가 가리키도록 함
            }

            result = tempNumber;    //참조변수 result가 임시 궁합을 가리키는 변수를 가리키도록 함
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N17202().solution();
    }
}
