import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Ripley {
    public static void main(String[] args) throws InterruptedException {

        // creamos una variable para manejar chrome de tipo chromeoptions
        ChromeOptions options = new ChromeOptions();

        // maximixando la pantalla
        options.addArguments("start-maximized");
        //options.addArguments("--headless");
        //variable de tipo webdriver para manejar el navegador
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://simple.ripley.com.pe/");

        // Declarando un objeto de tipo action llmaddo mouseover
        Actions mouseover= new Actions(driver);
        mouseover.moveToElement(driver.findElement(By.cssSelector("div[class='MinuMenuOption_a__3H_v2']"))).build().perform();
        Thread.sleep(2000);
    }

}
