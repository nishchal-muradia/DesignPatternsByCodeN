package DesignPatterns.creational.singleton;

public class Singleton1 {

    public static void main(String[] args) {
        Demo1 obj = Demo1.getInstance();
        Demo1 ob2 = Demo1.getInstance();
        // Every time we will get same instance of the class. That's singleton.
    }

}

class Demo1 {
    //1. Create a static object of your class.
    static Demo1 obj = new Demo1();

    /*2. create your constructor private, cuz We don't want users
     to create obj with default constructor.*/
    private Demo1(){
        System.out.println("Instance Creation"); // printing to track instance creation
    }

    //3. A static method that will return your instance of the class
    public static Demo1 getInstance(){
        return obj;
    }
}

/*This example is correct but What is the issue with this implementation?
   static Demo obj = new Demo();
   This line means obj will create in memory all the time (when class loads, cuz its static)
   Even if we are not using it, it will be in the memory
   "This is called EGAR implementation (EGAR instance creation)"
   Lets improve this in next example in Singleton2.java
   Check EGAR vs LAZY here
    : https://www.geeksforgeeks.org/software-testing/lazy-loading-vs-eager-loading/
   */
