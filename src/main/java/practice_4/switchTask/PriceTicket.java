package practice_4.switchTask;

import java.util.Scanner;

public class PriceTicket {

    public static void main(String[] args) {

        System.out.println("Введите число от 1 до 7: ");
        Scanner scanner = new Scanner(System.in);
        int dayWeek = scanner.nextInt();

        int discount300 = 300;
        int discount450 = 450;

        switch (dayWeek){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Скидка в будни: " + discount300);
                break;

            case 6:
            case 7:
                System.out.println("Скидка в выходные: " + discount450);
                break;

            default:
                System.out.println("Скидка не применима, проверьте день недели!");

        }





    }

}
