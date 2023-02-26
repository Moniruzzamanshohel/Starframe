package base;

public class config {
    // init Driver
    public static WebDriver driver;

    // Setup browser type
    public static WebDriver setupBrowser (String driverType){
        if (driverType.equalsIgnoreCase("Ch")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("ff")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("Safari")){
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

}
