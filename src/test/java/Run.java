import PageAction.AGI;
import PageObject.Home;
import Utils.Utils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;

import static Config.Hook.navegador;

public class Run {
    AGI agi = new AGI();

    @Test
    public void validarPesquisa() throws InterruptedException, IOException {
        agi.VerificarMudancaDePaginaAoPesquisar();
    }

    @Test
    public void validarSeBotaoFuncionaAposScroll() throws InterruptedException, IOException {
        agi.validarSeBotaoPesquisarContinuaDisponivel();
    }

}
