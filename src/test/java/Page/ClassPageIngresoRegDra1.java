package Page;

import Utility.ClassUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class ClassPageIngresoRegDra1 extends Base.ClassBase{
    By BtnNewDrf = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[6]");
    By DpkFecDoc = By.id("mat-input-8");
    By DpkMntYr = By.id("mat-calendar-button-0");
    By DpkDay = By.xpath("(//div[contains(@class,'mat-calendar-body-cell-content')])["+ClassUtils.DrfNumDia+"]");
    By DpkRgtArr = By.xpath("//*[@id=\"mat-datepicker-1\"]/mat-calendar-header/div/div/button[3]");
    By TxtCorDoc = By.id("mat-input-13");
    By TxtBulDcl = By.id("mat-input-14");
    By TxtPesDcl = By.id("mat-input-10");
    By TxtDesMer = By.id("mat-input-11");
    By BtnSgtP01= By.xpath("(//span[contains(@class,'mat-button-wrapper')])[9]");

    public static final String CabProcedencia = "(//span[contains(@class,'mat-select-min-line')])[1]";
    public static final String DetProcedencia ="//span[contains(@class,'mat-option-text')]";
    public static final String CabLugarIngreso = "(//span[contains(@class,'mat-select-min-line')])[2]";
    public static final String DetLugarIngreso ="//span[contains(@class,'mat-option-text')]";
    public static final String CabTramite = "(//span[contains(@class,'mat-select-min-line')])[3]";
    public static final String DetTramite ="//span[contains(@class,'mat-option-text')]";
    public static final String CabVia = "(//span[contains(@class,'mat-select-min-line')])[4]";
    public static final String DetVia ="//span[contains(@class,'mat-option-text')]";
    public static final String CabTipDoc = "(//span[contains(@class,'mat-select-min-line')])[5]";
    public static final String DetTipDoc ="//span[contains(@class,'mat-option-text')]";
    public static final String CabAnoDoc = "(//span[contains(@class,'mat-select-min-line')])[6]";
    public static final String DetAnoDoc ="//span[contains(@class,'mat-option-text')]";
    public static final String CabCatDoc = "(//span[contains(@class,'mat-select-min-line')])[7]";
    public static final String DetCatDoc ="//span[contains(@class,'mat-option-text')]";
    public static final String CabTipMer = "(//span[contains(@class,'mat-select-min-line')])[8]";
    public static final String DetTipMer ="//span[contains(@class,'mat-option-text')]";
    public static final String CabUndMed = "(//span[contains(@class,'mat-select-min-line')])[9]";
    public static final String DetUndMed ="//span[contains(@class,'mat-option-text')]";
    By MnuItm = By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]");


    public ClassPageIngresoRegDra1(WebDriver driver) {
        super(driver);
    }
    public void DatosIngreso() throws InterruptedException {

        /////////////////////////INICIO: ESPERAR OBJETO BOTON NUEVO Y OBJETO MENU/////////////////////////
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement BotonNuevo = fwait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(BtnNewDrf);
            }
        });
        WebElement Menu = fwait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(MnuItm);
            }
        });
        /////////////////////////FIN: ESPERAR UN OBJETO/////////////////////////
        if(isDisplayed(BtnNewDrf)){
            //Thread.sleep(10000);
            click(BtnNewDrf);
            Thread.sleep(3000);
        }else  {
            System.out.println("Demora en la carga de los controles");
        }


        //control para el calendario
        click(DpkFecDoc);
        String MesAnio =  getText(DpkMntYr);
        Thread.sleep(1000);
        while (!(MesAnio.equals(ClassUtils.DrfMesAno))){
            click(DpkRgtArr);
            MesAnio =  getText(DpkMntYr);
        }
        click(DpkDay);


        /////////LIST PROCEDENCIA///////
        WebElement DpwPro = FindElementBYXpath(CabProcedencia);
        ClickElement(DpwPro);
        Thread.sleep(1000);
        List<WebElement> LisDpwPro = FindElementsBYXpath(DetProcedencia);
        dropDownByValue(ClassUtils.DrfTipPrd, LisDpwPro);
        Thread.sleep(1000);

        /////////LIST LUGAR INGRESO///////
        WebElement DpwLug = FindElementBYXpath(CabLugarIngreso);
        ClickElement(DpwLug);
        Thread.sleep(1000);
        List<WebElement> LisDpwLug = FindElementsBYXpath(DetLugarIngreso);
        dropDownByValue(ClassUtils.DrfLugIng, LisDpwLug);
        Thread.sleep(1000);

        /////////LIST TRAMITE///////
        WebElement DpwTra = FindElementBYXpath(CabTramite);
        ClickElement(DpwTra);
        Thread.sleep(1000);
        List<WebElement> LisTra = FindElementsBYXpath(DetTramite);
        dropDownByValue(ClassUtils.DrfTipTra1, LisTra);
        dropDownByValue(ClassUtils.DrfTipTra2, LisTra);
        dropDownByValue(ClassUtils.DrfTipTra3, LisTra);
        dropDownByValue(ClassUtils.DrfTipTra4, LisTra);
        Thread.sleep(1000);
                WebElement element = driver.findElement(By.className("mat-button-wrapper"));
                Actions actions = new Actions(driver);
                actions.moveToElement(element).click().build().perform();
        Thread.sleep(1000);

        /////////LIST VIA///////
        WebElement DpwVia = FindElementBYXpath(CabVia);
        ClickElement(DpwVia);
        Thread.sleep(1000);
        List<WebElement> LisVia = FindElementsBYXpath(DetVia);
        dropDownByValue(ClassUtils.DrfTipVia, LisVia);
        Thread.sleep(1000);

        /////////LIST TIPO DEL DOCUMENTO///////
        WebElement DpwTipDoc = FindElementBYXpath(CabTipDoc);
        ClickElement(DpwTipDoc);
        Thread.sleep(1000);
        List<WebElement> LisTipDoc = FindElementsBYXpath(DetTipDoc);
        dropDownByValue(ClassUtils.DrfTipDoc, LisTipDoc);
        Thread.sleep(1000);

        /////////LIST AÑO DEL DOCUMENTO///////
        WebElement DpwAnoDoc = FindElementBYXpath(CabAnoDoc);
        ClickElement(DpwAnoDoc);
        Thread.sleep(1000);
        List<WebElement> LisAnoDoc = FindElementsBYXpath(DetAnoDoc);
        dropDownByValue(ClassUtils.DrfAnoDoc, LisAnoDoc);
        Thread.sleep(1000);

        /////////LIST CATEGORIA DEL DOCUMENTO///////
        WebElement DpwCatDoc = FindElementBYXpath(CabCatDoc);
        ClickElement(DpwCatDoc);
        Thread.sleep(1000);
        List<WebElement> LisCatDoc = FindElementsBYXpath(DetCatDoc);
        dropDownByValue(ClassUtils.DrfCatDoc, LisCatDoc);
        Thread.sleep(1000);

        type(ClassUtils.DrfCorDoc,TxtCorDoc);

        /////////LIST TIPO DE MERCANCIA///////
        WebElement DpwTipMer = FindElementBYXpath(CabTipMer);
        ClickElement(DpwTipMer);
        Thread.sleep(1000);
        List<WebElement> LisTipMer = FindElementsBYXpath(DetTipMer);
        dropDownByValue(ClassUtils.DrfTipMer, LisTipMer);
        Thread.sleep(1000);

        type(ClassUtils.DrfBulDcl,TxtBulDcl);
        type(ClassUtils.DrfPesDcl,TxtPesDcl);

        /////////LIST UNIDAD DE MEDIDA///////
        WebElement DpwUndMed = FindElementBYXpath(CabUndMed);
        ClickElement(DpwUndMed);
        Thread.sleep(1000);
        List<WebElement> LisUndMed = FindElementsBYXpath(DetUndMed);
        dropDownByValue(ClassUtils.DrfUndMed, LisUndMed);
        Thread.sleep(1000);

        type(ClassUtils.DrfDesMer,TxtDesMer);
        click(BtnSgtP01);
        Thread.sleep(2000);
    }
    public String isPageLoginDisplayed() {
        return driver.getTitle();
    }

}