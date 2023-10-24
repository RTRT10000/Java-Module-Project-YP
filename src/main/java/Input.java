import java.util.Scanner;
import java.util.Set;

public class Input {
    Scanner scanner = new Scanner(System.in);

    String strInput(String greetText) {
        String result = "";
        System.out.println(greetText);
        while (true) {
            result = scanner.nextLine();
            if (result.length() == 0) {
                System.out.println("Необходимо что-то ввести\nПожалуйста, повторите\n");
            } else {
                break;
            }
        }


        return result;
    }

    int intInput(String greetText) {
        int result = 0;

        System.out.println(greetText);

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Не корректный ввод\nПожалуйста, повторите\n");
                scanner.nextLine();
            } else {
                result = scanner.nextInt();
                break;
            }
        }
        scanner.nextLine();
        return result;
    }

    double doubleInput(String greetText) {
        String rawInputString = "";
        double result = 0.0;
        Scanner scanner2;

        System.out.println(greetText);
        while (true) {
            rawInputString = scanner.nextLine();
            scanner2 = new Scanner(refineInputStringForDouble(rawInputString));
            if (scanner2.hasNextDouble()) {
                result = scanner2.nextDouble();
                break;
            } else {
                System.out.println("Введена не корректная стоимость, пожалуйста повторите ввод\n");
            }
        }
        return result;
    }

    //Метод удаляет из строки все символы не релевантные для типа dounle, заменяет точку запятой и возвращает получившуюся строку
    String refineInputStringForDouble(String refineString) {
        Set<Character> validChars = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ',', '.');
        String result = "";


        char[] arrayRawInputString = refineString.toCharArray();

        for (int i = 0; i < arrayRawInputString.length; i++) {
            if (validChars.contains(arrayRawInputString[i])) {
                if (arrayRawInputString[i] == '.') {
                    result += ',';
                } else {
                    result += arrayRawInputString[i];
                }
            }
        }
        //System.out.println(result);
        return result;
    }
}

