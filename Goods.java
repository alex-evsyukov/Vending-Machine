import java.util.Objects;

public class Goods {
    private String name;
    private int vendor_code;
    private float price;
    private int amount;

    public Goods(String name, int vendor_code, float price, int amount) {
        this.name = name;
        this.vendor_code = vendor_code;
        this.price = price;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVendor_code() {
        return vendor_code;
    }

    public void setVendor_code(int vendor_code) {
        this.vendor_code = vendor_code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Goods goods = (Goods) o;
        return vendor_code == goods.vendor_code && Float.compare(goods.price, price) == 0
                && Object.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vendor_code, price, amount);
    }

    @Override
    public String toString() {
        return "Goods{" + "name=" + name + '\'' + "vendor_code=" + vendor_code + ", price=" + price + '}';
    }
}
