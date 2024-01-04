package Test;

import Page.ClassPageIngresoRegDra1;
import Page.ClassPageIngresoRegDra2;
import Page.ClassPageIngresoRegDra3;
import Page.ClassPageIngresoRegDra4;
import Page.ClassPageLoginUser;
import Utility.ClassUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuiteIngresoRegDra {
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
        ClassPageLoginUser classPageLoginUser = new ClassPageLoginUser(driver);
        classPageLoginUser.loginUser();
    }

    @Test (priority = 1, testName = "Datos de Ingreso")
    private void RegistroDraft1() throws InterruptedException {
        driver.get(ClassUtils.URL_INGRESO_BANDEJA_REGISTRO_DRAFT);
        ClassPageIngresoRegDra1 classPageIngresoRegDra1 = new ClassPageIngresoRegDra1(driver);
        classPageIngresoRegDra1.DatosIngreso();
    }

    @Test (priority = 2, testName = "Datos de Transporte")
    private void RegistroDraft2() throws InterruptedException {
        ClassPageIngresoRegDra2 classPageIngresoRegDra2 = new ClassPageIngresoRegDra2(driver);
        classPageIngresoRegDra2.DatosTransporte();
    }

    @Test (priority = 3, testName = "Detalle de Mercancia")
    private void RegistroDraft3() throws InterruptedException {
        ClassPageIngresoRegDra3 classPageIngresoRegDra3 = new ClassPageIngresoRegDra3(driver);
        classPageIngresoRegDra3.DetalleMercancia();
    }

    @Test (priority = 4, testName = "Documentación")
    private void RegistroDraft4() throws InterruptedException {
        ClassPageIngresoRegDra4 classPageIngresoRegDra4 = new ClassPageIngresoRegDra4(driver);
        classPageIngresoRegDra4.Documentacion();
    }

}
