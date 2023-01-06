package BaekJoon;

import java.io.*;

//수도요금
public class N10707 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int feeOfCompanyX = Integer.parseInt(br.readLine());
        int defaultFeeOfCompanyY = Integer.parseInt(br.readLine());
        int limitAmountUsedCompanyY = Integer.parseInt(br.readLine());
        int extraFeeOfCompanyY = Integer.parseInt(br.readLine());
        int amountUsedOfJOI = Integer.parseInt(br.readLine());

        int totalFeeOfCompanyX = feeOfCompanyX * amountUsedOfJOI;
        int totalFeeOfCompanyY = defaultFeeOfCompanyY;

        int overLimitUsed = amountUsedOfJOI - limitAmountUsedCompanyY;

        if(overLimitUsed > 0){
            totalFeeOfCompanyY += overLimitUsed * extraFeeOfCompanyY;
        }

        if(totalFeeOfCompanyX > totalFeeOfCompanyY){
            bw.write(totalFeeOfCompanyY + "");
        }else{
            bw.write(totalFeeOfCompanyX + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N10707().solution();
    }
}
