package BaekJoon;

import java.io.*;

//방 번호
public class N1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] numberArray = new int[10];   //0~9까지의 숫자가 방 호수에 몇번 나왔는지 카운팅 할 배열
        String targetNumber = br.readLine();    //주어진 방 호수

        for(int i = 0; i < targetNumber.length(); i++){ //String으로 받았기에 문자열의 길이만큼 반복
            int number = targetNumber.charAt(i) - '0';  //해당 번지의 문자로 된 숫자를 int 타입으로 저장
            numberArray[number]++;  //해당 숫자에 해당하는 배열 번지의 카운팅 증가
        }

        int overlap = numberArray[6] + numberArray[9];  //6과 9는 한 플라스틱 숫자 세트로 재활용 가능하기에 더함(6과 9는 같은 숫자로 취급함)

        if(overlap % 2 == 0){   //짝수개라면 2로 나누고
            overlap = overlap / 2;
        }else{  //홀수개라면 2로 나눠서 1을 더함 (int 타입은 나눴을 때 소수점을 버리므로)
            overlap = (overlap / 2) + 1;
        }

        int numberOfOtherNumber = 0;    //6과 9를 제외한 숫자들 중 제일 많이 나온 숫자의 개수를 저장할 변수

        for(int i = 0; i < numberArray.length; i++){
            if(i != 6 && i != 9){   //6과 9가 아니면
                if(numberArray[i] > numberOfOtherNumber){   //제일 많이 나온 숫자의 개수를 저장
                    numberOfOtherNumber = numberArray[i];
                }
            }
        }

        if(overlap > numberOfOtherNumber){  //6과 9를 재활용 해서 필요한 세트의 개수가 나머지 숫자중 많이 나온 개수보다 크다면
            bw.write(overlap + "");
        }else{
            bw.write(numberOfOtherNumber + "");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
