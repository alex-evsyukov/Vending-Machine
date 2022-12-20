abstract public class VendingMachine {
    public abstract int enterNumber();

    public abstract Goods showGoods(int productNumber);

    public abstract void goodsBuy(Goods goods);

    public abstract Goods getGoods();
}
