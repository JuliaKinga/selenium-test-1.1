package org.fasttrackit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    private static Properties properties = new Properties ();

    static {
        String environment = System.getProperty("env", "production");
        InputStream inputStream = AppConfig.class.getClassLoader().getResourceAsStream(environment + ".properties");
        try {
            properties.load(inputStream);}
            catch (IOException e){
                System.out.println("Failed to load properties." + e.getMessage());
            }}

     private static String chromeDriverPatch = properties.getProperty("chrome.driver.path");

     private static String siteUrl = properties.getProperty("site.url");

    public static String getChromeDriverPatch() {
        return chromeDriverPatch;
    }

    public static String getSiteUrl() {
        return siteUrl;
    }
}


