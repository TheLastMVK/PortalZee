package Base;

import Utility.ClassUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ClassBase {

    protected WebDriver driver;
    public ClassBase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebDriver chromeDriverConnection (){
        System.setProperty("web-driver.chrome.driver", ClassUtils.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        return driver;
    }
    //Permite aislar la clase Page de los comandos de Selenium
    //si selenium web driver cambia de version y impacta en los comandos que utilizamos, solo modificamos la ClaseBase, para aislar la clase Page
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }
    //Devuelve el texto del elemento que estamos buscando a travez de ese localizador
    public String getText(WebElement element){
        return element.getText();
    }
    public void clear (By locator)  {
        driver.findElement(locator).clear();
    }
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }
    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void enter(By locator){
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }
    public Boolean isDisplayed (By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
    public void visit (String url) {
        driver.get(url);
    }

    public WebElement FindElementBYXpath(String locator) { return driver.findElement(By.xpath(locator));}
    public String getTextFromElement(WebElement el) { return el.getText(); }
    public void ClickElement(WebElement el) { el.click(); }
    public List<WebElement> FindElementsBYXpath(String locator){ return driver.findElements(By.xpath(locator)); }
    public void dropDownByValue(String value, List <WebElement> els){
        for(WebElement e :els){ if(e.getText().trim().contentEquals(value)){ e.click(); break;} }
    }

}
