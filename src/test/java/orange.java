import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class orange {

    public static void main(String[] args) throws InterruptedException {


        // creamos una variable para manejar chrome de tipo chromeoptions
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        //options.addArguments("--headless");
        //variable de tipo webdriver para manejar el navegador
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);

        // Para selenium el valor del atributo en '' simples. y el valor entre dos comillas.

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
        // Es con X path
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

     //error such element :  lelg a la linea y busca el locator y no encontro el elemento.

    }
}
