package PageObject;

import org.openqa.selenium.By;

public class Home {

    public By btnLupa = By.id("search-open");
    //Os xpaths foram críados e não copiados do navegador kk
    public By barraDeBusca = By.xpath("//div[@class='desktop-search']//input[@type='search']");
    public By btnPesquisar = By.xpath("//div[@class='desktop-search']//input[@value='Pesquisar']");


}
