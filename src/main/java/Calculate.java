import java.util.ArrayList;
import java.util.List;

public class Calculate {
    String nameItem = "";

    double costItem = 0;
    double totalCost = 0;
    List<Goods> arrayGoods = new ArrayList<>();
    DecodingTextForCost textCost = new DecodingTextForCost();

     void calculate(int countManForPay) {
        while (true) {
            nameItem = Main.input.strInput("Введите название товара");
            costItem = Main.input.doubleInput("Введите стоимость товара в формате рубли.копейки");
            totalCost = totalCost + costItem;
            arrayGoods.add(new Goods(nameItem,costItem));
            System.out.println("Товар: " + nameItem + " стоимостью: " + textCost.decode(costItem) + " успешно добавлен\n");

            nameItem = Main.input.strInput("Для продолжения ввода введите любой символ\nДля завершения введите \"Завершить\"");
            if (nameItem.equalsIgnoreCase("Завершить")) {
                break;
            }

        }
        System.out.println("Всего введено товаров: " + arrayGoods.size() + "\nна сумму: " + textCost.decode(totalCost));
        System.out.println("Добавленные товары:");
        for (int i = 0; i < arrayGoods.size(); i++) {
          System.out.println(arrayGoods.get(i).name + " стоимостью " + textCost.decode(arrayGoods.get(i).cost));
        }
        System.out.println("Cчет делится на " + countManForPay + " человек");
        System.out.println("На каждого приходиться " + textCost.decode(totalCost/countManForPay));
    }
}
