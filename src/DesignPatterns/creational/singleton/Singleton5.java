package DesignPatterns.creational.singleton;

public class Singleton5 {
    public static void main(String[] args) {
        Demo5 obj1 = Demo5.INSTANCE;
        obj1.num=20;
        obj1.print();

        Demo5 obj2 = Demo5.INSTANCE;
        obj2.num=25;
        obj2.print();

    }

}

enum Demo5{
    INSTANCE;

    int num;
    public void print(){
        System.out.println(num);
    }
}

/*SO with new java versions we have INSTANCE
This INSTANCE is doing all your job to make a class Singleton*/
