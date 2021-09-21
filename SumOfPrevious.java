import java.util.Scanner;

public class SumOfPrevious {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();

        int[] numArry = new int[n];
        for(int i = 0; i < n; i++) {
            numArry[i] = scnr.nextInt();
        }

        scnr.close();

        SumOfPrev(numArry, n, 0, 0);
    }

    public static bool SumOfPrev(int[] numArry, int n, int i, int j)
    {
        if (n <= 1)
            return false;
        if (j < n) {
            if (numArry[1] + numArry[2] == numArry[n-1])
                return true;
            return SumOfPrev(numArry, n, i, j + 1);
        }
    }
}