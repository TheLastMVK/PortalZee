package Test;

import Page.ClassPageLoginTrab;
import Page.ClassPageIngresoConIni;
import Utility.ClassUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuiteIngresoConIni {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void getLogicUrl() throws InterruptedException {
        driver.manage().window().maximize();
    }

    @AfterTest
    public static void closeTest() throws InterruptedException {
        //driver.manage().deleteAllCookies();
        //driver.close();
    }

    //Inicio de Sesión
    @Test(priority = 0, testName = "Confirmación de Logeo")
    public static void Confirmación_de_Logeo() throws InterruptedException{
        driver.get(ClassUtils.URL_PRINCIPAL_ZONAS_ECONOMICAS);
        ClassPageLoginTrab classPageLoginTrab = new ClassPageLoginTrab(driver);
        classPageLoginTrab.loginUser();
    }

    @Test (priority = 1, testName = "Datos de Ingreso")
    private void RegistroDraft1() throws InterruptedException {
        driver.get(ClassUtils.URL_INGRESO_BANDEJA_CONTROL_INICIAL);
      ClassPageIngresoConIni classPageIngresoConIni = new ClassPageIngresoConIni(driver);
      classPageIngresoConIni.AutorizacionIngreso();
    }

}