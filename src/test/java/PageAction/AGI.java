package PageAction;

import PageObject.Home;
import Utils.Utils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;

import static Config.Hook.navegador;

public class AGI {

    Utils utils = new Utils();
    Home home = new Home();

    public void VerificarMudancaDePaginaAoPesquisar() throws IOException, InterruptedException {
        navegador.get("https://blogdoagi.com.br/");
        utils.clicar(home.btnLupa);
        utils.escrever(home.barraDeBusca, "Renda");
        utils.clicar(home.btnPesquisar);
        String páginaAtual = navegador.getCurrentUrl();
        Assert.assertEquals("https://blogdoagi.com.br/?s=Renda", páginaAtual);
    }

    public void validarSeBotaoPesquisarContinuaDisponivel() throws IOException, InterruptedException {

        navegador.get("https://blogdoagi.com.br/");

        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("scrollBy(0,500)", "");

        utils.clicar(home.btnPesquisar);
    }

}
