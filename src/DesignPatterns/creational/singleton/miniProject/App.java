package DesignPatterns.creational.singleton.miniProject;

public class App {
    public static void main(String[] args) {

        // Thread 1
        Thread t1 = new Thread() {
            public void run() {
                ConfigManager config = ConfigManager.getInstance();
                System.out.println(getName() + " → app.name: " + config.getConfig("app.name"));
            }
        };
        t1.setName("Thread-1");

        // Thread 2
        Thread t2 = new Thread() {
            public void run() {
                ConfigManager config = ConfigManager.getInstance();
                System.out.println(getName() + " → app.name: " + config.getConfig("app.name"));
            }
        };
        t2.setName("Thread-2");

        // Thread 3
        Thread t3 = new Thread() {
            public void run() {
                ConfigManager config = ConfigManager.getInstance();
                System.out.println(getName() + " → app.name: " + config.getConfig("app.name"));
            }
        };
        t3.setName("Thread-3");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        // Direct access in main thread
        ConfigManager config = ConfigManager.getInstance();
        System.out.println(" All Configurations:");
        config.printAllConfigs();
    }
}
