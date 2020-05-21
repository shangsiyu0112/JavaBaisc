package compare;

/**
 * @athor 尚思雨
 * @date 2020-05-21-22:03
 */
public class Good implements java.lang.Comparable {
    private String name;
    private double Price;

    public Good(String name, double price) {
        this.name = name;
        Price = price;
    }

    public Good() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof  Good){
            Good good = (Good) o;
            //方式一：
            if(this.getPrice() > good.getPrice()){
                return 1;
            }else if(this.getPrice() < good.getPrice()) {
                return -1;
            }else {
                return 0;
            }
        }
//方式二： return Double.compare(this.getPrice(),good.getPrice);
       throw new RuntimeException("传入的数据不一致");
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                '}';
    }
}

