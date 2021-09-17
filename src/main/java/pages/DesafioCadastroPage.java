package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DesafioCadastroPage extends BasePage {


    public DesafioCadastroPage(WebDriver driver) {
        super(driver);
    }

    //mostrar
    @FindBy(id = "elementosForm:nome")
    private WebElement nomeTextField;
    @FindBy(id = "elementosForm:sobrenome")
    private WebElement sobrenomeTextField;
    @FindBy(id = "elementosForm:cadastrar")
    private WebElement cadastrarButton;

    public DesafioCadastroPage preencherNome(String nome) {
        nomeTextField.sendKeys(nome);
        return this;
    }
    public DesafioCadastroPage preencherSobrenome(String sobrenome) {
        sobrenomeTextField.sendKeys(sobrenome);
        return this;
    }
    public DesafioCadastroPage clicarCadastrar() {
        cadastrarButton.click();
        return this;
    }




}
