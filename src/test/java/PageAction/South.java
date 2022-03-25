package PageAction;

import PageObject.Home;
import Utils.Utils;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Utils.Utils.*;

public class South {
    Home home = new Home();
    List<By> mapeamentos = home.mapearCampos();
    List<String> escrever = home.digitacoes();

    public void inclusaoFormulario() throws IOException, InterruptedException {
        selecionarComboBox(home.comboBox, "Bootstrap V4 Theme");
        clicar(home.addRecord);

        for (int i = 0; i <= 11; i++) {
            escrever(mapeamentos.get(i), escrever.get(i));
        }

        clicar(home.save);

        esperarElementoAparecer(home.sucesso);

        compararTextos("Your data has been successfully " +
                "stored into the database. Edit Record or Go back to list", copiarTextoDaTela(home.sucesso));


    }

}
