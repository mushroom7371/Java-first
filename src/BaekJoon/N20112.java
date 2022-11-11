package BaekJoon;

import java.io.*;

//사토르 마방진
public class N20112 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arrayLength = Integer.parseInt(br.readLine());
        String[] satorSquare = new String[arrayLength]; //사토르 마방진을 담을 배열
        boolean isSator = true; //사토르 마방진 여부를 판단할 변수

        for(int i = 0; i < arrayLength; i++){   //데이터 저장용 반복
            satorSquare[i] = br.readLine();
        }

        for(int i = 0; i < arrayLength; i++){
            String row = satorSquare[i];    //가로 문자열
            StringBuilder column = new StringBuilder();
            //세로 문자열을 담을 StringBuilder. String으로 선언하지 않은 이유는 불변성 때문(+로 추가 할때마다 객체가 새로 생성된다.)

            for(int j = 0; j < satorSquare[0].length(); j++){
                column.append(satorSquare[j].charAt(i));    //세로로 읽으면서 단어를 StringBuiler에 추가해준다.
            }

            if(!row.equals(String.valueOf(column))){    //두 문자열이 같지 않으면 사토르 마방진이 아님
                isSator = false;
                break;
            }
        }

        if(isSator){
            bw.write("YES");
        }else{
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N20112().solution();
    }
}
