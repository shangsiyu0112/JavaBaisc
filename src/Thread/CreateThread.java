package Thread;

/**
 * @athor 尚思雨
 * @date 2020-05-20-12:41
 */
/*
方式一：继承Thread
创建一个类继承Thread
重写run方法-->创建线程要做的事，也就是线程需要做的操作
创建Thread类的子类的对象
通过此对象调用start（）；
 */
class MyThread extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
public class CreateThread {
//主线程里创建子类的对象
public static void main(String[] args) {
    MyThread thread = new MyThread();//主线程做的
    thread.start();//主线程做的，start后，thread线程自己执行
    for (int i = 0; i < 100; i++) {
        if(i%2==0){
            System.out.println(Thread.currentThread().getName()+"*********"+i);
        }
    }

    //问题1我们可以直接调用run方法来启动线程码？
    //thread.run（）;不行，这样没有体现两个线程，还是一个main线程在执行
    //问题2在启动一个线程，遍历100以内的偶数，不可以还让已经start（）的线程去执行，会报IllegalThread
    //我们需要重新创建一个线程对象
    MyThread thread1 = new MyThread();
    thread1.start();
}
}
