import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Bank {

    public static void main(String[] args) {

      // creamos una variable para manejar chrome de tipo chromeoptions
        ChromeOptions options = new ChromeOptions();

        // maximixando la pantalla
        options.addArguments("start-maximized");
        //options.addArguments("--headless");
       //variable de tipo webdriver para manejar el navegador
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://dbankdemo.com/bank/login");

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("submit")).click();

        // linktext encontrar el elemento por links : href
        driver.findElement(By.linkText("Sign Up Here")).click();

        //driver.findElement(By.id("title")).click();

        // creo un webelement con un alias  selectelement
        WebElement selectElement =driver.findElement(By.id("title"));

        // Declarando una variable para seleccionar un elemento del combobox
        Select comboBox=new Select(selectElement);
        comboBox.selectByValue("Ms.");




    }




}
