package BaekJoon;

import java.io.*;

//1번부터 문제의 상태가…?
public class N23027 {
    //String replaceAll 메소드가 여러 문자를 지원하는지 모르고 하나하나 if문으로 작성함 ㅠㅠ
    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String letter = br.readLine();
        String[] letterArray = letter.split("");

        bw.write(changeLetter(letter, letterArray));

        br.close();
        bw.flush();
        bw.close();
    }

    String changeLetter(String letter, String[] letterArray){
        StringBuilder afterChange = new StringBuilder();

        if(letter.contains("A")){
            for(int i = 0; i < letterArray.length; i++){
                if(letterArray[i].equals("B") || letterArray[i].equals("C") || letterArray[i].equals("D") || letterArray[i].equals("F")){
                    letterArray[i] = "A";
                }

                afterChange.append(letterArray[i]);
            }
        }
        if(!letter.contains("A") && letter.contains("B")){
            for(int i = 0; i < letterArray.length; i++){
                if(letterArray[i].equals("C") || letterArray[i].equals("D") || letterArray[i].equals("F")){
                    letterArray[i] = "B";
                }

                afterChange.append(letterArray[i]);
            }
        }
        if(!letter.contains("A") && !letter.contains("B") && letter.contains("C")){
            for(int i = 0; i < letterArray.length; i++){
                if(letterArray[i].equals("D") || letterArray[i].equals("F")){
                    letterArray[i] = "C";
                }

                afterChange.append(letterArray[i]);
            }
        }
        if(!letter.contains("A") && !letter.contains("B") && !letter.contains("C")){
            for(int i = 0; i < letterArray.length; i++){
                letterArray[i] = "A";

                afterChange.append(letterArray[i]);
            }
        }

        return String.valueOf(afterChange);
    }

    public static void main(String[] args) throws IOException{
        new N23027().solution();
    }
}
