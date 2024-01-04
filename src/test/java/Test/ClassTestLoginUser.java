package Test;

import Page.ClassPageLoginUser;
import Utility.ClassUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class ClassTestLoginUser {

    private WebDriver driver;
    //Para usar los metodos de la pagina:
    ClassPageLoginUser classPageLoginUser;

    @BeforeTest
    public void setUp() {
        classPageLoginUser = new ClassPageLoginUser(driver);
        driver =  classPageLoginUser.chromeDriverConnection();
        classPageLoginUser.visit(ClassUtils.URL_PRINCIPAL_ZONAS_ECONOMICAS);
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void cleanUp(){
        /*driver.manage().deleteAllCookies();
        driver.close();*/
    }
    @Test (priority = 0, testName = "Logeo de Usuario")
    public void test() throws InterruptedException{
        classPageLoginUser.loginUser();
        assertEquals("Mincetur", classPageLoginUser.isPageLoginDisplayed());
    }
}
