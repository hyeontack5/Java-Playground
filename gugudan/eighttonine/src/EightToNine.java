import java.util.Scanner;

public class EightToNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 구구단을 입력하세요: ");
        int dan = scanner.nextInt();

        if (dan < 2) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        } else if (dan > 9) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        } else {
            for (int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
    }
}
