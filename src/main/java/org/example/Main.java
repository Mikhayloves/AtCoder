package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            input.append(line).append("\n");
        }

        System.out.println(solve(input.toString()));
        scanner.close();
    }

    public static String solve(String input_str) {
        Scanner scanner = new Scanner(input_str);
        int N = scanner.nextInt();
        long currentWater = 0L;
        long prevTime = 0L;

        for (int i = 0; i < N; ++i) {
            long T_i = scanner.nextLong();
            long V_i = scanner.nextLong();
            long timePassed = T_i - prevTime;
            currentWater = Math.max(0L, currentWater - timePassed);
            currentWater += V_i;
            prevTime = T_i;
        }

        scanner.close();
        return String.valueOf(currentWater);
    }
}
