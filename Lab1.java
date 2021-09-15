import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();

        int[] numArry = new int[n];
        for(int i = 0; i < n; i++) {
            numArry[i] = scnr.nextInt();
        }

        scnr.close();

        SumOfPrevious(numArry);
    }

    public static void SumOfPrevious(int[] numArry)
    {
        for (int i : numArry) {
            System.out.print(i);
        }
    }
}