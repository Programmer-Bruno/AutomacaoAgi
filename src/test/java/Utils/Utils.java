package Utils;

import PageObject.Home;
import Utils.Utils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static Config.Hook.navegador;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Utils {


    public void clicar(By by) throws InterruptedException, IOException {
        navegador.findElement(by).click();
    }
    public void escrever(By by, String msg) {
        navegador.findElement(by).sendKeys(msg);
    }
}
