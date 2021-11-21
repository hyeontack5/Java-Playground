import java.util.Scanner;

public class Arrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 구구단을 입력하세요: ");
        int dan = scanner.nextInt();

        scanner.close();

        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            result[i] = dan * (i+1);
            System.out.println(dan + " * " + (i+1) + " = " + result[i]);
        }
    }
}
