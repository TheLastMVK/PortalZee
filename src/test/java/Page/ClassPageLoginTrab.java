package Page;

import Base.ClassBase;
import Utility.ClassUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.function.Function;
public class ClassPageLoginTrab extends ClassBase{
    By BtnLogSnt = By.className("btn-primary");
    By TxtUsrZee = By.name("username");
    By TxtPasZee = By.name("password");
    By BtnLogZee = By.className("btn-danger");
    By MnuItm = By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]");


    public ClassPageLoginTrab(WebDriver driver) {
        super(driver);
    }
    public void loginUser() throws InterruptedException {

        if(isDisplayed(BtnLogSnt)){
            do{
                type(ClassUtils.ZeeUsrTra,TxtUsrZee);
                type(ClassUtils.ZeePasTra,TxtPasZee);
                click(BtnLogZee);
                Thread.sleep(2000);
            }while (isDisplayed(BtnLogSnt));
        }else  {
            System.out.println("Login page was not found");
        }
        /////////////////////////INICIO: ESPERAR UN OBJETO/////////////////////////
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement Menu = fwait.until(new Function <WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(MnuItm);
            }
        });
        /////////////////////////FIN: ESPERAR UN OBJETO/////////////////////////

        if(isDisplayed(MnuItm)){

            click(MnuItm);
            Thread.sleep(2000);


        }else  {
            System.out.println("No se Carga el Menú");
        }
    }
    public String isPageLoginDisplayed() {
        return driver.getTitle();
    }
}