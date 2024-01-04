package Test;
import Page.ClassPageLoginAdm;
import Utility.ClassUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ClassTestLoginAdm {

    private WebDriver driver;
    //Para usar los metodos de la pagina:
    ClassPageLoginAdm classPageLoginAdm;

    @BeforeTest
    public void setUp() {
        classPageLoginAdm = new ClassPageLoginAdm(driver);
        driver =  classPageLoginAdm.chromeDriverConnection();
        classPageLoginAdm.visit(ClassUtils.URL_PRINCIPAL_ZONAS_ECONOMICAS);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void cleanUp(){
        /*driver.manage().deleteAllCookies();
        driver.close();*/
    }
    @Test (priority = 0, testName = "Logeo de Usuario")
    public void test() throws InterruptedException{
        classPageLoginAdm.loginUser();
        assertEquals("Mincetur", classPageLoginAdm.isPageLoginDisplayed());
    }


}
