import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class SimpleMachine extends VendingMachine {
    private Map<Integer, Goods> productMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int enterNumber() {
        int productNumber = scanner.nextInt();
        return productNumber;
    }

    @Override
    public Goods showGoods(int productNumber){
        return productMap.get(productNumber);
    }

    public void goodsBuy(Goods goods) {
        System.out.println("Внесите сумму... ");
        while (true) {
            int cash = scanner.nextInt();
            if (cash < goods.getPrice()) {
                System.out.printf("Нужно еще %f", goods.getPrice() - cash);
            } else if (cash > goods.getPrice()) {
                System.out.printf("Ваша сдача %f", cash - goods.getPrice());
            } else {
                System.out.println("Возьмите ваш товар. Спасибо!");
                break;
            }
        }
    }

    @Override
    public Goods getGoods() {
        return null;
    }
}
