import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class BiggestNumber {
    public int solution(int N) {
        int[] digits;
        int result = 0;
        if (N >= 100000000 || N <= 0) {
            System.out.println("Wrong number to solve the problem.");
            return 0;
        } else {
            digits = Integer.toString(N).chars().map(digit -> digit - '0').toArray();
            Integer[] bigDigits = IntStream.of(digits).boxed().toArray(Integer[]::new);
            Arrays.sort(bigDigits, Collections.reverseOrder());
            /*for (Integer dig:bigDigits)
                  {
                      System.out.println(dig);
            }*/
            for (int i = 0; i < bigDigits.length; i++) {
                result *= 10;
                result += bigDigits[i];
            }
            System.out.println("The biggest number = " + result);
            return 1;
        }
    }

    public static void main(String[] args) {
        BiggestNumber biggestNumber = new BiggestNumber();
        biggestNumber.solution(546982);
    }
}
