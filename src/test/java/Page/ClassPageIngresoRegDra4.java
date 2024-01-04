package Page;


import Base.ClassBase;
import Utility.ClassUtils;
import org.openqa.selenium.*;

import java.util.List;

public class ClassPageIngresoRegDra4 extends ClassBase {


    public static final String CabDatDoc = "(//span[contains(@class,'mat-select-min-line')])[1]";
    public static final String DetDatDoc ="//span[contains(@class,'mat-option-text')]";
    By BtnExaDoc = By.xpath("//*[@id=\"single-spa-application:@vuce-zee/mf-ingreso\"]/mf-ingreso/ingreso-nuevo/div/div/mat-card/mat-card-content/ingreso-documentacion/div/div/mat-card[1]/form/div[1]/div/button[1]/input");
    By BtnCarDoc = By.xpath("//*[@id=\"single-spa-application:@vuce-zee/mf-ingreso\"]/mf-ingreso/ingreso-nuevo/div/div/mat-card/mat-card-content/ingreso-documentacion/div/div/mat-card[1]/form/div[1]/div/button[2]");
    By BtnExaOtr = By.xpath("//*[@id=\"single-spa-application:@vuce-zee/mf-ingreso\"]/mf-ingreso/ingreso-nuevo/div/div/mat-card/mat-card-content/ingreso-documentacion/div/div/mat-card[2]/form/div/div/button[1]/input");
    By BtnCarOtr = By.xpath("//*[@id=\"single-spa-application:@vuce-zee/mf-ingreso\"]/mf-ingreso/ingreso-nuevo/div/div/mat-card/mat-card-content/ingreso-documentacion/div/div/mat-card[2]/form/div/div/button[2]/span[1]");
    By BtnEnviar = By.xpath("//*[@id=\"single-spa-application:@vuce-zee/mf-ingreso\"]/mf-ingreso/ingreso-nuevo/div/div/mat-card/mat-card-content/ingreso-documentacion/div/div/div[3]/button[3]");
    By BtnConfir = By.xpath("//*[@id=\"mat-dialog-12\"]/ingreso-dialog-confirm-local/mat-dialog-actions/button[2]");
    By MsgRegNum = By.xpath("//*[@id=\"mat-dialog-14\"]/ingreso-dialog-draft/mat-dialog-content/div/div[2]");
    By MsgOrdPAg = By.xpath("//*[@id=\"mat-dialog-14\"]/ingreso-dialog-draft/mat-dialog-content/div/div[3]");
    By BtnMsgAce = By.xpath("//*[@id=\"mat-dialog-14\"]/ingreso-dialog-draft/mat-dialog-actions/button");

    public ClassPageIngresoRegDra4(WebDriver driver) {
        super(driver);
    }

    public void Documentacion() throws InterruptedException {

        /////////LIST TIPO DOCUMENTO 011///////
        WebElement DpwDoc011 = FindElementBYXpath(CabDatDoc);
        ClickElement(DpwDoc011);
        Thread.sleep(500);
        List<WebElement> LisDoc011 = FindElementsBYXpath(DetDatDoc);
        dropDownByValue(ClassUtils.DrfDoc011, LisDoc011);
        Thread.sleep(1000);

        ////////////ADJUNTAR DOCUMENTO 011////////////////////
        type(ClassUtils.DrfRut011,BtnExaDoc);
        click(BtnCarDoc);
        Thread.sleep(10000);

        /////////LIST TIPO DOCUMENTO 012///////
        WebElement DpwDoc012 = FindElementBYXpath(CabDatDoc);
        ClickElement(DpwDoc012);
        Thread.sleep(500);
        List<WebElement> LisDoc012 = FindElementsBYXpath(DetDatDoc);
        dropDownByValue(ClassUtils.DrfDoc012, LisDoc012);
        Thread.sleep(1000);

        ////////////ADJUNTAR DOCUMENTO 012////////////////////
        type(ClassUtils.DrfRut012,BtnExaDoc);
        click(BtnCarDoc);
        Thread.sleep(10000);

        ////////////ADJUNTAR OTRO DOCUMENTO////////////////////
        type(ClassUtils.DrfRutOtr,BtnExaOtr);
        click(BtnCarOtr);
        Thread.sleep(3000);

        click(BtnEnviar);
        Thread.sleep(1000);
        click(BtnConfir);
        Thread.sleep(15000);


        ClassUtils.DrfRegNum = driver.findElement(MsgRegNum).getText().split("Su número de registro DRAFT es: ")[1];
        System.out.println("Obtienes Numero Draft: " + ClassUtils.DrfRegNum);

        ClassUtils.DrfOrdPag = driver.findElement(MsgOrdPAg).getText().split("Las órdenes de pago son: ")[1];
        System.out.println("Obtienes Orden: " + ClassUtils.DrfOrdPag);

        click(BtnMsgAce);

    }

}
