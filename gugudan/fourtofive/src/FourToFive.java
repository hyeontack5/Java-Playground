import java.util.Scanner;

public class FourToFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 구구단을 입력하세요: ");
        int dan = scanner.nextInt();

        System.out.println(dan + " * " + 1 + " = " + (dan * 1));
        System.out.println(dan + " * " + 2 + " = " + (dan * 2));
        System.out.println(dan + " * " + 3 + " = " + (dan * 3));
        System.out.println(dan + " * " + 4 + " = " + (dan * 4));
        System.out.println(dan + " * " + 5 + " = " + (dan * 5));
        System.out.println(dan + " * " + 6 + " = " + (dan * 6));
        System.out.println(dan + " * " + 7 + " = " + (dan * 7));
        System.out.println(dan + " * " + 8 + " = " + (dan * 8));
        System.out.println(dan + " * " + 9 + " = " + (dan * 9));
    }
}
