package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//이름궁합 테스트
public class N17269 {
    //N17202 핸드폰 번호 궁합 과 똑같이 짠 로직, 다만 문자를 숫자로 변환하는 메서드가 추가 되었다. 스위치 문은 다중적용이 안되서 if로 함 ㅠㅠ    

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lengthOfNameA = Integer.parseInt(st.nextToken());
        int lengthOfNameB = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String nameA = st.nextToken();
        String nameB = st.nextToken();

        StringBuilder result = new StringBuilder();

        if(lengthOfNameA > lengthOfNameB){
            for(int i = 0; i < lengthOfNameB; i++){
                result.append(changeNumber(nameA.charAt(i)));
                result.append(changeNumber(nameB.charAt(i)));
            }

            for(int i = lengthOfNameB; i < lengthOfNameA; i++){
                result.append(changeNumber(nameA.charAt(i)));
            }
        }else{
            for(int i = 0; i < lengthOfNameA; i++){
                result.append(changeNumber(nameA.charAt(i)));
                result.append(changeNumber(nameB.charAt(i)));
            }

            for(int i = lengthOfNameA; i < lengthOfNameB; i++){
                result.append(changeNumber(nameB.charAt(i)));
            }
        }

        while(result.length() > 2){
            StringBuilder tempNumber = new StringBuilder();

            for(int i = 0; i < result.length() - 1; i++){
                int temp = Integer.parseInt(String.valueOf(result.charAt(i))) + Integer.parseInt(String.valueOf(result.charAt(i + 1)));
                tempNumber.append(temp % 10);
            }

            result = tempNumber;
        }

        int answer = Integer.parseInt(String.valueOf(result));

        bw.write(answer + "%");

        br.close();
        bw.flush();
        bw.close();

    }

    char changeNumber(char a){
        String b = String.valueOf(a);
        char result = ' ';

        if(b.equals("E")){
            result = '4';
        }else if (b.equals("A") || b.equals("F") || b.equals("H") || b.equals("K") || b.equals("M")){
            result = '3';
        }else if (b.equals("B") || b.equals("D") || b.equals("N") || b.equals("P") || b.equals("Q")|| b.equals("R") || b.equals("T") || b.equals("X") || b.equals("Y")){
            result = '2';
        }else{
            result = '1';
        }

//        switch (a){
//            case 'C', 'G', 'I', 'J', 'L', 'O', 'S', 'U', 'V', 'W', 'Z' :
//                result = '1';
//                break;
//            case 'B', 'D', 'N', 'P', 'Q', 'R', 'T', 'X', 'Y' :
//                result = '2';
//                break;
//            case 'A', 'F', 'H', 'K', 'M' :
//                result = '3';
//                break;
//            case 'E' :
//                result = '4';
//                break;
//        }

        return result;
    }

    public static void main(String[] args) throws IOException{
        new N17269().solution();
    }
}
