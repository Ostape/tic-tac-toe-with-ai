package ticTacToe;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int j = 0;
        int seed;
        while (true) {
            boolean flag = true;
            seed = k + j;
            random.setSeed(seed);
            j++;
            for (int i = 0; i < n; i++) {
                if (random.nextGaussian() > m) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(seed);
    }
}

