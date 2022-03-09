package calendar;

import java.util.Scanner;

public class Prompt {

    /**
     *
     * @param week 요일명
     * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
     */
    public int parseDay(String week) {
        if (week.equals("SUN")) {
            return 0;
        } else if (week.equals("MON")) {
            return 1;
        } else if (week.equals("TUE")) {
            return 2;
        } else if (week.equals("WED")) {
            return 3;
        } else if (week.equals("THU")) {
            return 4;
        } else if (week.equals("FRI")) {
            return 5;
        } else if (week.equals("SAT")) {
            return 6;
        } else {
            return 0;
        }
    }

    public void runPrompt() {

        // 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month = 1;
        int year = 2017;

        while (true) {
            System.out.println("년을 입력하세요. (exit: -1)");
            System.out.print("YEAR> ");
            year = scanner.nextInt();
            if (year == -1) {
                System.out.println("Have a nice day!");
                break;
            }

            System.out.println("월을 입력하세요.");
            System.out.print("MONTH> ");
            int month = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            cal.printCalendar(year, month);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        // 쉘 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
