package Utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Config.Hook.navegador;
import java.io.IOException;

public class Utils {


    public static void clicar(By by) throws InterruptedException, IOException {
        navegador.findElement(by).click();
    }
    public static void escrever(By by, String msg) {
        navegador.findElement(by).sendKeys(msg);
    }
    public static void selecionarComboBox(By by, String texto) {
        WebElement selectElement = navegador.findElement(by);
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText(texto);
    }
    public static String copiarTextoDaTela(By by) {
        return navegador.findElement(by).getText();
    }
    public static void compararTextos(String valorEsperado, String valorAtual) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(valorEsperado, valorAtual);
        navegador.quit();
    }
    public static void esperarElementoAparecer(By by) {
        WebElement myDynamicElement = (new WebDriverWait(navegador, 10))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
