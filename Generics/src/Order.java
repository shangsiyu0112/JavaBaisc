/**
 * 自定义泛型类
 * @athor 尚思雨
 * @date 2020-05-24-10:59
 */
public class Order<T> {
    String orderName;
    int orderId;
    T orderT;

    public Order(String orderName, int orderId,T orderT){
        this.orderName=orderName;
        this.orderId=orderId;
        this.orderT=orderT;
    }

}
