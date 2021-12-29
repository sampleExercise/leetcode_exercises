package daily_problem;

import java.util.Arrays;

public class p_2021_12_27_476 {
    public static int findComplement(int num) {
        return num^2;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));

        int num1 = 1;
        System.out.println(findComplement(num1));

    }
}
