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
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--kiosk");
        navegador = new ChromeDriver(options);
        return navegador;
    }

    @After
    public void fechar() {
        navegador.close();
    }

}
