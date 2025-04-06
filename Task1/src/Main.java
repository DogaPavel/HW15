public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static final String CORRECT_CHARS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФЦЧШЩЪЬЫЭЮЯабвгдеёжзийклмнопрстуфчцчшщъьыэюя";

    public static void main(String[] args) {

        for (int i = 0; i < CORRECT_CHARS.length(); i++) {
            System.out.println(CORRECT_CHARS.substring(i, i + 1) + "-" + (int) CORRECT_CHARS.charAt(i));
        }
    }
}