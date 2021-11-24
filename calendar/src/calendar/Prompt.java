package calendar;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT = "> ";

    public void runPrompt() {
        // 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        while (true) {
            System.out.println("년과 월을 입력하세요.");
            System.out.print(PROMPT);
            int year = scanner.nextInt();
            int month = scanner.nextInt();

            if (month == -1) {
                System.out.println("Have a nice day!");
                break;
            }

            if (month > 12) {
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
