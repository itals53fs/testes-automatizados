package entities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    public String driverPath;
    public String url;
    public WebDriver driver;


    @BeforeClass
    public void preCond(){
        driverPath = "C:\\Users\\aline.zanin\\Documents\\chromedriver.exe"; 
        url = System.getProperty("user.dir")+"/src/paginas/componentes.html"; 
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver(); 
        driver.get(url);
        driver.manage().window().maximize();
    }




    @AfterClass
    public void posCond(){
      driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }


}
