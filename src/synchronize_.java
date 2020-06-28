public class synchronize_  implements Runnable{
    private int count;
    public synchronize_(){

    }
    public void countAdd(){
        synchronized (this){
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+":"+count++);
            }
        }
    }
    public void printCount(){
        for(int i=0;i<5;i++){
            try {
                System.out.println(Thread.currentThread().getName() + " count:" + count);
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        if(threadName.equals("A")){
            countAdd();
        }else if(threadName.equals("B")){
            printCount();
        }
    }
}

