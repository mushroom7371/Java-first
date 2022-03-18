package BaekJoon;

import java.util.Scanner;

//단어 공부
public class N1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        sc.close();

        int [] count = new int[26]; //알파뱃 갯수만큼의 크기를 가지는 배열 선언

        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i) - 'A';  //해당 문자의 번지를 구하고,
            count[num]++;   //문자의 카운트를 증가 시킨다.
        }

        int max = 0;
        char answer = '?';
        for(int i = 0; i < count.length; i++){
            if(max < count[i]){ //제일 많이 카운트 된 숫자를 max로 설정
                max = count[i];
                answer = (char)(i+'A'); //해당 숫자를 알파벳 대문자로 바꿔 정답에 담는다.
            }else if(max == count[i]){  //제일 많이 카운트 된 숫자가 중복되면
                answer = '?';   //정답을 ?로 설정한다.
            }
        }

        System.out.println(answer);

    }
}
