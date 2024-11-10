package org.example.utils;

import org.opentest4j.FileInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    private ConfigReader() {
    }

    static {
        try {
            String path = "/Users/user/IdeaProjects/CucumberFall2023/src/main/resources/configuration.properties";
            FileInputStream inputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException("file not found");
        }
    }
    public static String getValue(String key){
        return properties.getProperty(key).trim();
    }
}
