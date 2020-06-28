public class student{
    private int ID;
    private String name;
    private float score;
    public void SetRecord(int ID,String name,float score){
        this.ID=ID;
        this.name=name;
        this.score=score;
    }
    public float getRecord(int ID){
        if(ID==this.ID){
            return this.score;
        }else {
            return -1;
        }
    }
    public static void main(String[] args){
//        student s=new student();
//        s.SetRecord(0,"alex",100);
//        double sco=(int)s.getRecord(1);
//        System.out.println(sco);
        synchronize_ counter=new synchronize_();
        Thread thread1 = new Thread(counter, "A");
        Thread thread2 = new Thread(counter, "B");
        thread1.start();
        thread2.start();


    }

}
