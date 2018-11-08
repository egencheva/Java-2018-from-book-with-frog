package ExamFinal;

import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGuest = Integer.parseInt(scanner.nextLine());
        int numberOfGift = Integer.parseInt(scanner.nextLine());
        String groupOfGift = "";
        int coutA = 0;
        int coutB = 0;
        int coutV = 0;
        int coutG = 0;
        int count = 0;

        for (int i = 0; i < numberOfGift; i++) {
            groupOfGift = scanner.nextLine();

            if (groupOfGift.equals("A")) {
                coutA++;
            } else if (groupOfGift.equals("B")) {
                coutB++;
            } else if (groupOfGift.equals("V")) {
                coutV++;
            } else if (groupOfGift.equals("G")) {
                coutG++;
            }
            count++;
        }

        double percentA = (coutA * 1.0 / count) * 100;
        double percentB = (coutB * 1.0 / count) * 100;
        double percentV = (coutV * 1.0 / count) * 100;
        double percentG = (coutG * 1.0 / count) * 100;
        double percentGuest = (count * 1.0 / numberOfGuest) * 100;

        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%%n", percentGuest);
    }
}