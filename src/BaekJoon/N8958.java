package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//OX퀴즈
public class N8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); //각 자리의 점수 카운트를 저장할 StringBuilder 객체 생성
        int num = Integer.parseInt(br.readLine());  //테스트 케이스의 숫자를 저장
        String [] arry = new String[num];   //주어진 테스트 케이스의 갯수를 크기로 가지는 String 배열 생성

        for(int i = 0; i < num; i++){   //해당 번지에 입력으로 받은 OX 테스트 케이스를 저장한다.
            arry[i] = br.readLine();
        }

        for(int i = 0; i < num; i++){   //각 번지에 저장된 케이스의 점수를 계산할 반복
            int count = 0;  //해당 번지가 시작할때 점수와 합계가 초기화 된다.
            int sum = 0;

            for(int k = 0; k < arry[i].length(); k++){  //String 타입의 데이터를 저장하는 배열의 i번지에 저장된 String의 길이만큼 반복
                if(arry[i].charAt(k) == 'O'){   //해당 String의 k번째 문자가 o면 점수가 증가한다.
                    count++;
                }
                else{   //아니면 연속되지 않으므로 점수가 0이된다.
                    count = 0;
                }
                sum += count;   //점수를 합한다.
            }
            sb.append(sum).append('\n');    //다음 케이스로 넘어가기 전에 점수를 StringBuilder에 저장하고 넘어간다.
        }
        System.out.println(sb); //출력
    }
}
