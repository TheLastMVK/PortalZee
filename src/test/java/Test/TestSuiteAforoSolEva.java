package Test;

import Page.ClassPageAforoSolEva1;
import Page.ClassPageAforoSolEva2;
import Page.ClassPageLoginAdm;
import Page.ClassPageLoginAfo;
import Utility.ClassUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuiteAforoSolEva {
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
    /*
    @Test(priority = 0, testName = "Confirmación de Logeo")
    public static void Confirmación_de_Logeo_1() throws InterruptedException{
        driver.get(ClassUtils.URL_PRINCIPAL_ZONAS_ECONOMICAS);
        ClassPageLoginAdm classPageLoginAdm = new ClassPageLoginAdm(driver);
        classPageLoginAdm.loginUser();
    }

    @Test (priority = 1, testName = "Asignar Responsable")
    private void AsignaResponsable() throws InterruptedException {
        driver.get(ClassUtils.URL_INGRESO_BANDEJA_EVALUACION);
        ClassPageAforoSolEva1 classPageAforoSolEva1 = new ClassPageAforoSolEva1(driver);
        classPageAforoSolEva1.SolicitudEvaluacion();
    }
*/
    @Test(priority = 2, testName = "Confirmación de Logeo")
    public static void Confirmación_de_Logeo_2() throws InterruptedException{
        driver.get(ClassUtils.URL_PRINCIPAL_ZONAS_ECONOMICAS);
        ClassPageLoginAfo classPageLoginAfo = new ClassPageLoginAfo(driver);
        classPageLoginAfo.loginUser();
    }

    @Test (priority = 3, testName = "Asignar Responsable")
    private void RegistrarAprobacion() throws InterruptedException {
        driver.get(ClassUtils.URL_INGRESO_BANDEJA_EVALUACION);
        ClassPageAforoSolEva2 classPageAforoSolEva2 = new ClassPageAforoSolEva2(driver);
        classPageAforoSolEva2.SolicitudEvaluacion();
    }

}
