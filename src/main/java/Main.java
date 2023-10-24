
public class Main {
    static Input input = new Input();

    public static void main(String[] args) {
        int countManForPay = -1;
        Calculate calc = new Calculate();

        while (true) {
            countManForPay = input.intInput("На сколько человек необходимо разделить счет?");
            if (countManForPay < 1) {
                System.out.println("Ошибка: введенное количество человек меньше 1\nПожалуйста повторите ввод\n");
            } else if (countManForPay == 1) {
                System.out.println("Ошибка: введен один человек, деление счета не нужно\nПожалуйста повторите ввод.\n");
            } else {
                System.out.println("Счет будет разделен на " + countManForPay + " человек\n");
                break;
            }
        }
        calc.calculate(countManForPay);
    }


}
