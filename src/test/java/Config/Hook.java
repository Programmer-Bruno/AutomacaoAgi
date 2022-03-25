package Config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hook {

    public static WebDriver navegador = driver();

    @Before
    public static WebDriver driver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
        return navegador;
    }

    @After
    public void fechar() {
        navegador.quit();
    }

}
