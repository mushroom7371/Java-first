package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//행렬의 곱셈
public class N2740 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int column = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int[][] matrixArray1 = new int[column][row];

        for(int i = 0; i < matrixArray1.length; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < matrixArray1[0].length; j++){
                matrixArray1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        column = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        int[][] matrixArray2 = new int[column][row];

        for(int i = 0; i < matrixArray2.length; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < matrixArray2[0].length; j++){
                matrixArray2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] resultArray = new int[matrixArray1.length][matrixArray2[0].length];

        for(int i = 0; i < matrixArray1.length; i++){
            for(int j = 0; j < matrixArray2[0].length; j++){
                for(int k = 0; k < matrixArray1[0].length; k++) {
                    resultArray[i][j] += matrixArray1[i][k] * matrixArray2[k][j];
                }
            }
        }

        for(int i = 0; i < resultArray.length; i++){
            for(int j = 0; j < resultArray[0].length; j++){
                bw.write(resultArray[i][j] + " ");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N2740().solution();
    }
}
