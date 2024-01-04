package Page;
import Utility.ClassUtils;
import org.openqa.selenium.*;

import java.util.List;

public class ClassPageIngresoRegDra2 extends Base.ClassBase {

    By BtnAdrTra= By.xpath("(//span[contains(@class,'mat-button-wrapper')])[4]");
    By TxtNroTar= By.id("mat-input-16");
    By TxtRazSoc = By.id("mat-input-20");
    By TxtNroPlc = By.id("mat-input-17");
    By TxtNomChf = By.id("mat-input-21");
    By TxtNroCon = By.id("mat-input-22");
    By TxtNroBul = By.id("mat-input-23");
    By TxtTarKgs = By.id("mat-input-24");
    By TxtNroPre = By.id("mat-input-25");

    By BtnAdrCon = By.xpath("//*[@id=\"mat-dialog-3\"]/menu-dialogelementsexampledialog/div/form/div[3]/button/span[1]");
    By BtnAdrAct = By.xpath("//*[@id=\"mat-dialog-3\"]/menu-dialogelementsexampledialog/div/div[2]/button[2]");
    By BtnConTra = By.xpath("//*[@id=\"mat-dialog-4\"]/ingreso-dialog-confirm-local/mat-dialog-actions/button[2]/span[1]");
    By BtnSgt= By.xpath("(//span[contains(@class,'mat-button-wrapper')])[12]");
    public static final String CabTipCon = "(//span[contains(@class,'mat-select-min-line')])[1]";
    public static final String DetTipCon ="//span[contains(@class,'mat-option-text')]";


    public ClassPageIngresoRegDra2(WebDriver driver) {
        super(driver);
    }
    public void DatosTransporte() throws InterruptedException {
        click(BtnAdrTra);
        type(ClassUtils.DrfNroTar,TxtNroTar);


        type(ClassUtils.DrfNroPlc,TxtNroPlc);
        Thread.sleep(1500);
        driver.findElement(TxtNroPlc).sendKeys(Keys.ENTER);

        //type(ClassUtils.DrfRazSoc,TxtRazSoc);
        //Thread.sleep(1500);
        //driver.findElement(TxtRazSoc).sendKeys(Keys.ENTER);

        type(ClassUtils.DrfNomChf,TxtNomChf);
        Thread.sleep(1500);
        driver.findElement(TxtNomChf).sendKeys(Keys.ENTER);

        /////////LIST TIPO DE CONTENEDOR///////
        WebElement DpwTipCon = FindElementBYXpath(CabTipCon);
        ClickElement(DpwTipCon);
        Thread.sleep(500);
        List<WebElement> LisDpwTipCon = FindElementsBYXpath(DetTipCon);
        dropDownByValue(ClassUtils.DrfTipCon, LisDpwTipCon);
        Thread.sleep(1000);

        type(ClassUtils.DrfNroCon,TxtNroCon);
        type(ClassUtils.DrfNroBul,TxtNroBul);
        type(ClassUtils.DrfTarKgs,TxtTarKgs);
        type(ClassUtils.DrfNroPre,TxtNroPre);
        click(BtnAdrCon);
        Thread.sleep(2000);
        click(BtnAdrAct);
        Thread.sleep(2000);
        click(BtnConTra);
        Thread.sleep(2000);
        click(BtnSgt);
        Thread.sleep(2000);


    }
}
