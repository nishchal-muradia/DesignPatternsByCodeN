package DesignPatterns.creational.singleton.miniProject;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    private static volatile ConfigManager instance;
    private Properties properties;

    private ConfigManager() {
        System.out.println("INSTANCE CREATED"); // to check how many times object is getting created.
        properties = new Properties();
        loadProperties();
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }

    private void loadProperties() {
        try (FileInputStream fis = new FileInputStream("src/DesignPatterns/creational/singleton/miniProject/resources/config.properties")) {
            properties.load(fis);
            System.out.println(" Configuration loaded successfully.");
        } catch (IOException e) {
            System.out.println(" Failed to load configuration file.");
            e.printStackTrace();
        }
    }

    public String getConfig(String key) {
        return properties.getProperty(key);
    }

    public void printAllConfigs() {
        System.out.println(" Loaded Configurations:");
        properties.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
