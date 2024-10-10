package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class ExplicitWait {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/dynamic-properties");


// declaramos un objeto de tipo wait de tipo explicit
        WebDriverWait waitdeboton = new WebDriverWait(driver, Duration.ofSeconds(7));

        waitdeboton.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

       // el gettext coge el texto del elemento.
        String texto = driver.findElement(By.id("visibleAfter")).getText();
        System.out.println(texto);

       WebDriverWait waitdebotoncolor = new WebDriverWait(driver,Duration.ofSeconds(9));
       waitdebotoncolor.until(ExpectedConditions.visibilityOfElementLocated(By.id("colorChange")));

        String textocolor = driver.findElement(By.id("visibleAfter")).getText();
        System.out.println(textocolor);

      // solo pa ra capturar el texto
        String titulopagina = driver.findElement(By.xpath("//h1[contains(text(),'Dynamic Properties')]")).getText();
        System.out.println(titulopagina);

        if (Objects.equals(titulopagina, "Dynamic Propertiex"))
            System.out.println("prueba exitosa");
        else
            System.out.println("fallo la prueba");

    }

}
