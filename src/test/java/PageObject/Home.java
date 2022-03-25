package PageObject;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class Home {
    public List<By> mapeamento = new ArrayList<>();
    public List<String> escrever = new ArrayList<>();

    public By comboBox = By.id("switch-version-select");
    public By addRecord = By.xpath("//div[@class='floatL t5']/a");
    public By customername = By.id("field-customerName");
    public By contactLastname = By.id("field-contactLastName");
    public By contactfirstname = By.id("field-contactFirstName");
    public By phone = By.id("field-phone");
    public By addressline1 = By.id("field-addressLine1");
    public By addressline2 = By.id("field-addressLine2");
    public By city = By.id("field-city");
    public By postalcode = By.id("field-postalCode");
    public By state = By.id("field-state");
    public By country = By.id("field-country");
    public By salesrepemployeenumber = By.xpath("//*[@id='field-salesRepEmployeeNumber']");
    public By creditlimit = By.id("field-creditLimit");
    public By save = By.id("form-button-save");
    public By sucesso = By.xpath("//div[@id='report-success']/p");

    public List<By> mapearCampos() {
        mapeamento.add(customername);
        mapeamento.add(contactLastname);
        mapeamento.add(contactfirstname);
        mapeamento.add(phone);
        mapeamento.add(addressline1);
        mapeamento.add(addressline2);
        mapeamento.add(city);
        mapeamento.add(state);
        mapeamento.add(postalcode);
        mapeamento.add(country);
        mapeamento.add(salesrepemployeenumber);
        mapeamento.add(creditlimit);

        return mapeamento;
    }
    public List<String> digitacoes() {
        escrever.add("Teste Sicredi");
        escrever.add("Teste");
        escrever.add("Bruno");
        escrever.add("51 9999-9999");
        escrever.add("Av Assis Brasil, 3970");
        escrever.add("Torre D");
        escrever.add("Porto Alegre");
        escrever.add("RS");
        escrever.add("91000-000");
        escrever.add("Brasil");
        escrever.add("100");
        escrever.add("200");

        return escrever;
    }


}
