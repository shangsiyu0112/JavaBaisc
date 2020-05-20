package Thread;

/**
 * @athor 尚思雨
 * @date 2020-05-20-14:22
 */
/*
创建线程的方式二：实现Runnable接口
1创建一个实现了RUnnable接口的类
2实现类实现Runnable接口的run方法
3创建实现类对象
4将此对象作为参数传递到Thread类构造器中，创建Thread类的对象
通过Thread类的对象调用start（）方法
 */
//1创建一个实现了RUnnable接口的类
class Mythread2 implements  Runnable{
//2实现类实现Runnable接口的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
public class CreateThread3 {
    public static void main(String[] args) {
        //3创建实现类对象
        Mythread2 mythread2 = new Mythread2();
        //4将此对象作为参数传递到Thread类构造器中，创建Thread类的对象
        Thread thread = new Thread(mythread2);
        //通过Thread类的对象调用start（）方法
        thread.start();
    }
}
