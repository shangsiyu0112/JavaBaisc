package Thread;

import sun.security.jca.GetInstance;

/**
 * @athor 尚思雨
 * @date 2020-05-19-14:18
 */
public class SingleTon02 {
    /*
    单例模式的懒汉式实现
    提升为线程安全的：同步方法实现
     */
    public static void main(String[] args) {
        Book book = Book.getInstance();
    }
}

class Book{
    private Book(){
    }
    private static Book instance;
    //方式一
//    public static synchronized Book getInstance(){
//        if(instance==null){
//            instance  =  new Book();
//        }
//        return instance;
//    }
    //方式二:后来的线程进来，看到不为空，直接拿着就走了，
    public  static Book getInstance(){
        if(instance==null){
            synchronized (Book.class){
                if(instance==null){
                    instance =  new Book();
                }
            }
        }
            return instance;
    }
}
