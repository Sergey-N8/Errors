import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        emptyStr();
    }

    private static void emptyStr() {
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        if (string.equals("")) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        System.out.println("Все получилось! Напечатанно: " + string);
        sc.close();
    }
}