package calendar;

import java.util.Scanner;

public class Prompt {

    public void printMenu() {
        System.out.println("+-------------------+");
        System.out.println("| 1. 일정등록   ");
        System.out.println("| 2. 일정검색   ");
        System.out.println("| 3. 달력보기   ");
        System.out.println("| h. 도움말 q. 종료");
        System.out.println("+------------------+");
    }

    /**
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
        printMenu();
        // 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();


        while (true) {
            System.out.println("명령 (1, 2, 3, h, q)");
            String cmd = scanner.next();
            if (cmd.equals("1")) cmdRegister();
            else if (cmd.equals("2")) cmdSearch();
            else if (cmd.equals("3")) cmdCal(scanner, cal);
            else if (cmd.equals("h")) printMenu();
            else if (cmd.equals("q")) break;
        }

        System.out.println("Thank you. Bye~");
        scanner.close();
    }

    private void cmdCal(Scanner s, Calendar c) {
        int month = 1;
        int year = 2017;
        System.out.println("년을 입력하세요.");
        System.out.print("YEAR> ");
        year = s.nextInt();

        System.out.println("월을 입력하세요.");
        System.out.print("MONTH> ");
        month = s.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        c.printCalendar(year, month);

    }

    private void cmdSearch() {
    }

    private void cmdRegister() {
    }

    public static void main(String[] args) {
        // 쉘 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
