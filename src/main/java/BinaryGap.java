import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaryGap {
    public int solution(int N) {
        while (N != 0 && (N & 1) == 0) {
            N >>= 1;
        }
        int maxGap = 0;
        int counter = 0;
        if (N <= 0 || N > 2147483646) {
            System.out.println("Wrong value of your INT");
        }else{
            while (N != 0) {
                if ((N & 1) == 0) {
                    counter++;
                    maxGap = Math.max(counter, maxGap);
                } else {
                    counter = 0;
                }
                N >>= 1;
            }
        }
        return maxGap;
    }
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        int result = binaryGap.solution(32);
        System.out.println("result equals " + result);
    }
}
