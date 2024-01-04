package Page;

import Utility.ClassUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import static org.testng.AssertJUnit.assertEquals;

public class ClassPageIngresoConIni extends Base.ClassBase {

    By TxtDrfCod = By.xpath("(//input[contains(@class,'mat-form-field')])[1]");
    By MnuItm = By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]");
    By BtnBusDrf = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[4]");
    By BtnConVeh = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[11]");
    By BtnVerMer = By.xpath("(//button[contains(@class,'p-0')])[1]");
    By BtnAutIng = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[14]");
    By BtnCanIng = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[18]");
    By BtnCnfAcc = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[21]");
    By TxtAutIng = By.xpath("(//table[contains(@class,'mat-table')])[1]//td[1]");

    public ClassPageIngresoConIni(WebDriver driver) {
        super(driver);
    }
    public void AutorizacionIngreso() throws InterruptedException {

        /////////////////////////INICIO: ESPERAR OBJETO BOTON NUEVO Y OBJETO MENU/////////////////////////
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement BotonNuevo = fwait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(BtnConVeh);
            }
        });
        WebElement Menu = fwait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(MnuItm);
            }
        });
        /////////////////////////FIN: ESPERAR UN OBJETO/////////////////////////
        if(isDisplayed(TxtDrfCod)){
            type(ClassUtils.DrfRegNum,TxtDrfCod);
            Thread.sleep(1000);
            click(BtnBusDrf);
        }else  {
            System.out.println("Demora en la carga de los controles");
        }

        Thread.sleep(3000);
        click(BtnConVeh);
        Thread.sleep(3000);

        click(BtnVerMer);
        Thread.sleep(3000);

        click(BtnAutIng);
        Thread.sleep(3000);

        click(BtnCanIng);
        Thread.sleep(3000);

        click(BtnCnfAcc);
        Thread.sleep(3000);

        ClassUtils.ConAutIng = driver.findElement(TxtAutIng).getText();


    }
}