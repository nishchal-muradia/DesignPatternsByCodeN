package DesignPatterns.creational.singleton;


// LAZY implementation with Synchronization (one thread at a time)
public class Singleton3 {
    public static void main(String[] args) {
        // Create threads here

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // creation obj inside a threaded env.
                Demo3 obj1 = Demo3.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // creation obj inside a threaded env.
                Demo3 obj2 = Demo3.getInstance();
            }
        });

        t1.start();
        t2.start();

    }
}


class Demo3{
    static Demo3 obj;

    private Demo3(){
        System.out.println("Instance Creation"); // printing to track instance creation
    }

    public synchronized static Demo3 getInstance(){
        if(obj==null){
            obj = new Demo3();
        }
        return obj;
    }


}

/*
1. Remove the synchronized keyword and run this in a threaded env, you may get 2 object creation.
   if you use synchronized => it will help you run only one thread at a time.
   And that's how adding this make our class singleton for threaded env as well.

   2.Any issues with this implementation?
   Ans - Yes. Using synchronized is very costly. It can slow down your operation and
   can increase your response time.

   How it slows down the operation?
   =>So, every time any thread calls getInstance(),
    it must first acquire a lock (called a monitor lock) on the class Demo3.class
     (since it’s a static method).
    Once it finishes, it releases the lock.
    Means it will be Lock acquisition costs time+ Thread contention + Context switching time

    3. What is the fix?
    Let's fix this with double locking in Singleton4.java.
*/
