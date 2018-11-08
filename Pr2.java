package ExamFinal;

import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grilsPartyPrice = Double.parseDouble(scanner.nextLine());
        int loveMessagesCounter = Integer.parseInt(scanner.nextLine());
        int waxRosesCounter = Integer.parseInt(scanner.nextLine());
        int keyChainsCounter = Integer.parseInt(scanner.nextLine());
        int cartoonsCounter = Integer.parseInt(scanner.nextLine());
        int luckSurpriseCount = Integer.parseInt(scanner.nextLine());

        double priceloveMessages = loveMessagesCounter * 0.60;
        double priceWaxRoses = waxRosesCounter * 7.2;
        double priceKeyChains = keyChainsCounter * 3.6;
        double priceCartoons = cartoonsCounter * 18.20;
        double priceLuckSuprise = luckSurpriseCount * 22;

        int allThings = loveMessagesCounter + waxRosesCounter + keyChainsCounter + cartoonsCounter + luckSurpriseCount;
        double totalMoney = priceloveMessages + priceWaxRoses + priceKeyChains + priceCartoons + priceLuckSuprise;

        if (allThings >= 25) {
            totalMoney = totalMoney - (totalMoney * 0.35);
        }
        totalMoney = totalMoney - (totalMoney * 0.1);

        if (totalMoney >= grilsPartyPrice) {
            totalMoney = totalMoney - grilsPartyPrice;
            System.out.printf("Yes! %.2f lv left.", totalMoney);
        } else {
            double noMany = grilsPartyPrice - totalMoney;
            System.out.printf("Not enough money! %.2f lv needed.", noMany);
        }
    }
}