package ExamFinal;

import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeContract = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String dessert = scanner.nextLine();
        int numberOfMonth = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (timeContract.equals("one")) {
            if (typeContract.equals("Small")) {
                price = 9.98;
            } else if (typeContract.equals("Middle")) {
                price = 18.99;
            } else if (typeContract.equals("Large")) {
                price = 25.98;
            } else if (typeContract.equals("ExtraLarge")) {
                price = 35.99;
            }
        } else if (timeContract.equals("two")) {
            if (typeContract.equals("Small")) {
                price = 8.58;
            } else if (typeContract.equals("Middle")) {
                price = 17.09;
            } else if (typeContract.equals("Large")) {
                price = 23.59;
            } else if (typeContract.equals("ExtraLarge")) {
                price = 31.79;
            }
        }

        if (dessert.equals("yes")) {
            if (price <= 10) {
                price = price + 5.50;
            } else if (price <= 30) {
                price = price + 4.35;
            } else if (price > 30) {
                price = price + 3.85;
            }
        }

        if (timeContract.equals("two")) {
            price = price - (price * 0.0375);
        }
        price = price * numberOfMonth;

        System.out.printf("%.2f lv.", price);

    }
}

/*
• при добавен десерт, към таксата се прибавя различна сума, в зависимост от цената на абонамента
• при сума по-малка или равна на 10.00 лв. → 5.50 лв
• при сума по-малка или равна на 30.00 лв. → 4.35 лв.
• при сума по-голяма от 30.00 лв. → 3.85 лв.
• ако договорът е за две години, общата сума се намалява с 3.75%
 */


/*
От конзолата се четат 4 реда:
1. срок на договор - текст - "one", или "two"
2. тип на договор - текст - "Small", "Middle", "Large"или "ExtraLarge"
3. Добавен десерт - текст - "yes", или "no"
4. брой месеци за плащане - цяло число в интервала [1 … 24]
 */