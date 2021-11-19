import java.util.Scanner;

public class SixToSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 구구단을 입력하세요: ");
        int dan = scanner.nextInt();

        // while 문으로 구현
        int i = 1;
        while(i < 10) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
            i = i + 1;
        }

        System.out.print("출력할 구구단을 입력하세요: ");
        dan = scanner.nextInt();

        // for 문으로 구현
        for (int j = 1; j < 10; j++) {
            System.out.println(dan + " * " + j + " = " + (dan * j));
        }
    }
}
