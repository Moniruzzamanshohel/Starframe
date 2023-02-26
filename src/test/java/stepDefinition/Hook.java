package stepDefinition;

import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends config {

    // QA: http://www.qa.taltektc.com
    // STAGE: http://www.stage.taltektc.com
    // PROD: http://www.prod.taltektc.com

    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void beforeEachTest(){
        driver = setupBrowser (driverType);
        switch (envType){
            case "qa":
                url = "http://www.qa.taltektc.com";
                break;
            case "stg":
                url = "http://www.stage.taltektc.com";
                break;
            case "prod":
                url = "http://www.prod.taltektc.com";

                break;
        }
        driver.get(url);
    }

    @After
    public void afterEachTest(){
        // driver.quit();
    }
}
