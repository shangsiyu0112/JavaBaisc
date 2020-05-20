package Thread;

/**
 * @athor 尚思雨
 * @date 2020-05-20-13:09
 */
/*
1.start()启动当前线程，调用当前线程的run方法
2.run()方法，通常需要重写此方法，将线程要执行的操作声明在此方法中
3.currentThread();静态方法，返回执行当前代码的线程
4.getName()方法，获取当前线程的名字
5.setName(）方法，设置当前线程名字。还有构造器也能命名
6.yield()方法，释放当前CPU的执行，当然有可能在下一次分配又是我当前的线程
7。join();a中调用线程b的join方法，此时线程a进入阻塞状态，指导线程b完全执行万以后，线程a才结束阻塞状态，
8。stop（）过时了
9.sleeep（long millitime）休眠线程会抛异常，处理异常只能trycatch，因为Thread类的run方法并没有抛异常。
 */
public class ThreadMethod {

}
