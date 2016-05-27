package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public class ConfigData {

    private static final Logger log = Logger.getLogger(ConfigData.class);
    private static final String UI_MAPPING_PATH = "src/main/resources/UIMapping.properties";
    private static ConfigData config;
    private final Properties properties;
    private Map<String, String> propertiesMap;

    /**
     * Static method for return configuration data
     */
    public static ConfigData getConfigData() {
        if (config == null) {
            config = new ConfigData();
        }
        return config;
    }

    /**
     * private constructor
     */
    private ConfigData() {
        this.properties = new Properties();
        log.info(String.format("created properties"));
        try {
            this.propertiesMap = loadPropertiesToMap();
            log.info(String.format("created map properties"));
        } catch (IOException e) {
            e.printStackTrace();
            log.error(String.format("EXCEPTION < %s >", e.getStackTrace()));
        }
    }

    /**
     * private method for loaded properties to map
     */
    private Map<String, String> loadPropertiesToMap() throws NoSuchElementException,
            FileNotFoundException, IOException {
        if (Files.exists(Paths.get(UI_MAPPING_PATH))) {
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(UI_MAPPING_PATH);
                properties.load(fileInputStream);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new NoSuchElementException(
                    String.format("< %s > not found EXCEPTION", UI_MAPPING_PATH.substring(13)));
        }
        return propertiesMap = new HashMap<String, String>((Map) properties);
    }

    /**
     * private method for return value property
     */
    private String getPropertyValue(String key) {
        return propertiesMap.get(key);
    }

    /**
     * this method get locator
     */
    public By getLocator(String key) throws NoSuchElementException {
        String[] partsOfLocators = getPropertyValue(key).split("\"");
        String findMethod = partsOfLocators[0].substring(0, partsOfLocators[0].length() - 1);
        String locator = partsOfLocators[1];
        switch (findMethod) {
            case "id":
                return By.id(locator);
            case "name":
                return By.name(locator);
            case "class":
                return By.className(locator);
            case "cssSelector":
                return By.cssSelector(locator);
            case "xpath":
                return By.xpath(locator);
            default:
                throw new NoSuchElementException(
                        String.format("locator < %s > not defined!", locator));
        }
    }

}
