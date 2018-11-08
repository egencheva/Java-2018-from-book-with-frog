package ExamFinal;

import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceGuestSinger = Integer.parseInt(scanner.nextLine());
        String peopleStr = "";
        int people = 0;
        int totalMoney = 0;
        int allPeople = 0;
        int allPrice = 0;

        while (!(peopleStr.equals("The restaurant is full"))) {
            peopleStr = scanner.nextLine();
            if (peopleStr.equals("The restaurant is full")) {
                break;
            }
            if (!(peopleStr.equals("The restaurant is full"))) {
                people = Integer.parseInt(peopleStr);
            }
            if (people < 5) {
                allPrice = 0;
                allPrice = people * 100;
            } else {
                allPrice = 0;
                allPrice = people * 70;
            }
            totalMoney = totalMoney + allPrice;
            allPeople = allPeople + people;
        }

        if (totalMoney >= priceGuestSinger) {
            totalMoney = totalMoney - priceGuestSinger;
            System.out.printf("You have %d guests and %d leva left.", allPeople, totalMoney);
        } else {
            System.out.printf("You have %d guests and %d leva income, but no singer.", allPeople, totalMoney);
        }
    }
}