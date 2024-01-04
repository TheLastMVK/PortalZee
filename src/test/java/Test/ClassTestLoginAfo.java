package Test;
import Page.ClassPageLoginAfo;
import Utility.ClassUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ClassTestLoginAfo {

    private WebDriver driver;
    //Para usar los metodos de la pagina:
    ClassPageLoginAfo classPageLoginAfo;

    @BeforeTest
    public void setUp() {
        classPageLoginAfo = new ClassPageLoginAfo(driver);
        driver =  classPageLoginAfo.chromeDriverConnection();
        classPageLoginAfo.visit(ClassUtils.URL_PRINCIPAL_ZONAS_ECONOMICAS);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void cleanUp(){
        /*driver.manage().deleteAllCookies();
        driver.close();*/
    }
    @Test (priority = 0, testName = "Logeo de Usuario")
    public void test() throws InterruptedException{
        classPageLoginAfo.loginUser();
        assertEquals("Mincetur", classPageLoginAfo.isPageLoginDisplayed());
    }


}
