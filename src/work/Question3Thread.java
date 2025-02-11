//QUESTION 3: Create a thread using lambda function

package work;

public class Question3Thread {
    public static void main(String[] args){
        Runnable t1=()->{
            for(int i=1;i<=10;i++){
                System.out.println("Value is " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t=new Thread(t1);
        t.setName("harjyot");
        t.start();
    }
}
