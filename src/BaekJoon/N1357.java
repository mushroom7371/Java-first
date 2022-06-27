package BaekJoon;

import java.io.*;

//뒤집힌 덧셈
public class N1357 {
    public static void main(String[] args) throws IOException {
        //귀찮아서 형변환을 계속 했다... static 메서드에서 로직 처리를 다 했어야 했는데 별로 좋은 코드는 아닌듯
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] numberArray = br.readLine().split(" ");   //주어진 숫자를 공백을 기준으로 나눠 String 배열에 담고
        int sum = Integer.parseInt(rev(numberArray[0])) + Integer.parseInt(rev(numberArray[1]));    //문자열을 뒤집은 결과를 int 타입으로 변환 후 더함
        int resultNumber = Integer.parseInt(rev(String.valueOf(sum)));  //그 더한 결과를 다시 String타입으로 바꿔 메서드를 통해 연산 후 또다시 int형으로...

        br.close();
        bw.write(resultNumber + "");    //<= 위의 resultNumber를 그냥 String 타입으로 넣어봤다가 숫자앞에 01 같은 애들 때문에 다시 int로 바꾼것
        bw.flush();
        bw.close();

    }

    static String rev(String number){
        String targetNum = "";

        for(int i = number.length() - 1; i >= 0; i--){  //맨 뒤의 문자 부터 0번지 까지 더해서 뒤집었다
            targetNum += number.charAt(i);
        }

        return targetNum;
    }
}
