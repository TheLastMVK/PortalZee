package Page;

import Utility.ClassUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import static org.testng.AssertJUnit.assertEquals;

public class ClassPageAforoSolEva1 extends Base.ClassBase {

    By TxtDrfCod = By.xpath("(//input[contains(@class,'mat-form-field')])[4]");
    By MnuItm = By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]");
    By BtnBusDrf = By.xpath("//*[@id=\"single-spa-application:@vuce-zee/mf-aforo\"]/mf-aforo/tray-evaluacion-documentaria/mat-card/mat-card-content/mat-card/mat-card-actions/button[1]");
    By BtnAccAsg = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[12]");
    By ChkDisMnn = By.xpath("//*[@id=\"mat-checkbox-1\"]");
    By ChkDisTrd = By.xpath("//*[@id=\"mat-checkbox-2\"]");
    By ChkDisNch = By.xpath("//*[@id=\"mat-checkbox-3\"]");
    By BtnAsgAfo = By.xpath("//*[@id=\"single-spa-application:@vuce-zee/mf-aforo\"]/mf-aforo/form-reasign-aforador/mat-card/mat-card-content/form/mat-card[3]/div[2]/button");
    By BtnGuaSel = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[8]");
    By BtnGuaAsg = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[7]");
    By BtnCnfAsg = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[9]");

    public ClassPageAforoSolEva1(WebDriver driver) {
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
                return driver.findElement(BtnAccAsg);
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
         click(BtnAccAsg);
        Thread.sleep(3000);

        if (ClassUtils.EvaDisMnn == "ON"){
            click (ChkDisMnn);
        };
        if (ClassUtils.EvaDisTrd == "ON"){
            click (ChkDisTrd);
        };
        if (ClassUtils.EvaDisNch == "ON"){
            click (ChkDisNch);
        };

        click(BtnAsgAfo);
        Thread.sleep(3000);

        //List<WebElement> allEvaluators = driver.findElements(By.xpath("(//tbody[contains(@role,'rowgroup')])[2]"));
        List<WebElement> allEvaluators = driver.findElements(By.xpath("(//table[contains(@class,'mat-table')])[2]//td[1]"));

        int numeroFila = 0 ;
        for(WebElement i:allEvaluators)
        {
            String value = i.getText();
            numeroFila = numeroFila + 1;
            System.out.println(value);
            if(value.contains(ClassUtils.EvaDisAfo)){
                System.out.println(numeroFila);
                break;
            }
        }
        click(By.xpath("((//table[contains(@class,'mat-table')])[2]//td[2])["+numeroFila+"]"));
        click(BtnGuaSel);
        Thread.sleep(2000);
        click(BtnGuaAsg);
        Thread.sleep(2000);
        click(BtnCnfAsg);
    }
}