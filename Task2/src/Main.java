import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите фамилию, имя и отчество одной строкой на кириллице, разделённые пробелом:");
        String input = new Scanner(System.in).nextLine().trim();

        int spaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        if (spaceCount == 2) {
            System.out.println(input.substring(0, input.indexOf(' ')));
            System.out.println(input.substring(input.indexOf(' ') + 1, input.lastIndexOf(' ')));
            System.out.println(input.substring(input.lastIndexOf(' ') + 1));
        } else System.out.println("Введенная строка не является ФИО!");
    }
}