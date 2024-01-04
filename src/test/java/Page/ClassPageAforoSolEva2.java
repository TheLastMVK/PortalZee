package Page;

import Utility.ClassUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.List;
import java.util.function.Function;
import static org.testng.AssertJUnit.assertEquals;

public class ClassPageAforoSolEva2 extends Base.ClassBase {

    By TxtDrfCod = By.xpath("(//input[contains(@class,'mat-form-field')])[3]");
    By MnuItm = By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]");
    By BtnBusDrf = By.xpath("//*[@id=\"single-spa-application:@vuce-zee/mf-aforo\"]/mf-aforo/tray-evaluacion-documentaria/mat-card/mat-card-content/mat-card/mat-card-actions/button[1]");
    By BtnRevDoc = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[11]");
    By BtnGst011 = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[8]");
    By BtnGst012 = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[11]");
    By BtnGuaSel = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[23]");
    By BtnMsnExt = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[22]");
    By BtnRegApr = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[21]");
    public static final String CabResultado = "(//span[contains(@class,'mat-select-min-line')])[2]";
    public static final String DetResultado ="//span[contains(@class,'mat-option-text')]";
    public ClassPageAforoSolEva2(WebDriver driver) {
        super(driver);
    }
    public void SolicitudEvaluacion() throws InterruptedException {

        /////////////////////////INICIO: ESPERAR OBJETO BOTON NUEVO Y OBJETO MENU/////////////////////////
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement BotonNuevo = fwait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(BtnRevDoc);
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

        /////////////////////////INICIO: ESPERAR OBJETO BOTON REGISTRAR APROBACIÓN/////////////////////////
        WebElement BotonRegistrarAprobacion = fwait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(BtnRegApr);
            }
        });
        /////////////////////////FIN: ESPERAR UN OBJETO/////////////////////////

        click(BtnRevDoc);
        Thread.sleep(2000);

        click(BtnGst011);
        Thread.sleep(2000);
        /////////LIST RESULTADO 011///////
        WebElement DpwPro011 = FindElementBYXpath(CabResultado);
        ClickElement(DpwPro011);
        Thread.sleep(1000);
        List<WebElement> LisDpwPro011 = FindElementsBYXpath(DetResultado);
        dropDownByValue(ClassUtils.EvaResDoc, LisDpwPro011);
        Thread.sleep(1000);
        click(BtnGuaSel);
        Thread.sleep(3000);
        click(BtnMsnExt);

        Thread.sleep(1500);

        click(BtnGst012);
        Thread.sleep(2000);
        /////////LIST RESULTADO 012///////
        WebElement DpwPro012 = FindElementBYXpath(CabResultado);
        ClickElement(DpwPro012);
        Thread.sleep(1000);
        List<WebElement> LisDpwPro012 = FindElementsBYXpath(DetResultado);
        dropDownByValue(ClassUtils.EvaResDoc, LisDpwPro012);
        Thread.sleep(1000);
        click(BtnGuaSel);
        Thread.sleep(3000);
        click(BtnMsnExt);
        Thread.sleep(2000);
        click(BtnRegApr);
        Thread.sleep(3000);
        click(BtnMsnExt);
    }
}