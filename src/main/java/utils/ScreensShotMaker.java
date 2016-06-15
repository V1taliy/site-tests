package utils;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreensShotMaker {
    private static final Logger log = Logger.getLogger(ScreensShotMaker.class);

    public static void takeScreenShot(WebDriverWrapper driverWrapper, String screenShotName)
            throws IOException {
        File source  = driverWrapper.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./target/Screenshots/" + screenShotName + ".jpg"));
        log.info("screenshot taken successfully!");
    }
}
