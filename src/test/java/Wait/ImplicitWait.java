package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {

        // mandar opciones al chrome.
        ChromeOptions options = new ChromeOptions();


        options.addArguments("start-maximized");
        //options.addArguments("--headless");
        //variable de tipo webdriver para manejar el navegador
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demoqa.com/dynamic-properties");

        // espera implicita. por cada elemento web esprara los segundos especificados.

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        // estamos creando un objeto de tipo webelemnt ( cualquier elemento web)
        WebElement boton5sec = driver.findElement(By.id("enableAfter"));
        if (boton5sec.isEnabled()){
            // isenable : esta habilitado
            // isdisplayed : puede estar oculto

            System.out.println("se muestra el elemento");

        }
        else{
            System.out.println("no se muestra elemento.");
        }
        boton5sec.click();



    }
}
