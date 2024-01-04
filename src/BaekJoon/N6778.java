package BaekJoon;

import java.io.*;

//Which Alien?
public class N6778 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int antenna = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());

        if (antenna >= 3 && eyes <=4){
            System.out.println("TroyMartian");
        }if(antenna <= 6 && eyes >= 2 ){
            System.out.println("VladSaturnian");
        }if(antenna <=2 && eyes <= 3){
            System.out.println("GraemeMercurian");
        }else {
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6778().solution();
    }
}
