package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitExample {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        options.addArguments(("start-maximized"));
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://automationtesting.co.uk/loader.html");

        //creamos una variable de miwaitboton5sec , espera 15 segundos, cada 7 segundos
        // se fija si ya esta, si no se encuentra ignoralo hasta que
        // llegue a los 15 segundos.

        Wait<WebDriver> miWaitBoton5Sec = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(7))
                .ignoring(NoSuchElementException.class);



        WebElement boton = miWaitBoton5Sec.until(new Function<WebDriver, WebElement>() {
            @Override

            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("loaderBtn"));

            }
        });
           boton.click();




    }
}
