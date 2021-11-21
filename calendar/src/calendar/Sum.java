package calendar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 수를 입력하세요.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

//        System.out.println("두 수의 합은 " + (a + b) + "입니다.");
        System.out.printf("두 수의 합은 %d입니다.", a + b);
    }
}

