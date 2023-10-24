public class DecodingTextForCost {
    String decode(double cost) {
        int roundCost = (int) cost;
        String result;

        switch (roundCost) {
            case 11:
            case 12:
            case 13:
            case 14:
                result = String.format("%.2f рублей", cost);
                break;
            default:
                switch (roundCost % 10) {
                    case 1:
                        result = String.format("%.2f рубль", cost);
                        break;
                    case 2:
                    case 3:
                    case 4:
                        result = String.format("%.2f рубля", cost);
                        break;
                    default:
                        result = String.format("%.2f рублей", cost);
                        break;
                }
                break;
        }

        //System.out.println(roundCost);
        return result;
    }
}
