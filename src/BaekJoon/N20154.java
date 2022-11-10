package BaekJoon;

import java.io.*;

//이 구역의 승자는 누구야?!
public class N20154 {
    //알파벳 관련 문제가 나오면 자꾸 이상하게 접근하는 경향이 있음... 배열로 처리하면 편함
    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder input = new StringBuilder(br.readLine());
        int[] alphabetStroke = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};  //알파벳 획수에 대응하는 배열을 초기에 선언
        int[] changeToNumber = new int[input.length()]; //입력 문자의 길이만큼의 배열 선언
        int sum = 0;

        for(int i = 0; i < changeToNumber.length; i++){ //획수로 치환
            changeToNumber[i] = alphabetStroke[input.charAt(i) - 'A'];
        }

        for(int i = 0; i < changeToNumber.length; i++){ //앞에서 부터 차례대로 더하고 10으로 나눈 나머지를 sum으로 초기화
            sum += changeToNumber[i];
            sum %= 10;
        }

        if(sum % 2 == 1){
            bw.write("I'm a winner!");
        }else{
            bw.write("You're the winner?");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N20154().solution();
    }
}
