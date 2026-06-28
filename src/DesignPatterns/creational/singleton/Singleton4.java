package DesignPatterns.creational.singleton;

//Sinletono withn Double locking
public class Singleton4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Demo4 obj1 = Demo4.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Demo4 obj2 = Demo4.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}

class Demo4 {
    static Demo4 obj;

    private Demo4() {
        System.out.println("Instance created"); // printing to track instance creation
    }

    public static Demo4 getInstance() {
        if (obj == null) {
            synchronized (Demo4.class) {
                if (obj == null) {
                    obj = new Demo4();
                }
            }
        }
        return obj;
    }
}
/*What is double locking?
    We will check out obj 2 times that it is null or not. One time normal and one time inside synchronized block
    we are just using synchronized while creating the object only instead of creating whole class synchronized that was
    way too costly operation.

Now we are sorted totally.
But we have one more way to create singleton design pattern using enum INSTANCE
Lets check that out in Singleton4.java
*/
