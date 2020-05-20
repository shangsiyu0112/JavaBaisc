package Thread;

/**
 * @athor 尚思雨
 * @date 2020-05-20-14:37
 */
public class RunnableTest {
    public static void main(String[] args) {
        //意思就是卖票这是一个任务，我们找三个线程来实现这个任务
        Windows windows = new Windows();
        Thread thread = new Thread(windows);
        Thread thread2 = new Thread(windows);
        Thread thread3 = new Thread(windows);
        thread.start();
        thread2.start();
        thread3.start();

    }
}

class Windows implements  Runnable{
    private int  tickets = 100;//这里和使用Thread实现线程不同，这里不用static修饰
    Object object = new Object();//执行这个任务的时候多个线程共用的一把锁。
    @Override
    public void run() {
        while(true){

           synchronized (object){
               if(tickets > 0){
                   try {
                       //加上线程休眠，极大的增加了线程切换的频率，出现问题的概率会增大
                       //比如出现0票。-1票，不加阻塞也会有，加上阻塞出现概率变大
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + tickets);
                   tickets--;
               }else{
                   break;
               }
           }

        }
    }
}
