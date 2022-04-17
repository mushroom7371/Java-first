package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

//나이순 정렬
public class N10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String [][] strArr2d = new String[N][2];    //나이와 이름들을 저장할 2차원 배열
        String [] str = new String[2];

        for(int i = 0; i < N; i++){ //i번지가 가리키는 배열의 0번지에 나이, 1번지에 이름을 담아둔다.
            str = br.readLine().split(" ");
            strArr2d[i][0] = str[0];
            strArr2d[i][1] = str[1];
        }

        br.close();

        Arrays.sort(strArr2d, new Comparator<String[]>() {  //나이순으로 정렬하되, 같은 나이일 경우 입력 순서를 유지한다.
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i = 0; i < N; i++){
            bw.write(strArr2d[i][0] + " " + strArr2d[i][1] + "\n");
        }

        bw.flush();
        bw.close();

    }
}
