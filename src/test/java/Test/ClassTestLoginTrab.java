package Test;

import Page.ClassPageLoginTrab;
import Utility.ClassUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class ClassTestLoginTrab {
    private WebDriver driver;
    //Para usar los metodos de la pagina:
    ClassPageLoginTrab classPageLoginTrab;

    @BeforeTest
    public void setUp() {
        classPageLoginTrab = new ClassPageLoginTrab(driver);
        driver =  classPageLoginTrab.chromeDriverConnection();
        classPageLoginTrab.visit(ClassUtils.URL_PRINCIPAL_ZONAS_ECONOMICAS);
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void cleanUp(){
        /*driver.manage().deleteAllCookies();
        driver.close();*/
    }
    @Test (priority = 0, testName = "Logeo de Usuario")
    public void test() throws InterruptedException{
        classPageLoginTrab.loginUser();
        assertEquals("Mincetur", classPageLoginTrab.isPageLoginDisplayed());
    }
}