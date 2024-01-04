package Page;

import Base.ClassBase;
import Utility.ClassUtils;
import org.openqa.selenium.*;

import java.util.List;

public class ClassPageIngresoRegDra3 extends ClassBase {
    public static final String CabPlaCon = "(//span[contains(@class,'mat-select-min-line')])[1]";
    public static final String DetPlaCon ="//span[contains(@class,'mat-option-text')]";
    By TxtDcpDcT = By.id("mat-input-26");
    By TxtDetSec = By.id("mat-input-27");
    public static final String CabDepDes = "(//span[contains(@class,'mat-select-min-line')])[2]";
    public static final String DetDepDes ="//span[contains(@class,'mat-option-text')]";
    public static final String CabDetCsg = "//*[@id=\"single-spa-application:@vuce-zee/mf-ingreso\"]/mf-ingreso/ingreso-nuevo/div/div/mat-card/mat-card-content/menu-datos-mercancia/div/div/form/section[3]/section[3]/mat-form-field/div/div[1]/div[3]/div";
    public static final String DetDetCsg = "//span[contains(@class,'mat-option-text')]";
    By TxtDetBul = By.id("mat-input-33");
    By TxtDetPes = By.id("mat-input-30");
    public static final String CabDetMed = "(//span[contains(@class,'mat-select-min-line')])[3]";
    public static final String DetDetMed ="//span[contains(@class,'mat-option-text')]";
    By TxtDetFob= By.id("mat-input-34");
    By TxtDetMer = By.id("mat-input-31");
    By BtnAdrMer= By.xpath("(//span[contains(@class,'mat-button-wrapper')])[4]");
    By BtnSgt= By.xpath("(//span[contains(@class,'mat-button-wrapper')])[13]");
    public ClassPageIngresoRegDra3(WebDriver driver) {
        super(driver);
    }
    public void DetalleMercancia() throws InterruptedException {

        /////////LIST PLACA CONTENEDOR///////
        WebElement DpwPlaCon = FindElementBYXpath(CabPlaCon);
        ClickElement(DpwPlaCon);
        Thread.sleep(500);
        List<WebElement> LisPlaCon = FindElementsBYXpath(DetPlaCon);
        dropDownByValue(ClassUtils.DrfPlcCon, LisPlaCon);
        Thread.sleep(1000);

        type(ClassUtils.DrfDcpDct,TxtDcpDcT);
        type(ClassUtils.DrfDetSec,TxtDetSec);

        /////////LIST DEPOSITO DESTINO///////
        WebElement DpwDepDes = FindElementBYXpath(CabDepDes);
        ClickElement(DpwDepDes);
        Thread.sleep(500);
        List<WebElement> LisDepDes = FindElementsBYXpath(DetDepDes);
        dropDownByValue(ClassUtils.DrfDepDes, LisDepDes);
        Thread.sleep(1000);

        /////////LIST CONSIGNATARIO///////
        WebElement DpwDetCsg = FindElementBYXpath(CabDetCsg);
        ClickElement(DpwDetCsg);
        Thread.sleep(500);
        List<WebElement> LisDetCsg = FindElementsBYXpath(DetDetCsg);
        dropDownByValue(ClassUtils.DrfDetCsg, LisDetCsg);
        Thread.sleep(1000);

        type(ClassUtils.DrfDetBul,TxtDetBul);
        type(ClassUtils.DrfDetPes,TxtDetPes);

        /////////LIST UNIDAD DE MEDIDA///////
        WebElement DpwDetMed = FindElementBYXpath(CabDetMed);
        ClickElement(DpwDetMed);
        Thread.sleep(500);
        List<WebElement> LisDetMed = FindElementsBYXpath(DetDetMed);
        dropDownByValue(ClassUtils.DrfDetMed, LisDetMed);
        Thread.sleep(1000);

        type(ClassUtils.DrfDetFob,TxtDetFob);
        type(ClassUtils.DrfDetMer,TxtDetMer);
        Thread.sleep(1000);

        click(BtnAdrMer);
        Thread.sleep(2000);
        click(BtnSgt);
        Thread.sleep(2000);
    }
}