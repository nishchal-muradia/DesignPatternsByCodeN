package DesignPatterns.creational.singleton;

// LAZY implementation of Singleton

public class Singleton2 {
    public static void main(String[] args) {
        Demo2 obj1 = Demo2.getInstance();
        System.out.println(obj1);
        Demo2 obj2 = Demo2.getInstance();
        System.out.println(obj2);


    }
}

class Demo2{
    //1. Create a static object of your class.(not creating it actually, will create runtime)
    static Demo2 obj ; // by default, it is null

    /*2. create your constructor private, cuz We don't want users
     to create obj with default constructor.*/
    private Demo2(){
        System.out.println("Instance Creation"); // printing to track instance creation

    }

    //3. A static method that will return your instance of the class
    public static Demo2 getInstance(){
        // create your obj runtime and return
        if(obj==null){
            obj= new Demo2();
        }
        return obj;
    }
}

/*1. Why this condition in getInstance method?
  Ans: Because if we don't put the condition then obj2 call will also able to create one more
    object, but we want singleton here.*/

/*1. What is the issue with this implementation?
  Ans: Suppose obj1.getInstance() and obj2.getInstance() are running in a threaded env.
   Then both will try to execute getInstance method at the same time and both
   will find obj as null (default value) and both will get a diff object,
   but we want singleton.
   "Lets fix this in Singleton3 with Thread implementation"
   */